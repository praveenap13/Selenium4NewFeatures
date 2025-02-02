package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reusableComponents.ActionEngine;
import testBase.DriverFactory;
import testBase.TestBase;

public class ProductPage extends TestBase {

    ActionEngine actionEngine=new ActionEngine();

    @FindBy(xpath = "//a[@href='products']")
    WebElement productMenuLink;

    @FindBy(xpath="//input[@name='search']")
    WebElement productSearch;

    @FindBy(xpath="//button[@id='submit_search']")
    WebElement submitSearch;

    public void clickOnMenu(String menuName){
        String menuPath="//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),'"+menuName+"')]";
        DriverFactory.getInstance().getDriver().findElement(By.xpath(menuPath)).click();
    }

    public void enterSearchText(String searchText){
        actionEngine.waitTillElementToBeClickable(submitSearch);
        actionEngine.sendKeys_custom(productSearch,"Search",searchText);
    }

    public void clickOnSubmitSearchButton(){
        actionEngine.click_custom(submitSearch,"Submit Search");
    }




}
