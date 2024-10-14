package commonFunction;

import logger.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebCommonFunction {
    private final WebDriverWait wait;
    RemoteWebDriver driver;

    public WebCommonFunction(RemoteWebDriver driver) {
        this.driver = driver;

        // to initialize WebElements referred by @FindBy annotation
        PageFactory.initElements(driver, this);

        Duration duration = Duration.ofSeconds(90); // Set the timeout duration
        wait = new WebDriverWait(driver, duration);
        // explicit wait
        //  wait = new WebDriverWait(driver, 60);

    }

    protected void navigateToUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
            Log.warn(e.getMessage());
        }
    }


    protected void sendKeys(WebElement element, String text) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
            Log.warn(e.getMessage());
        }
    }


    protected void clickElement(String xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            e.printStackTrace();
            Log.warn(e.getMessage());
        }
    }

    protected void clickElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element)).click();
        } catch (Exception e) {
            e.printStackTrace();
            Log.warn(e.getMessage());
        }
    }


    protected boolean waitForElementToBeVisible(String xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).isDisplayed();
    }


    protected boolean isElementDisplayed(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
