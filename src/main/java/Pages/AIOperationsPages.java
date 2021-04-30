package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class AIOperationsPages extends BasePage {
    public AIOperationsPages(WebDriver driver){
        super(driver);
    }
    private static final String CLOUD_ALERT_LINK = "//a[@class='linkNon'][@href='/operations_cloud']";
    private static final String EARLY_DETECTION_LINK = "//a[@class='linkNon'][@href='/operations_incident']";
    private static final String PREDICTIVE_MAINTENANCE_LINK = "//a[@class='linkNon'][@href='/operations_maintenance']";
    private static final String AI_HEADER = "//div[contains(text(),'AI for IT Operations')]";
    private static final String CLOUD_ALERT_HEADER = "//div[contains(text(),'Cloud Spend Alerts')]";
    private static final String EARLY_DETECTION_HEADER = "//div[contains(text(),'Early Incident Detection')]";
    private static final String PREDICTIVE_MAINTENANCE_HEADER = "//div[contains(text(),'Predictive Maintenance')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

    @FindBy(xpath=CLOUD_ALERT_LINK)
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

    @FindBy(xpath=AI_HEADER)
    private WebElement aiHeader;
    public WebElement getAiHeader() {
        return aiHeader;
    }

    @FindBy(xpath=CLOUD_ALERT_HEADER)
    private WebElement cloudAlertHeader;
    public WebElement getCloudAlertHeader() {
        return cloudAlertHeader;
    }

    @FindBy (xpath=EARLY_DETECTION_HEADER)
    private WebElement earlyDetectionHeader;
    public WebElement getEarlyDetectionHeader() {
        return earlyDetectionHeader;
    }

    @FindBy (xpath=PREDICTIVE_MAINTENANCE_HEADER)
    private WebElement predictiveMaintenanceHeader;
    public WebElement getPredictiveMaintenanceHeader() {
        return predictiveMaintenanceHeader;
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

    public void clickCloudAlertLink() throws InterruptedException {
        waitForElementToAppear(getCloudAlertLink());
        getCloudAlertLink().click();
        Thread.sleep(300);
    }

    public void clickEarlyDetectionLink() throws InterruptedException {
        waitForElementToAppear(getEarlyDetectionLink());
        getEarlyDetectionLink().click();
        Thread.sleep(300);
    }

    public void clickPredictiveMaintenanceLink() throws InterruptedException {
        waitForElementToAppear(getPredictiveMaintenanceLink());
        getPredictiveMaintenanceLink().click();
        Thread.sleep(300);
    }

    public void checkAIForITOperations(){
        assertThat("Header should be displayed", getAiHeader().isDisplayed());
    }

    public void checkCloudSpendAlerts(){
        assertThat("Header should be displayed", getCloudAlertHeader().isDisplayed());
    }

    public void checkEarlyIncidentDetection(){
        assertThat("Header should be displayed", getEarlyDetectionHeader().isDisplayed());
    }

    public void checkPredictiveMaintenance(){
        assertThat("Header should be displayed", getPredictiveMaintenanceHeader().isDisplayed());
    }
}
