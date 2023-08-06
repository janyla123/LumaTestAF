package ui.pages;


import org.openqa.selenium.support.PageFactory;
import ui.drivers.Driver;
import ui.helper.ElementActions;

public abstract class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    public static ElementActions elementActions=new ElementActions();

}