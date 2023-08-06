package ui.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import ui.pages.BasePage;

import java.util.List;
import java.util.Random;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyField;

    @FindBy(xpath = "//input[@name='street[0]']")
    public WebElement streetAddressField;


    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityField;

    @FindBy(xpath = "(//select[@class='select'])[1]")
    public WebElement selectStateInput;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement zipField;

    @FindBy(xpath = "(//input[@class='input-text'])[12]")
    public WebElement phoneNumberField;
    @FindBy(xpath = "(//select[@class='select'])[1]")
    public WebElement selectCountryInput;


    @FindBy(xpath = "//input[@class='radio']")
    public WebElement shippingMethodsField;


    @FindBy(xpath = "//span[normalize-space()='Next']")
    public WebElement clickNextField;

    public BasketPage selectState() {
        Select select = new Select(selectStateInput);
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        int index = random.nextInt(options.size());
        select.selectByIndex(index);
        return this;
    }


    public BasketPage selectCountry() {
        Select select = new Select(selectCountryInput);
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        int index = random.nextInt(options.size());
        select.selectByIndex(index);
        return this;
    }

    public BasketPage enterCompany(String company) {
        elementActions.writeText(companyField, company);
        return this;
    }

    public BasketPage enterStreetAddress(String street) {
        elementActions.writeText(streetAddressField, street);
        return this;
    }

    public BasketPage enterCity(String city) {
        elementActions.writeText(cityField, city);
        return this;
    }

    public BasketPage enterZipPostCode(String postCode) {
        elementActions.writeText(zipField, postCode);
        return this;
    }

    public BasketPage enterPhoneNumber(String phoneNumber) {
        elementActions.writeText(phoneNumberField, phoneNumber);
        return this;
    }

    public BasketPage chooseMethodOfShipping() {
        elementActions.clickTheButton(shippingMethodsField);
        return this;
    }

    public BasketPage clickTheBtnNext() {
        elementActions.clickTheButton(clickNextField);
        return this;
    }

}
