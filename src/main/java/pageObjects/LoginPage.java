package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableComponents.ActionEngine;
import testBase.DriverFactory;
import testBase.TestBase;

public class LoginPage extends TestBase {
    // WebDriver driver;
//    @FindBy(xpath="//a[@href='/login']")
//    WebElement loginLink;
//    @FindBy(xpath="//input[@data-qa='signup-email']")
//    WebElement signupEmail;
//    @FindBy(xpath="//input[@name='name']")
//    WebElement userName;

    By LOGINLINK=By.xpath("//a[@href='/login']");
    By USERNAME=By.xpath("//div[@class='signup-form']//input[@name='name']");
    By SIGNUPEmail=By.xpath("//input[@data-qa='signup-email']");

//    public LoginPage(){
//        PageFactory.initElements(driver,this);
//    }

    public void login(String userName,String email){
        click_custom(DriverFactory.getInstance().getDriver().findElement(LOGINLINK),"SignUp");
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(USERNAME),"UserName",userName);
        sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(SIGNUPEmail),"Email",email);

    }
    public void clickOnMenu(String menuName){
       String menuPath="//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),'"+menuName+"')]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(menuPath)).click();
    }

}
