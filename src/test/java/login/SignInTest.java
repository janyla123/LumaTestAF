package login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.drivers.Driver;
import ui.enums.ErrorMessageLoginIn;
import ui.enums.UserEnum;
import ui.enums.UserSignInEnum;
import wait.BaseTest;

public class SignInTest extends BaseTest {

//    @Test(description = "Sign in with true login and password")

    @Test(description = "Registration with valid credentials")
    void loginWithValidCredentials() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(UserEnum.janylaUserName.getCredentials())
                .enterLastName(UserEnum.janylaLastName.getCredentials())
                .enterEmail(UserEnum.janylaEmail.getCredentials())
                .enterPassword(UserEnum.janylaPassword.getCredentials())
                .enterPasswordAndConfirm(UserEnum.janylaEmail.getCredentials())
                .clickTheButton();

    }


    @Test(description = "Registration with null first name")
    void loginWithNullFirstName() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(UserEnum.janylaNullResult.getCredentials())
                .enterLastName(UserEnum.janylaLastName.getCredentials())
                .enterEmail(UserEnum.janylaEmail.getCredentials())
                .enterPassword(UserEnum.janylaPassword.getCredentials())
                .enterPasswordAndConfirm(UserEnum.janylaEmail.getCredentials())
                .clickTheButton();

    }

    @Test(description = "Registration with null last name")
    void loginWithNullLastName() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(UserEnum.janylaUserName.getCredentials())
                .enterLastName(UserEnum.janylaNullResult.getCredentials())
                .enterEmail(UserEnum.janylaEmail.getCredentials())
                .enterPassword(UserEnum.janylaPassword.getCredentials())
                .enterPasswordAndConfirm(UserEnum.janylaEmail.getCredentials())
                .clickTheButton();

    }

    @Test(description = "Registration with null email")
    void loginWithNullEmail() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(UserEnum.janylaUserName.getCredentials())
                .enterLastName(UserEnum.janylaLastName.getCredentials())
                .enterEmail(UserEnum.janylaNullResult.getCredentials())
                .enterPassword(UserEnum.janylaPassword.getCredentials())
                .enterPasswordAndConfirm(UserEnum.janylaEmail.getCredentials())
                .clickTheButton();

    }
    @Test(description = "Registration with invalid password")
    void loginWithInvalidPasswordInRegistration() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(UserEnum.janylaUserName.getCredentials())
                .enterLastName(UserEnum.janylaLastName.getCredentials())
                .enterEmail(UserEnum.janylaEmail.getCredentials())
                .enterPassword(UserEnum.janylaPassword.getCredentials())
                .enterPasswordAndConfirm(fakerDataProvider.generateEmail())
                .clickTheButton();

    }
    @Test(description = "Registration with invalid name")
    void loginWithInvalidNameInRegistration() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(fakerDataProvider.generateFirstName())
                .enterLastName(UserEnum.janylaLastName.getCredentials())
                .enterEmail(UserEnum.janylaEmail.getCredentials())
                .enterPassword(UserEnum.janylaPassword.getCredentials())
                .enterPasswordAndConfirm(UserEnum.janylaPassword.getCredentials())
                .clickTheButton();

    }

    @Test(description = "Login with invalid email")
    void loginWithInvalidEmail() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
        customerAccountPage.enterEmailLoginIn(fakerDataProvider.generateEmail());
        customerAccountPage.enterPasswordLoginIn(UserEnum.janylaPassword.getCredentials());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        customerAccountPage.clickLoginBtn();
        Thread.sleep(5000);
        Assert.assertEquals(customerAccountPage.errorMessageLoginIn.getText(), ErrorMessageLoginIn.loginValidationError.getErrorMessage());
    }



    @Test(description = "Login with invalid password")
    void loginWithInvalidPassword() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
        customerAccountPage.enterEmailLoginIn(UserEnum.janylaEmail.getCredentials());
        customerAccountPage.enterPasswordLoginIn(fakerDataProvider.generatePassword());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        customerAccountPage.clickLoginBtn();
        Thread.sleep(5000);
        Assert.assertEquals(customerAccountPage.errorMessageLoginIn.getText(), ErrorMessageLoginIn.loginValidationError.getErrorMessage());

    }


    void loginAndPassword() throws InterruptedException {
//        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
        customerAccountPage.enterEmailLoginIn(UserSignInEnum.janylaSignInEmail.getCredentials());
        customerAccountPage.enterPasswordLoginIn(UserSignInEnum.janylaSignInPassword.getCredentials());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        customerAccountPage.clickLoginBtn();
        Thread.sleep(5000);
    }

}
