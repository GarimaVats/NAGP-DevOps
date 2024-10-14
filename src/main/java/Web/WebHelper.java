package Web;

import org.openqa.selenium.remote.RemoteWebDriver;

public class WebHelper {

    public static RemoteWebDriver webDriverInit() {
        return WebManager.instance.driver;
    }


}
