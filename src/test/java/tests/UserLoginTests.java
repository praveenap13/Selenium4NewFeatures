package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import testBase.TestBase;

import java.util.concurrent.TimeUnit;

public class UserLoginTests extends TestBase {
    LoginPage loginPage=new LoginPage();
    ProductPage productPage=new ProductPage();

    @Test
    public void Testcase1() throws InterruptedException {
        Thread.sleep(2);
//        loginPage.login("pravina","pravina@gmail.com");
//        System.out.println("First");
    }
    @Test
    public void Testcase2() throws InterruptedException {

        productPage.clickOnMenu("Products");

        //productPage.enterSearchText("Women");
       // productPage.clickOnSubmitSearchButton();

    }


}
