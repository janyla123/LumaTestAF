package ui.models;


import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.BasePage;

public class CustomerAccountPage extends BasePage {



    @FindBy(id = " //div[@class='panel header']//a[contains(text(),'Sign In')]")
    public WebElement signInBtn;
    @FindBy(id = "firstname")
    public WebElement userFirstName;
    @FindBy(id = "lastname")
    public WebElement userLastName;
    @FindBy(xpath = "//input[@name='is_subscribed']")
    public WebElement signUpForNewsLetterInput;
    @FindBy(id = "email_address")
    public WebElement userEmail;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement userPassword;
    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createAccountBtn;

// вход
    @FindBy(xpath = "//input[@id='email']")
    public WebElement userEmailField;


    @FindBy(xpath = "//input[@id='pass']")
    public WebElement userPasswordField;


    @FindBy(id = "send2")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement errorMessageLoginIn;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBtn;




    public CustomerAccountPage enterFirstName(String firstName) {
        elementActions.writeText(userFirstName, firstName);
        return this;
    }

    public CustomerAccountPage enterLastName(String lastName) {
        elementActions.writeText(userLastName, lastName);
        return this;
    }


    public CustomerAccountPage enterEmail(String email) {
        elementActions.writeText(userEmail, email);
        return this;
    }

    public CustomerAccountPage enterPassword(String password) {
        elementActions.writeText(userPassword, password);
        return this;
    }

    public CustomerAccountPage enterPasswordAndConfirm(String password) {
        confirmPassword.sendKeys(password);
        return this;
    }

    public CustomerAccountPage clickTheButton() {
        createAccountBtn.click();
        return this;
    }

    public CustomerAccountPage clickLoginBtn() {
        elementActions.clickTheButton(loginBtn);
        return this;
    }

    public CustomerAccountPage enterEmailLoginIn(String email) {
        elementActions.writeText(userEmailField, email);
        return this;
    }
    public CustomerAccountPage enterPasswordLoginIn (String password){
        elementActions.writeText(userPasswordField, password);
        return this;
    }
    public CustomerAccountPage clickSignIn (){
        signInBtn.click();
        return this;
    }

    public CustomerAccountPage clickSearchBtn(){
        searchBtn.click();
        searchBtn.sendKeys("women top  ", Keys.ENTER);
        return this;
    }

}