package steps;


import Web.WebManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import commonFunction.RetryFailedTestCases;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.runner.notification.RunListener;
import org.testng.annotations.Listeners;
import config.Config;
import utils.ExtentReportManager;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Listeners(RetryFailedTestCases.class)
public class Hooks extends RunListener {
    Properties conf = new Properties();
    private static ExtentReports extentReports = ExtentReportManager.getInstance();
    private static ExtentTest extentTest;

    @Before()
    public void beforeAppLaunch(Scenario scenario) {

        // Initializing configuration file
        conf = new Config().initializeConfig();

        try {
            FileInputStream input = new FileInputStream("src/test/resources/config.properties");
            conf.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        WebManager.instance.createDriverInstance(conf);
    }

    @After
    public void closingApplication(Scenario scenario) {
        extentTest = extentReports.createTest(scenario.getName());
        extentTest.log(Status.INFO, scenario.getName());
        extentTest.log(Status.PASS, scenario.getName());
        ExtentReportManager.getInstance().flush();
        WebManager.instance.closeDriver();
    }

}
