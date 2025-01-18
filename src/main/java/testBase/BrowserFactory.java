package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserFactory {

    //create webdriver object for given browser
    public WebDriver createBrowserInstance(String browser) throws MalformedURLException {

        //	WebDriver driver = null;
        RemoteWebDriver driver = null;

        if (browser.equalsIgnoreCase("Chrome")) {

            WebDriverManager.chromedriver().setup();
            // System.setProperty("webdriver.chrome.silentOutput", "true");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName("chrome");
            caps.setVersion("114.0.5735.106");//114.0.5735.106
            caps.setPlatform(Platform.MAC);

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options = options.merge(caps);

            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("safari")) {

            WebDriverManager.safaridriver().setup();
            //	FirefoxOptions foptions = new FirefoxOptions();
            //	foptions.addArguments("-private");

            // driver = new RemoteWebDriver(new URL("http:192.168.225.219:4444/wd/hub"), DesiredCapabilities);
            System.setProperty("webdriver.safari.silentOutput", "true");
            driver = new SafariDriver();

        } if (browser.equalsIgnoreCase("ie")) {

            WebDriverManager.iedriver().setup();
            InternetExplorerOptions iOptions = new InternetExplorerOptions();
            iOptions.addCommandSwitches("-private");

            driver = new InternetExplorerDriver(iOptions);
        }
        return driver;
    }

}
