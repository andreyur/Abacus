package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class ForecastingPlanningPages extends BasePage {
    public ForecastingPlanningPages(WebDriver driver){
        super(driver);
    }
    private static final String DEMAND_FORECASTING_LINK = "//a[@class='linkNon'][@href='/demandforecasting']";
    private static final String REAL_FORECASTING_LINK = "//a[@class='linkNon'][@href='/realtimeforecasting']";
    private static final String FINANCIAL_FORECASTING_LINK = "//a[@class='linkNon'][@href='/financial_metrics']";
    private static final String FORECASTING_PLANNING_HEADER = "//div[contains(text(),'Forecasting and Planning')]";
    private static final String DEMAND_FORECASTING_HEADER = "//div[contains(text(),'Demand Forecasting')]";
    private static final String REAL_FORECASTING_HEADER = "//div[contains(text(),'Real-Time Forecasting')]";
    private static final String FINANCIAL_FORECASTING_HEADER = "//div[contains(text(),'Financial Metrics Forecasting')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

    @FindBy (xpath=DEMAND_FORECASTING_LINK)
    private WebElement demandForecastingPLink;
    public WebElement getDemandForecastingPLink() {
        return demandForecastingPLink;
    }

    @FindBy (xpath=REAL_FORECASTING_LINK)
    private WebElement realForecastingPLink;
    public WebElement getRealForecastingPLink() {
        return realForecastingPLink;
    }

    @FindBy (xpath=FINANCIAL_FORECASTING_LINK)
    private WebElement financialForecastingPLink;
    public WebElement getFinancialForecastingPLink() {
        return financialForecastingPLink;
    }

    @FindBy(xpath=FORECASTING_PLANNING_HEADER)
    private WebElement forecastingPlanningHeader;
    public WebElement getForecastingPlanningHeader() {
        return forecastingPlanningHeader;
    }

    @FindBy(xpath=DEMAND_FORECASTING_HEADER)
    private WebElement demandForecastingHeader;
    public WebElement getDemandForecastingHeader() {
        return demandForecastingHeader;
    }

    @FindBy (xpath=REAL_FORECASTING_HEADER)
    private WebElement realForecastingHeader;
    public WebElement getRealForecastingHeader() {
        return realForecastingHeader;
    }

    @FindBy (xpath=FINANCIAL_FORECASTING_HEADER)
    private WebElement financialForecastingHeader;
    public WebElement getFinancialForecastingHeader() {
        return financialForecastingHeader;
    }

    @FindBy (xpath=REQUEST_BUTTON)
    private WebElement requestButton;
    public WebElement getRequestButton() {
        return requestButton;
    }

    @FindBy (xpath=SCHEDULE_BUTTON)
    private WebElement scheduleButton;
    public WebElement getScheduleButton() {
        return scheduleButton;
    }

    @FindBy(css=PLAY_BUTTONS)
    private List<WebElement> playButtons;
    public List <WebElement> getPlayButtons() { return playButtons; }

    public RequestSchedule clickRequestButton(){
        waitForElementToAppear(getRequestButton());
        getRequestButton().click();
        return new RequestSchedule(driver);
    }

    public RequestSchedule clickScheduleButton(){
        waitForElementToAppear(getScheduleButton());
        getScheduleButton().click();
        return new RequestSchedule(driver);
    }

    public void clickFirstPlayButton() throws InterruptedException {
        waitForElementToAppear(getPlayButtons().get(0));
        getPlayButtons().get(0).click();
        Thread.sleep(200);
    }

    public void clickLastPlayButton() throws InterruptedException {
        waitForElementToAppear(getPlayButtons().get(getPlayButtons().size()-1));
        getPlayButtons().get(getPlayButtons().size()-1).click();
        Thread.sleep(200);
    }

    public void clickDemandForecastingPLink() throws InterruptedException {
        waitForElementToAppear(getDemandForecastingPLink());
        getDemandForecastingPLink().click();
        Thread.sleep(300);
    }

    public void clickRealForecastingPLink() throws InterruptedException {
        waitForElementToAppear(getRealForecastingPLink());
        getRealForecastingPLink().click();
        Thread.sleep(300);
    }

    public void clickFinancialForecastingPLink() throws InterruptedException {
        waitForElementToAppear(getFinancialForecastingPLink());
        getFinancialForecastingPLink().click();
        Thread.sleep(300);
    }

    public void checkForecastingPlanning(){
        assertThat("Header should be displayed", getForecastingPlanningHeader().isDisplayed());
    }

    public void checkDemandForecasting(){
        assertThat("Header should be displayed", getDemandForecastingHeader().isDisplayed());
    }

    public void checkRealForecasting(){
        assertThat("Header should be displayed", getRealForecastingHeader().isDisplayed());
    }

    public void checkFinancialForecasting(){
        assertThat("Header should be displayed", getFinancialForecastingHeader().isDisplayed());
    }
}
