package wait;


import login.AllureReportListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import ui.drivers.Driver;
import ui.helper.ElementActions;
import ui.models.BasketPage;
import ui.models.CustomerAccountPage;
import ui.config.FakerDataProvider;
import ui.models.OrderPage;


//@Listeners(AllureReportListener.class)

public class BaseTest {



    public WebDriver driver;
    public ElementActions elementActions;

    public FakerDataProvider fakerDataProvider;

    public CustomerAccountPage customerAccountPage;
    public OrderPage orderPage;
    public BasketPage basketPage;







    @BeforeMethod
    public void setUpBrowser(){
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        customerAccountPage=new CustomerAccountPage();
        fakerDataProvider=new FakerDataProvider();
        orderPage=new OrderPage();
        basketPage=new BasketPage();

    }
//    @AfterMethod
//    public void tearDown(){
//      Driver.closeDriver();
//    }


}
