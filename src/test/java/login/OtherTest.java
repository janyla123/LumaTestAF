package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.enums.*;

import ui.models.CustomerAccountPage;
import wait.BaseTest;

import java.util.List;

public class OtherTest extends BaseTest {
SignInTest signIn=new SignInTest();


    @Test(description = "Added women tops")
    void addedWomenTops() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        customerAccountPage.enterEmailLoginIn(UserSignInEnum.janylaSignInEmail.getCredentials());
        customerAccountPage.enterPasswordLoginIn(UserSignInEnum.janylaSignInPassword.getCredentials());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        customerAccountPage.clickLoginBtn();
        Thread.sleep(5000);
        orderPage.clickWomenElement(orderPage.womenElement);
        orderPage.clickTopsElement(orderPage.topsElement);
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickTopsWomen(orderPage.topsWomen);
        orderPage.clickTopsSize(orderPage.topsSize);
        orderPage.clickTopsColor(orderPage.topsColor);
        orderPage.clickAddToCard(orderPage.addToCard);
        js.executeScript("window.scrollBy(0, 0);");
        Thread.sleep(10000);
        orderPage.clickBasketOfOrder(orderPage.basketOfOrder);
        orderPage.clickProceedToCheckout(orderPage.proceedToCheckout);
        Thread.sleep(10000);
        basketPage.enterCompany(fakerDataProvider.generateCompany())
                .enterStreetAddress(fakerDataProvider.generateStreetAddress())
                .enterCity(fakerDataProvider.generateCity());
        basketPage.selectState()
                .enterZipPostCode(fakerDataProvider.generatePostalCode())
                .selectCountry();
        js.executeScript("window.scrollBy(0, 300);");
        basketPage.enterPhoneNumber(fakerDataProvider.generatePhoneNumber())
                .chooseMethodOfShipping();
        basketPage.clickTheBtnNext();
        Assert.assertEquals(orderPage.shippingOrder.getText(), ListOfOrder.listOfOrder.getListOfOrderForCustomer());


    }


    @Test(description = "Added women bottoms")
    void addedWomenBottoms() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        orderPage.clickBottomsElement(orderPage.bottomsElement);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickRunningShort(orderPage.runningShort);
        js.executeScript("window.scrollBy(0, 100);");
        orderPage.clickShortSize(orderPage.shortSize);
        orderPage.clickShortColor(orderPage.shortColor);
        js.executeScript("window.scrollBy(0, 50);");
        orderPage.clickAddToCard(orderPage.addToCard);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 0);");
        orderPage.clickBasketOfOrder(orderPage.basketOfOrder);
        orderPage.clickProceedToCheckout(orderPage.proceedToCheckout);
        Thread.sleep(10000);
        Assert.assertEquals(orderPage.shippingOrder.getText(), ListOfOrder.listOfOrder.getListOfOrderForCustomer());


    }

    @Test(description = "Added men tops")
    void addedManTops() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickMenElement(orderPage.menElement);
        orderPage.clickMenTopsElement(orderPage.menTopsElement);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickMenTops(orderPage.menTops);
        orderPage.clickMenSize(orderPage.menTopsSize);
        orderPage.clickMenColor(orderPage.menTopsColor);
        orderPage.clickAddToCard(orderPage.addToCard);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 0);");
        orderPage.clickBasketOfOrder(orderPage.basketOfOrder);
        orderPage.clickProceedToCheckout(orderPage.proceedToCheckout);
        Thread.sleep(10000);
        Assert.assertEquals(orderPage.shippingOrder.getText(), ListOfOrder.listOfOrder.getListOfOrderForCustomer());

    }




    @Test(description = "What is New")
    void whatIsNew() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickWhatIsNew(orderPage.whatIsNew);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.newListOfProducts.getCredentials());

    }

    @Test(description = "Products for Women")
    void womenWindow() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickWomenElement(orderPage.womenElement);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.newListOfProductsForWomen.getCredentials());

    }

    @Test(description = "Products for Men")
    void menWindow() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickMenElement(orderPage.menElement);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.newListOfProductsForMen.getCredentials());

    }

    @Test(description = "Products of Gear")
    void gearWindow() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickGearElement(orderPage.gearElement);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.newListOfProductsForGear.getCredentials());

    }

    @Test(description = "Products for training")
    void trainingWindow() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickTrainingElement(orderPage.trainingElement);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.newListOfProductsForTraining.getCredentials());

    }

    @Test(description = "Sale products")
    void saleWindow() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickSaleElement(orderPage.saleElement);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.newListOfSaleProducts.getCredentials());

    }

    @Test(description = "Added women hoodies")
    void addedWomenHoodies() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickWomenHoodies(orderPage.womenHoodies);
        orderPage.clickGreyWomenHoodies(orderPage.greyWomenHoodies);
        js.executeScript("window.scrollBy(0, 100);");
        orderPage.clickGreyWomenHoodiesSize(orderPage.greyWomenHoodiesSize);
        orderPage.clickGreyWomenHoodiesColor(orderPage.greyWomenHoodiesColor);
        orderPage.clickAddToCard(orderPage.addToCard);
        js.executeScript("window.scrollBy(0, 0);");
        Thread.sleep(10000);
        orderPage.clickBasketOfOrder(orderPage.basketOfOrder);
        orderPage.clickProceedToCheckout(orderPage.proceedToCheckout);
        Thread.sleep(10000);
        Assert.assertEquals(orderPage.shippingOrder.getText(), ListOfOrder.listOfOrder.getListOfOrderForCustomer());

    }


    @Test(description = "Looking all women tops")
    void allWomenTops() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        orderPage.clickTopsElement(orderPage.topsElement);
        Assert.assertEquals(orderPage.newWindow.getText(), ProductsName.womenAndManTops.getCredentials());
    }

    @Test(description = "Looking all women bottoms")
    void allWomenBottoms() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        orderPage.clickBottomsElement(orderPage.bottomsElement);
        Assert.assertEquals(orderPage.newWindow.getText(), ProductsName.womenAndMenBottoms.getCredentials());

    }

    @Test(description = "Looking all women hoodies")
    void allWomenHoodies() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickWomenHoodies(orderPage.womenHoodies);
        Assert.assertEquals(orderPage.newWindow.getText(), ProductsName.womenHoodies.getCredentials());

    }


    @Test(description = "Looking all man tops")
    void allManTops() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickMenElement(orderPage.menElement);
        orderPage.clickMenTopsElement(orderPage.menTopsElement);
        Assert.assertEquals(orderPage.newWindow.getText(), ProductsName.womenAndManTops.getCredentials());

    }

    @Test(description = "Search terms")
    void searchTerms() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 800);");
        orderPage.clickSearchTerms(orderPage.searchTerms);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.searchTems.getCredentials());
    }

    @Test(description = "Choose a women hoodies")
    void chooseWomenHoodies() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickWomenHoodies(orderPage.womenHoodies);
        orderPage.clickGreyWomenHoodies(orderPage.greyWomenHoodies);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.hoodiesName.getCredentials());

    }


    @Test(description = "Choose a men tops")
    void chooseManTops() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickMenElement(orderPage.menElement);
        orderPage.clickMenTopsElement(orderPage.menTopsElement);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickMenTops(orderPage.menTops);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.menTopsName.getCredentials());
    }
    @Test(description = "Choose a women bottoms")
    void chooseWomenBottoms() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        orderPage.clickBottomsElement(orderPage.bottomsElement);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickRunningShort(orderPage.runningShort);
        js.executeScript("window.scrollBy(0, 100);");
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.womenBottomsName.getCredentials());
    }


    @Test(description = "Choose a women tops")
    void chooseWomenTops() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        orderPage.clickTopsElement(orderPage.topsElement);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        orderPage.clickTopsWomen(orderPage.topsWomen);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.womenTopsName.getCredentials());
    }


    @Test(description = "click the button shop new yoga")
    void shopNewYoga() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        orderPage.clickShopNewYoga(orderPage.shopNewYoga);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.shopNewYoga.getCredentials());

    }

    @Test(description = "take it from Erin")
    void takeItFromErin() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300);");
        orderPage.clickTakeItFromErin(orderPage.takeItFromErin);
        Assert.assertEquals(orderPage.newWindow.getText(), NewListOfProducts.takeItFromErin.getCredentials());
    }

    @Test(description = "search a women top")
    void clickSearchBtn() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        customerAccountPage.clickSearchBtn();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 300);");
        List<WebElement> searchResults = driver.findElements(By.xpath("//ol[@class='products list items product-items']"));
        Assert.assertTrue(searchResults.size() > 0, "Результаты поиска не были найдены.");
        for (WebElement result : searchResults) {
            String productName = result.findElement(By.xpath("//ol[@class='products list items product-items']")).getText();
            Assert.assertTrue(productName.contains("Top"), "Результаты поиска содержат неправильные товары.");
        }

    }






}