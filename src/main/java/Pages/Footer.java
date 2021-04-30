package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends BasePage {
    public Footer(WebDriver driver){
        super(driver);
    }
    private static final String AIFORIT_OPERATIONS_LINK = "//div[@class='subitem']//a[contains(text(),'AI for IT Operations')]";
    private static final String MARKETING_SALES_LINK = "//div[@class='subitem']//a[contains(text(),'Marketing and Sales AI')]";
    private static final String FRAUD_SECURITY_LINK = "//div[@class='subitem']//a[contains(text(),'Fraud and Security')]";
    private static final String RECOMMENDER_LINK = "//div[@class='subitem']//a[contains(text(),'Recommender AI')]";
    private static final String FORECASTING_PLANNING_LINK = "//div[@class='subitem']//a[contains(text(),'Forecasting and Planning')]";
    private static final String ANOMALY_DETECTION_LINK = "//div[@class='subitem']//a[contains(text(),'Anomaly Detection')]";
    private static final String PREDICTIVE_MODELING_LINK = "//div[@class='subitem']//a[contains(text(),'Predictive Modeling')]";
    private static final String DECONSTRUCTED_LINK = "//div[@class='subitem']//a[contains(text(),'Deconstructed')]";
    private static final String ABOUT_LINK = "//div[@class='subitem']//a[contains(text(),'About Us')]";
    private static final String CULTURE_LINK = "//div[@class='subitem']//a[contains(text(),'Culture')]";
    private static final String PRESS_LINK = "//div[@class='subitem']//a[contains(text(),'Press')]";
    private static final String SOCIAL_LINK = "//div[@class='subitem']//a[contains(text(),'Social Media')]";
    private static final String JOBS_LINK = "//div[@class='subitem']//a[contains(text(),'Jobs')]";
    private static final String TERMS_LINK = "//div[@class='subitem']//a[contains(text(),'Press')]";
    private static final String PRIVACY_LINK = "//div[@class='subitem']//a[contains(text(),'Social Media')]";
    private static final String SECURITY_LINK = "//div[@class='subitem']//a[contains(text(),'Jobs')]";
    private static final String PRESS_LIST = "//a[@href='/press']/img";

    @FindBy(xpath=AIFORIT_OPERATIONS_LINK)
    private WebElement aiforitOperationsLink;
    public WebElement getAiforitOperationsLink() {
        return aiforitOperationsLink;
    }

    @FindBy (xpath=MARKETING_SALES_LINK)
    private WebElement marketingSalesLink;
    public WebElement getMarketingSalesLink() {
        return marketingSalesLink;
    }

    @FindBy (xpath=FRAUD_SECURITY_LINK)
    private WebElement fraudSecurityLink;
    public WebElement getFraudSecurityLink() {
        return fraudSecurityLink;
    }

    @FindBy (xpath=RECOMMENDER_LINK)
    private WebElement recommenderLink;
    public WebElement getRecommenderLink() {
        return recommenderLink;
    }

    @FindBy (xpath=FORECASTING_PLANNING_LINK)
    private WebElement forecastingPlanningLink;
    public WebElement getForecastingPlanningLink() {
        return forecastingPlanningLink;
    }

    @FindBy (xpath=ANOMALY_DETECTION_LINK)
    private WebElement anomalyDetectionLink;
    public WebElement getAnomalyDetectionLink() {
        return anomalyDetectionLink;
    }

    @FindBy (xpath=PREDICTIVE_MODELING_LINK)
    private WebElement predictiveModelingLink;
    public WebElement getPredictiveModelingLink() {
        return predictiveModelingLink;
    }

    @FindBy (xpath=DECONSTRUCTED_LINK)
    private WebElement deconstructedLink;
    public WebElement getDeconstructedLink() {
        return deconstructedLink;
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

    @FindBy (xpath=PRESS_LIST)
    private WebElement pressList;
    public WebElement getPressList() {
        return pressList;
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

    @FindBy (xpath=TERMS_LINK)
    private WebElement termsLink;
    public WebElement getTermsLink() {
        return termsLink;
    }

    @FindBy (xpath=PRIVACY_LINK)
    private WebElement privacyLink;
    public WebElement getPrivacyLink() {
        return privacyLink;
    }

    @FindBy (xpath=SECURITY_LINK)
    private WebElement securityLink;
    public WebElement getSecurityLink() {
        return securityLink;
    }
}
