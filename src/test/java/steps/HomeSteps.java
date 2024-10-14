package steps;

import Web.WebHelper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import config.Config;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.ExtentReportManager;

import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class HomeSteps extends WebHelper {
    //private WebDriver driver;
    private HomePage homePage;

    Properties conf = new Properties();

    public HomeSteps() {

        homePage = new HomePage(webDriverInit());
    }


    @Given("I am on the redbus dashboard page")
    public void iAmOnTheRedbusDashboardPage() {
        System.out.println("Program Started ");
        conf = new Config().initializeConfig();
        homePage.navigateToWebsite(conf.getProperty("BaseURL"));


    }

    @Then("I verify dashboard page")
    public void iVerifyDashboardPage() {
        homePage.dashboard();
        System.out.println("Verify dashboard of Home page");

    }

    @When("Go to Rail Journey page")
    public void goToRailJourneyPage() {
        homePage.RailJourneyPage();
        System.out.println("Verify Rail Journey Page");
    }

    @When("Click on calendar and select date on Rail Page")
    public void clickOnCalendarAndSelectDateRailPage() {
        homePage.travelDateClick();
        System.out.println("Verify Rail Journey Calendar");
    }

    @Then("Click on search button")
    public void clickOnSearchButton() {
        homePage.search();
    }

    @Then("Verify search result")
    public void verifySearchResult() {
        homePage.searchResult();
    }

    @Then("Go back to Bus Journey page")
    public void goBackToBusJourneyPage() {
        homePage.busJourney();
    }


    @When("Enter a valid origin city")
    public void enterAValidOriginCity() {
        System.out.println("Verify origin city of Home page");
        homePage.srccity(conf.getProperty("OriginCity"));
    }

    @When("Enter a valid destination city")
    public void enterAValidDestinationCity() {
        System.out.println("Verify destination city of Home page");
        homePage.desccity(conf.getProperty("DescCity"));
    }

    @Then("Click on calendar and search")
    public void clickOnCalendarAndSearch() {
        homePage.travelDateClick();
        homePage.search();
    }

    @When("Click on the Account link")
    public void clickOnTheAccountlink() {
        homePage.clickAccount();

    }

    @And("Go to signup page")
    public void goToSignupPage() {
        homePage.goSignupPage();

    }

    @Then("Verify signup page")
    public void verifySignupPage() {
        homePage.headerSignupPage();

    }


}
