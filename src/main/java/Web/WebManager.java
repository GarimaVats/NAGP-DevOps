package Web;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;
import java.util.Properties;

public class WebManager {

    public static final WebManager instance = new WebManager();
    RemoteWebDriver driver;

    public void createDriverInstance(Properties config) {

        //driver = new ChromeDriver();
      //  driver.manage().window().maximize();

        switch (config.getProperty("BROWSER").toUpperCase()) {
            case "CHROME":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "FIREFOX":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;


            case "SAFARI":
                SafariOptions options = new SafariOptions();
                options.setUseTechnologyPreview(true);
                driver = new SafariDriver(options);
                driver.manage().window().maximize();
                break;
        }
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}
