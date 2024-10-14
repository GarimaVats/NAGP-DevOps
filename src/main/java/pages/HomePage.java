package pages;


import commonFunction.WebCommonFunction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebCommonFunction {

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "bus_tickets_vertical")
    WebElement busTicketOption;
    @FindBy(id = "rail_tickets_vertical")
    WebElement railTicketOption;

    @FindBy(id = "help_redcare")
    WebElement helpOption;

    @FindBy(id = "account_dd")
    WebElement accountOption;

    @FindBy(id = "src")
    WebElement originFromCity;
    @FindBy(id = "dest")
    WebElement destCity;

    @FindBy(id = "onwardCal")
    WebElement travelDate;

    @FindBy(name = "search-btn ")
    WebElement search;

    @FindBy(name = "search_tupple_wrapper")
    WebElement searchResult;


    @FindBy(id = "user_sign_in_sign_up")
    WebElement signUp;

    @FindBy(name = "new-signin-header m-l-44")
    WebElement signUpHeader;


    String calDate = "//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div[6]/span/div[2]/span";


    public void dashboard() {
        this.isElementDisplayed(busTicketOption);
        this.isElementDisplayed(railTicketOption);
        this.isElementDisplayed(helpOption);
        this.isElementDisplayed(accountOption);
    }

    public void srccity(String OriginCity) {
        this.isElementDisplayed(originFromCity);
        this.clickElement(originFromCity);
        this.sendKeys(originFromCity, OriginCity);

    }

    public void desccity(String DescCity) {
        this.isElementDisplayed(destCity);
        this.clickElement(destCity);
        this.sendKeys(destCity, DescCity);

    }

    public void travelDateClick() {
        this.isElementDisplayed(travelDate);
        this.clickElement(travelDate);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.waitForElementToBeVisible(calDate);
        this.clickElement(calDate);

    }

    public void navigateToWebsite(String url) {
        navigateToUrl(url);
    }

    public void RailJourneyPage() {
        this.isElementDisplayed(railTicketOption);
        this.clickElement(railTicketOption);
    }

    public void search() {
        this.isElementDisplayed(search);
        this.clickElement(search);

    }

    public void searchResult() {
        this.isElementDisplayed(searchResult);

    }

    public void busJourney() {
        this.isElementDisplayed(busTicketOption);
        this.clickElement(busTicketOption);

    }

    public void clickAccount() {
        this.clickElement(accountOption);
    }

    public void goSignupPage() {
        this.clickElement(signUp);
    }

    public void headerSignupPage() {
        this.signUpHeader.getText();
    }


}
