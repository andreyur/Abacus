package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String DASHBOARD_BUTTON = "//a/span[contains(text(),'Dashboard')]";
    private static final String AIFORIT_OPERATIONS_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),'AI for IT Operations')]";
    private static final String AIFORIT_OPERATIONS_LINK = "//div[@class='homeSolNewDetail']//a[@href='/itoperations']";
    private static final String CLOUD_ALERT_LINK = "//div[@class='homeSolNewDetail']//a[@href='/operations_cloud']";
    private static final String EARLY_DETECTION_LINK = "//div[@class='homeSolNewDetail']//a[@href='/operations_incident']";
    private static final String PREDICTIVE_MAINTENANCE_LINK = "//div[@class='homeSolNewDetail']//a[@href='/operations_maintenance'] ";
    private static final String MARKETING_SALES_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),' Marketing and Sales AI')]";
    private static final String MARKETING_SALES_LINK = "//div[@class='homeSolNewDetail']//a[@href='/marketing']";
    private static final String PREDICTIVE_LEAD_LINK = "//div[@class='homeSolNewDetail']//a[@href='/sales_scoring']";
    private static final String PERSONALIZED_PROMOTIONS_LINK = "//div[@class='homeSolNewDetail']//a[@href='/pers_promotions']";
    private static final String CUSTOMER_PREDICTION_LINK = "//div[@class='homeSolNewDetail']//a[@href='/customer_churn'] ";
    private static final String SALES_FORECASTING_LINK = "//div[@class='homeSolNewDetail']//a[@href='/sales_forecasting']";
    private static final String FRAUD_SECURITY_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),' Fraud and Security')]";
    private static final String FRAUD_SECURITY_LINK = "//div[@class='homeSolNewDetail']//a[@href='/fraud']";
    private static final String ACCOUNT_TAKEOVER_LINK = "//div[@class='homeSolNewDetail']//a[@href='/fraud_account']";
    private static final String TRANSACTION_CARD_LINK = "//div[@class='homeSolNewDetail']//a[@href='/fraud_transactions']";
    private static final String INTELLIGENT_DETECTION_LINK = "//div[@class='homeSolNewDetail']//a[@href='/fraud_threat']";
    private static final String RECOMMENDER_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),' Recommender AI')]";
    private static final String RECOMMENDER_LINK = "//div[@class='homeSolNewDetail']//a[@href='/user_eng']";
    private static final String PERSONALIZED_RECOMMENDATIONS_LINK = "//div[@class='homeSolNewDetail']//a[@href='/user_recommendations']";
    private static final String RELATED_ITEMS_LINK = "//div[@class='homeSolNewDetail']//a[@href='/user_related']";
    private static final String PERSONALIZED_SEARCH_LINK = "//div[@class='homeSolNewDetail']//a[@href='/user_rankings']";
    private static final String REAL_RECOMMENDATIONS_LINK = "//div[@class='homeSolNewDetail']//a[@href='/feed_recommend'] ";
    private static final String FORECASTING_PLANNING_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),'Forecasting and Planning')]";
    private static final String FORECASTING_PLANNING_LINK = "//div[@class='homeSolNewDetail']//a[@href='/forecast']";
    private static final String DEMAND_FORECASTING_LINK = "//div[@class='homeSolNewDetail']//a[@href='/demandforecasting']";
    private static final String REAL_FORECASTING_LINK = "//div[@class='homeSolNewDetail']//a[@href='/realtimeforecasting']";
    private static final String FINANCIAL_FORECASTING_LINK = "//div[@class='homeSolNewDetail']//a[@href='/financial_metrics']";
    private static final String ANOMALY_DETECTION_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),'Anomaly Detection')]";
    private static final String ANOMALY_DETECTION_LINK = "//div[@class='homeSolNewDetail']//a[@href='/anomalydetection']";
    private static final String TIME_ANOMALY_DETECTION_LINK = "//div[@class='homeSolNewDetail']//a[@href='/anomalytimeseries']";
    private static final String EVENT_ANOMALY_DETECTION_LINK = "//div[@class='homeSolNewDetail']//a[@href='/anomalyeventstream']";
    private static final String PREDICTIVE_MODELING_HOVER = "//div[@class='solHomeNew homeSolNewNoHover']//div[contains(text(),'Predictive Modeling')]";
    private static final String PREDICTIVE_MODELING_LINK = "//div[@class='homeSolNewDetail']//a[@href='/predicting']";
    private static final String BARCODE_INPUT = "#barcode";
    private static final String SUBMIT_BUTTON = "button.btn.btn-primary";

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

    @FindBy(xpath=DASHBOARD_BUTTON)
    private WebElement dashboardButton;
    public WebElement getDashboardButton() {
        return dashboardButton;
    }

    @FindBy (xpath=AIFORIT_OPERATIONS_HOVER)
    private WebElement aiforitOperationsHover;
    public WebElement getAiforitOperationsHover() {
        return aiforitOperationsHover;
    }

    @FindBy (xpath=AIFORIT_OPERATIONS_LINK)
    private WebElement aiforitOperationsLink;
    public WebElement getAiforitOperationsLink() {
        return aiforitOperationsLink;
    }

    @FindBy (xpath=CLOUD_ALERT_LINK)
    private WebElement cloudAlertLink;
    public WebElement getCloudAlertLink() {
        return cloudAlertLink;
    }

    @FindBy (xpath=EARLY_DETECTION_LINK)
    private WebElement earlyDetectionLink;
    public WebElement getEarlyDetectionLink() {
        return earlyDetectionLink;
    }

    @FindBy (xpath=PREDICTIVE_MAINTENANCE_LINK)
    private WebElement predictiveMaintenanceLink;
    public WebElement getPredictiveMaintenanceLink() {
        return predictiveMaintenanceLink;
    }

    @FindBy (xpath=MARKETING_SALES_HOVER)
    private WebElement marketingSalesHover;
    public WebElement getMarketingSalesHover() {
        return marketingSalesHover;
    }

    @FindBy (xpath=MARKETING_SALES_LINK)
    private WebElement marketingSalesLink;
    public WebElement getMarketingSalesLink() {
        return marketingSalesLink;
    }

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

    @FindBy (xpath=FRAUD_SECURITY_HOVER)
    private WebElement fraudSecurityHover;
    public WebElement getFraudSecurityHover() {
        return fraudSecurityHover;
    }

    @FindBy (xpath=FRAUD_SECURITY_LINK)
    private WebElement fraudSecurityLink;
    public WebElement getFraudSecurityLink() {
        return fraudSecurityLink;
    }

    @FindBy (xpath=ACCOUNT_TAKEOVER_LINK)
    private WebElement accountTakeoverLink;
    public WebElement getAccountTakeoverLink() {
        return accountTakeoverLink;
    }

    @FindBy (xpath=TRANSACTION_CARD_LINK)
    private WebElement transactionCardLink;
    public WebElement getTransactionCardLink() {
        return transactionCardLink;
    }

    @FindBy (xpath=INTELLIGENT_DETECTION_LINK)
    private WebElement intelligentDetectionLink;
    public WebElement getIntelligentDetectionLink() {
        return intelligentDetectionLink;
    }

    @FindBy (xpath=RECOMMENDER_HOVER)
    private WebElement recommenderHover;
    public WebElement getRecommenderHover() {
        return recommenderHover;
    }

    @FindBy (xpath=RECOMMENDER_LINK)
    private WebElement recommenderLink;
    public WebElement getRecommenderLink() {
        return recommenderLink;
    }

    @FindBy (xpath=PERSONALIZED_RECOMMENDATIONS_LINK)
    private WebElement personalizedRecommendationsLink;
    public WebElement getPersonalizedRecommendationsLink() {
        return personalizedRecommendationsLink;
    }

    @FindBy (xpath=RELATED_ITEMS_LINK)
    private WebElement relatedItemsLink;
    public WebElement getRelatedItemsLink() {
        return relatedItemsLink;
    }

    @FindBy (xpath=PERSONALIZED_SEARCH_LINK)
    private WebElement personalizedSearchLink;
    public WebElement getPersonalizedSearchLink() {
        return personalizedSearchLink;
    }

    @FindBy (xpath=REAL_RECOMMENDATIONS_LINK)
    private WebElement realRecommendationsLink;
    public WebElement getRealRecommendationsLink() {
        return realRecommendationsLink;
    }

    @FindBy (xpath=FORECASTING_PLANNING_HOVER)
    private WebElement forecastingPlanningHover;
    public WebElement getForecastingPlanningHover() {
        return forecastingPlanningHover;
    }

    @FindBy (xpath=FORECASTING_PLANNING_LINK)
    private WebElement forecastingPlanningLink;
    public WebElement getForecastingPlanningLink() {
        return forecastingPlanningLink;
    }

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

    @FindBy (xpath=ANOMALY_DETECTION_HOVER)
    private WebElement anomalyDetectionHover;
    public WebElement getAnomalyDetectionHover() {
        return anomalyDetectionHover;
    }

    @FindBy (xpath=ANOMALY_DETECTION_LINK)
    private WebElement anomalyDetectionLink;
    public WebElement getAnomalyDetectionLink() {
        return anomalyDetectionLink;
    }

    @FindBy (xpath=TIME_ANOMALY_DETECTION_LINK)
    private WebElement timeAnomalyDetectionLink;
    public WebElement getTimeAnomalyDetectionLink() {
        return timeAnomalyDetectionLink;
    }

    @FindBy (xpath=EVENT_ANOMALY_DETECTION_LINK)
    private WebElement eventAnomalyDetectionLink;
    public WebElement getEventAnomalyDetectionLink() {
        return eventAnomalyDetectionLink;
    }

    @FindBy (xpath=PREDICTIVE_MODELING_HOVER)
    private WebElement predictiveModelingHover;
    public WebElement getPredictiveModelingHover() {
        return predictiveModelingHover;
    }

    @FindBy (xpath=PREDICTIVE_MODELING_LINK)
    private WebElement predictiveModelingLink;
    public WebElement getPredictiveModelingLink() {
        return predictiveModelingLink;
    }

    @FindBy(css=BARCODE_INPUT)
    private WebElement barcodeInput;
    public WebElement getBarcodeInput() {
        return barcodeInput;
    }

    @FindBy (css=SUBMIT_BUTTON)
    private WebElement submitButton;
    public WebElement getSubmitButton() {
        return submitButton;
    }

    public HomePage open(String url){
        driver.get(url);
        driver.manage().window().maximize();
        return this;
    }

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
}
