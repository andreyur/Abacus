package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class FraudAndSecurity extends BasePage {
    public FraudAndSecurity(WebDriver driver){
        super(driver);
    }
    private static final String ACCOUNT_TAKEOVER_LINK = "//a[@class='linkNon'][@href='/fraud_account']";
    private static final String TRANSACTION_CARD_LINK = "//a[@class='linkNon'][@href='/fraud_transactions']";
    private static final String INTELLIGENT_DETECTION_LINK = "//a[@class='linkNon'][@href='/fraud_threat']";
    private static final String FRAUD_SECURITY_HEADER = "//div[contains(text(),'Fraud and Security')]";
    private static final String ACCOUNT_TAKEOVER_HEADER = "//div[contains(text(),'Account Takeover and Defense')]";
    private static final String TRANSACTION_CARD_HEADER = "//div[contains(text(),'Transaction/Credit Card Fraud')]";
    private static final String INTELLIGENT_DETECTION_HEADER = "//div[contains(text(),'Intelligent Threat Detection')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

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

    @FindBy(xpath=FRAUD_SECURITY_HEADER)
    private WebElement fraudSecurityHeader;
    public WebElement getFraudSecurityHeader() {
        return fraudSecurityHeader;
    }

    @FindBy(xpath=ACCOUNT_TAKEOVER_HEADER)
    private WebElement accountTakeoverHeader;
    public WebElement getAccountTakeoverHeader() {
        return accountTakeoverHeader;
    }

    @FindBy (xpath=TRANSACTION_CARD_HEADER)
    private WebElement transactionCardHeader;
    public WebElement getTransactionCardHeader() {
        return transactionCardHeader;
    }

    @FindBy (xpath=INTELLIGENT_DETECTION_HEADER)
    private WebElement intelligentDetectionHeader;
    public WebElement getIntelligentDetectionHeader() {
        return intelligentDetectionHeader;
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

    public void clickAccountTakeoverLink() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(getFraudSecurityHeader());
        actions.perform();
        waitForElementToAppear(getAccountTakeoverLink());
        getAccountTakeoverLink().click();
        Thread.sleep(300);
    }

    public void clickTransactionCardLink() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(getFraudSecurityHeader());
        actions.perform();
        waitForElementToAppear(getTransactionCardLink());
        getTransactionCardLink().click();
        Thread.sleep(300);
    }

    public void clickIntelligentDetectionLink() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(getFraudSecurityHeader());
        actions.perform();
        waitForElementToAppear(getIntelligentDetectionLink());
        getIntelligentDetectionLink().click();
        Thread.sleep(300);
    }

    public void checkFraudSecurity(){
        assertThat("Header should be displayed", getFraudSecurityHeader().isDisplayed());
    }

    public void checkAccountTakeover(){
        assertThat("Header should be displayed", getAccountTakeoverHeader().isDisplayed());
    }

    public void checkTransactionCard(){
        assertThat("Header should be displayed", getTransactionCardHeader().isDisplayed());
    }

    public void checkIntelligentDetection(){
        assertThat("Header should be displayed", getIntelligentDetectionHeader().isDisplayed());
    }
}
