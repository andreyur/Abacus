package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    public Header(WebDriver driver){
        super(driver);
    }
    private static final String HOME_LINK = "div.headerNewNN a.linkNon img";
    private static final String SOLUTIONS_LINK = "div.headerNewNN #dropdownMenuSolutions";
    private static final String AIFORIT_OPERATIONS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'AI for IT Operations')]";
    private static final String CLOUD_ALERT_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Cloud Spend Alerts')]";
    private static final String EARLY_DETECTION_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Early Incident Detection')]";
    private static final String PREDICTIVE_MAINTENANCE_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Predictive Maintenance')]";
    private static final String FRAUD_SECURITY_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Fraud and Security')]";
    private static final String ACCOUNT_TAKEOVER_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Account Takeover and Defense')]";
    private static final String TRANSACTION_CARD_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Transaction/Credit Card Fraud')]";
    private static final String INTELLIGENT_DETECTION_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Intelligent Threat Detection')]";
    private static final String FORECASTING_PLANNING_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Forecasting and Planning')]";
    private static final String DEMAND_FORECASTING_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Demand Forecasting')]";
    private static final String REAL_FORECASTING_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Real-Time Forecasting')]";
    private static final String FINANCIAL_FORECASTING_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Financial Metrics Forecasting')]";
    private static final String PREDICTIVE_MODELING_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Predictive Modeling')]";
    private static final String MARKETING_SALES_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Marketing and Sales AI')]";
    private static final String PREDICTIVE_LEAD_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Predictive Lead Scoring')]";
    private static final String PERSONALIZED_PROMOTIONS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Personalized Promotions')]";
    private static final String CUSTOMER_PREDICTION_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Customer Churn Prediction')]";
    private static final String SALES_FORECASTING_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Sales and Revenue Forecasting')]";
    private static final String RECOMMENDER_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Recommender AI')]";
    private static final String PERSONALIZED_RECOMMENDATIONS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Personalized Recommendations')]";
    private static final String RELATED_ITEMS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Related Items')]";
    private static final String PERSONALIZED_SEARCH_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Personalized Search')]";
    private static final String REAL_RECOMMENDATIONS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Real-Time Feed Recommendations')]";
    private static final String ANOMALY_DETECTION_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Anomaly Detection')]";
    private static final String TIME_ANOMALY_DETECTION_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Timeseries Anomaly Detection')]";
    private static final String EVENT_ANOMALY_DETECTION_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Event Stream Anomaly Detection')]";
    private static final String DECONSTRUCTED_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Deconstructed')]";
    private static final String RESEARCH_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Research')]";
    private static final String COMPANY_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Company')]";
    private static final String ABOUT_LINK = "//div[@class='headerNewNN']//a[contains(text(),'About Us')]";
    private static final String CULTURE_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Culture')]";
    private static final String PRESS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Press')]";
    private static final String SOCIAL_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Social Media')]";
    private static final String JOBS_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Jobs')]";
    private static final String LOGIN_LINK = "//div[@class='headerNewNN']//a[contains(text(),'Log In')]";
    private static final String REQUEST_BUTTON = "//a[contains(text(),'Request Access')]";

    @FindBy(css=HOME_LINK)
    private WebElement homeLink;
    public WebElement getHomeLink() {
        return homeLink;
    }

    @FindBy(css=SOLUTIONS_LINK)
    private WebElement solutionsLink;
    public WebElement getSolutionsLink() {
        return solutionsLink;
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

    @FindBy (xpath=PREDICTIVE_MODELING_LINK)
    private WebElement predictiveModelingLink;
    public WebElement getPredictiveModelingLink() {
        return predictiveModelingLink;
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

    @FindBy (xpath=DECONSTRUCTED_LINK)
    private WebElement deconstructedLink;
    public WebElement getDeconstructedLink() {
        return deconstructedLink;
    }

    @FindBy (xpath=RESEARCH_LINK)
    private WebElement researchLink;
    public WebElement getResearchLink() {
        return researchLink;
    }

    @FindBy (xpath=COMPANY_LINK)
    private WebElement companyLink;
    public WebElement getCompanyLink() {
        return companyLink;
    }

    @FindBy (xpath=ABOUT_LINK)
    private WebElement aboutLink;
    public WebElement getAboutLink() {
        return aboutLink;
    }

    @FindBy (xpath=CULTURE_LINK)
    private WebElement cultureLink;
    public WebElement getCultureLink() {
        return cultureLink;
    }

    @FindBy (xpath=PRESS_LINK)
    private WebElement pressLink;
    public WebElement getPressLink() {
        return pressLink;
    }

    @FindBy (xpath=SOCIAL_LINK)
    private WebElement socialLink;
    public WebElement getSocialLink() {
        return socialLink;
    }

    @FindBy (xpath=JOBS_LINK)
    private WebElement jobsLink;
    public WebElement getJobsLink() {
        return jobsLink;
    }

    @FindBy (xpath=LOGIN_LINK)
    private WebElement loginLink;
    public WebElement getLoginLink() {
        return loginLink;
    }

    @FindBy (xpath=REQUEST_BUTTON)
    private WebElement requestButton;
    public WebElement getRequestButton() {
        return requestButton;
    }
}
