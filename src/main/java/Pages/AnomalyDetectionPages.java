package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class AnomalyDetectionPages extends BasePage {
    public AnomalyDetectionPages(WebDriver driver){
        super(driver);
    }
    private static final String TIME_ANOMALY_DETECTION_LINK = "//a[@class='linkNon'][@href='/anomalytimeseries']";
    private static final String EVENT_ANOMALY_DETECTION_LINK = "//a[@class='linkNon'][@href='/anomalyeventstream']";
    private static final String ANOMALY_DETECTION_HEADER = "//div[contains(text(),'Anomaly Detection')]";
    private static final String TIME_ANOMALY_DETECTION_HEADER = "//div[contains(text(),'Timeseries Anomaly Detection')]";
    private static final String EVENT_ANOMALY_DETECTION_HEADER = "//div[contains(text(),'Event Stream Anomaly Detection')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

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

    @FindBy(xpath=ANOMALY_DETECTION_HEADER)
    private WebElement anomalyDetectionHeader;
    public WebElement getAnomalyDetectionHeader() {
        return anomalyDetectionHeader;
    }

    @FindBy (xpath=TIME_ANOMALY_DETECTION_HEADER)
    private WebElement timeAnomalyDetectionHeader;
    public WebElement getTimeAnomalyDetectionHeader() {
        return timeAnomalyDetectionHeader;
    }

    @FindBy (xpath=EVENT_ANOMALY_DETECTION_HEADER)
    private WebElement eventAnomalyDetectionHeader;
    public WebElement getEventAnomalyDetectionHeader() {
        return eventAnomalyDetectionHeader;
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

    public void clickTimeseriesAnomalyDetectionLink() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(getAnomalyDetectionHeader());
        actions.perform();
        waitForElementToAppear(getTimeAnomalyDetectionLink());
        getTimeAnomalyDetectionLink().click();
        Thread.sleep(300);
    }

    public void clickEventStreamAnomalyDetectionLink() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(getAnomalyDetectionHeader());
        actions.perform();
        waitForElementToAppear(getEventAnomalyDetectionLink());
        getEventAnomalyDetectionLink().click();
        Thread.sleep(300);
    }

    public void checkAnomalyDetection(){
        assertThat("Header should be displayed", getAnomalyDetectionHeader().isDisplayed());
    }

    public void checkTimeseriesAnomalyDetection(){
        assertThat("Header should be displayed", getTimeAnomalyDetectionHeader().isDisplayed());
    }

    public void checkEventStreamAnomalyDetection(){
        assertThat("Header should be displayed", getEventAnomalyDetectionHeader().isDisplayed());
    }
}
