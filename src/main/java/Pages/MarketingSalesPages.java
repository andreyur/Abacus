package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MarketingSalesPages extends BasePage {
    public MarketingSalesPages(WebDriver driver){
        super(driver);
    }
    private static final String PREDICTIVE_LEAD_LINK = "//a[@class='linkNon'][@href='/sales_scoring']";
    private static final String PERSONALIZED_PROMOTIONS_LINK = "//a[@class='linkNon'][@href='/pers_promotions']";
    private static final String CUSTOMER_PREDICTION_LINK = "//a[@class='linkNon'][@href='/customer_churn']";
    private static final String SALES_FORECASTING_LINK = "//a[@class='linkNon'][@href='/sales_forecasting']";
    private static final String MARKETING_SALES_HEADER = "//div[contains(text(),'Marketing and Sales AI')]";
    private static final String PREDICTIVE_LEAD_HEADER = "//div[contains(text(),'Predictive Lead Scoring')]";
    private static final String PERSONALIZED_PROMOTIONS_HEADER = "//div[contains(text(),'Personalized Promotions')]";
    private static final String CUSTOMER_PREDICTION_HEADER = "//div[contains(text(),'Customer Churn Prediction')]";
    private static final String SALES_FORECASTING_HEADER = "//div[contains(text(),'Sales and Revenue Forecasting')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

    @FindBy (xpath=PREDICTIVE_LEAD_LINK)
    private WebElement predictiveLeadLink;
    public WebElement getPredictiveLeadLink() {
        return predictiveLeadLink;
    }

    @FindBy (xpath=PERSONALIZED_PROMOTIONS_LINK)
    private WebElement personalizedPromotionsLink;
    public WebElement getPersonalizedPromotionsLink() {
        return personalizedPromotionsLink;
    }

    @FindBy (xpath=CUSTOMER_PREDICTION_LINK)
    private WebElement customerPredictionLink;
    public WebElement getCustomerPredictionLink() {
        return customerPredictionLink;
    }

    @FindBy (xpath=SALES_FORECASTING_LINK)
    private WebElement salesForecastingPLink;
    public WebElement getSalesForecastingPLink() {
        return salesForecastingPLink;
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

    @FindBy (xpath=MARKETING_SALES_HEADER)
    private WebElement marketingSalesHeader;
    public WebElement getMarketingSalesHeader() {
        return marketingSalesHeader;
    }

    @FindBy (xpath=PREDICTIVE_LEAD_HEADER)
    private WebElement predictiveLeadHeader;
    public WebElement getPredictiveLeadHeader() {
        return predictiveLeadHeader;
    }

    @FindBy (xpath=PERSONALIZED_PROMOTIONS_HEADER)
    private WebElement personalizedPromotionsHeader;
    public WebElement getPersonalizedPromotionsHeader() {
        return personalizedPromotionsHeader;
    }

    @FindBy (xpath=CUSTOMER_PREDICTION_HEADER)
    private WebElement customerPredictionHeader;
    public WebElement getCustomerPredictionHeader() {
        return customerPredictionHeader;
    }

    @FindBy (xpath=SALES_FORECASTING_HEADER)
    private WebElement salesForecastingPHeader;
    public WebElement getSalesForecastingPHeader() {
        return salesForecastingPHeader;
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

    public void clickPredictiveLeadLink() throws InterruptedException {
        waitForElementToAppear(getPredictiveLeadLink());
        Actions actions = new Actions(driver);
        actions.moveToElement(getMarketingSalesHeader());
        actions.perform();
        getPredictiveLeadLink().click();
        Thread.sleep(300);
    }

    public void clickPersonalizedPromotionsLink() throws InterruptedException {
        waitForElementToAppear(getPersonalizedPromotionsLink());
        getPersonalizedPromotionsLink().click();
        Thread.sleep(300);
    }

    public void clickCustomerPredictionLink() throws InterruptedException {
        waitForElementToAppear(getCustomerPredictionLink());
        getCustomerPredictionLink().click();
        Thread.sleep(300);
    }

    public void clickSalesForecastingPLink() throws InterruptedException {
        waitForElementToAppear(getSalesForecastingPLink());
        getSalesForecastingPLink().click();
        Thread.sleep(300);
    }

    public void checkMarketingSalesAI(){
        assertThat("Header should be displayed", getMarketingSalesHeader().isDisplayed());
    }

    public void checkPredictiveLeadScoring(){
        assertThat("Header should be displayed", getPredictiveLeadHeader().isDisplayed());
    }

    public void checkPersonalizedPromotions(){
        assertThat("Header should be displayed", getPersonalizedPromotionsHeader().isDisplayed());
    }

    public void checkCustomerChurnPrediction(){
        assertThat("Header should be displayed", getCustomerPredictionHeader().isDisplayed());
    }

    public void checkSalesRevenueForecasting(){
        assertThat("Header should be displayed", getSalesForecastingPHeader().isDisplayed());
    }
}
