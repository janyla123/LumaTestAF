package ui.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pages.BasePage;

public class OrderPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Tops')]")
    public WebElement topsElement;


    @FindBy(xpath = "//a[@class='product photo product-item-photo']//img[@alt='Breathe-Easy Tank']")
    public WebElement topsWomen;

    @FindBy(xpath = "//div[@id='option-label-size-143-item-166']")
    public WebElement topsSize;



    @FindBy(xpath = "//div[@id='option-label-color-93-item-59']")
    public WebElement topsColor;

    @FindBy(xpath =  "//span[normalize-space()='Add to Cart']")
    public WebElement addToCard;

    @FindBy(xpath = "//a[@class='action showcart']" )
    public WebElement basketOfOrder;

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    public WebElement proceedToCheckout;
    @FindBy(xpath= "//div[normalize-space()='Shipping Address']")
    public WebElement shippingOrder;

    @FindBy(xpath= "//a[contains(text(),'Bottoms')]")
    public WebElement bottomsElement ;

    @FindBy(xpath= "//img[@alt='Sybil Running Short']")
    public WebElement runningShort ;

    @FindBy(xpath= "//div[@id='option-label-size-143-item-171']")
    public WebElement shortSize ;

    @FindBy(xpath= "//div[@id='option-label-color-93-item-57']")
    public WebElement shortColor ;


    @FindBy(xpath= "//span[normalize-space()='Men']")
    public WebElement menElement ;

    @FindBy(xpath="//a[contains(text(),'Tops')]")
    public WebElement menTopsElement ;

    @FindBy(xpath="//img[@alt='Argus All-Weather Tank']")
    public WebElement menTops ;

    @FindBy(xpath="//div[@id='option-label-size-143-item-170']")
    public WebElement menTopsSize ;

    @FindBy(xpath="//div[@id='option-label-color-93-item-52']")
    public WebElement menTopsColor ;

    @FindBy(xpath="//a[@href='https://magento.softwaretestingboard.com/what-is-new.html']")
    public WebElement whatIsNew;

    @FindBy(xpath="//span[@class='base']")
    public WebElement newWindow;


    @FindBy(xpath="//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    public WebElement womenElement;


    @FindBy(xpath="//span[normalize-space()='Gear']")
    public WebElement gearElement;


    @FindBy(xpath="//span[normalize-space()='Training']")
    public WebElement trainingElement;


    @FindBy(xpath="//a[@id='ui-id-8']//span[contains(text(),'Sale')]")
    public WebElement saleElement;


    @FindBy(xpath="//a[contains(text(),'Hoodies & Sweatshirts')]")
    public WebElement womenHoodies;


    @FindBy(xpath="//img[@alt='Circe Hooded Ice Fleece']")
    public WebElement greyWomenHoodies;


    @FindBy(xpath="//div[@id='option-label-size-143-item-167']")
    public WebElement greyWomenHoodiesSize;

    @FindBy(xpath="//div[@id='option-label-color-93-item-52']")
    public WebElement greyWomenHoodiesColor;

    @FindBy(xpath="//a[normalize-space()='Search Terms']")
    public WebElement searchTerms;

    @FindBy(xpath="//span[@class='action more button']")
    public WebElement shopNewYoga;

    @FindBy(xpath = "//strong[normalize-space()='Take it from Erin']")
    public WebElement takeItFromErin;

@FindBy(xpath="//ol[@class='products list items product-items']")
    public WebElement allProductsInThisPage;


    public OrderPage clickTopsElement(WebElement element){
        elementActions.clickTheButton(topsElement);
        return this;
    }
    public OrderPage clickTopsWomen(WebElement element){
        elementActions.clickTheButton(topsWomen);
        return this;
    }
    public OrderPage clickTopsSize(WebElement element){
        elementActions.clickTheButton(topsSize);
        return this;
    }

    public OrderPage clickTopsColor(WebElement element){
        elementActions.clickTheButton(topsColor);
        return this;
    }


    public OrderPage clickAddToCard(WebElement element){
        elementActions.clickTheButton(addToCard);
        return this;
    }

    public OrderPage clickBasketOfOrder(WebElement element){
        elementActions.clickTheButton(basketOfOrder);
        return this;
    }
    public OrderPage clickProceedToCheckout(WebElement element){
        elementActions.clickTheButton(proceedToCheckout);
        return this;
    }

    public OrderPage clickBottomsElement(WebElement element){
        elementActions.clickTheButton(bottomsElement);
        return this;
    }
    public OrderPage clickRunningShort(WebElement element){
        elementActions.clickTheButton(runningShort);
        return this;
    }

    public OrderPage clickShortSize(WebElement element){
        elementActions.clickTheButton(shortSize);
        return this;
    }
    public OrderPage clickShortColor(WebElement element){
        elementActions.clickTheButton(shortColor);
        return this;
    }
    public OrderPage  clickMenElement(WebElement element){
        elementActions.clickTheButton(menElement);
        return this;
    }
    public OrderPage  clickMenTopsElement(WebElement element){
        elementActions.clickTheButton(menTopsElement);
        return this;
    }
    public OrderPage  clickMenTops(WebElement element){
        elementActions.clickTheButton(menTops);
        return this;
    }

    public OrderPage  clickMenSize(WebElement element){
        elementActions.clickTheButton(menTopsSize);
        return this;
    }
    public OrderPage  clickMenColor(WebElement element){
        elementActions.clickTheButton(menTopsColor);
        return this;
    }
    public OrderPage  clickGearElement(WebElement element){
        elementActions.clickTheButton(gearElement);
        return this;
    }

    public OrderPage clickWhatIsNew(WebElement element){
        elementActions.clickTheButton(whatIsNew);
        return this;
    }

    public OrderPage clickWomenElement(WebElement element){
        elementActions.clickTheButton(womenElement);
        return this;
    }

    public OrderPage clickTrainingElement(WebElement element){
        elementActions.clickTheButton(trainingElement);
        return this;
    }
    public OrderPage clickSaleElement(WebElement element){
        elementActions.clickTheButton(saleElement);
        return this;
    }
    public OrderPage clickWomenHoodies(WebElement element){
        elementActions.clickTheButton(womenHoodies);
        return this;
    }
    public OrderPage clickGreyWomenHoodies(WebElement element){
        elementActions.clickTheButton(greyWomenHoodies);
        return this;
    }

    public OrderPage clickGreyWomenHoodiesSize(WebElement element){
        elementActions.clickTheButton(greyWomenHoodiesSize);
        return this;
    }

    public OrderPage clickGreyWomenHoodiesColor(WebElement element){
        elementActions.clickTheButton(greyWomenHoodiesColor);
        return this;
    }

    public OrderPage clickSearchTerms(WebElement element){
        elementActions.clickTheButton(searchTerms);
        return this;
    }

    public OrderPage clickShopNewYoga(WebElement element){
        elementActions.clickTheButton(shopNewYoga);
        return this;
    }

    public OrderPage clickTakeItFromErin(WebElement element){
        elementActions.clickTheButton(takeItFromErin);
        return this;
    }



}
