package Web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    public static final WebDriverFactory instance = new WebDriverFactory();
    ChromeDriver driver;

    public static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }

}
