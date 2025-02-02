package testBase;

import org.testng.annotations.AfterMethod;
import reusableComponents.ActionEngine;
import reusableComponents.PropertiesOperations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeMethod;
public class TestBase extends ActionEngine
{
    BrowserFactory bf = new BrowserFactory();
    @BeforeMethod
    public void LaunchApplication() throws Exception {
        String browser = PropertiesOperations.getPropertyValueByKey("browser");
        String url     = PropertiesOperations.getPropertyValueByKey("url");
        DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));
        DriverFactory.getInstance().getDriver().manage().window().maximize();
        DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverFactory.getInstance().getDriver().navigate().to(url);
        DriverFactory.getInstance().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.getInstance().closeBrowser();
    }

}
