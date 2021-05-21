package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class DeconstructedPages extends BasePage {
    public DeconstructedPages(WebDriver driver){
        super(driver);
    }
    private static final String MODEL_HOSTING_LINK = "//p/following-sibling::div/a";
    private static final String EXPLAINABLE_AI_LINK = "//div[@class='textG']//a[@href='/deco_expdeb']/div/span";
    private static final String REAL_TIME_LINK = "//div[@class='textG']//a[@href='/deco_realtime']/div/span";
    private static final String DECONSTRUCTED_HEADER = "//p[contains(text(),'Abacus.AI Deconstructed')]";
    private static final String MODEL_HOSTING_HEADER = "//div[contains(text(),'Model Hosting and Monitoring')]";
    private static final String EXPLAINABLE_AI_HEADER = "//div[contains(text(),'Explainable AI and Debiasing')]";
    private static final String REAL_TIME_HEADER = "//div[contains(text(),'Real Time Feature Store For Machine Learning')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

    @FindBy(xpath=MODEL_HOSTING_LINK)
    private WebElement modelHostingLink;
    public WebElement getModelHostingLink() {
        return modelHostingLink;
    }

    @FindBy (xpath=EXPLAINABLE_AI_LINK)
    private WebElement explainableAILink;
    public WebElement getExplainableAILink() {
        return explainableAILink;
    }

    @FindBy (xpath=REAL_TIME_LINK)
    private WebElement realTimeLink;
    public WebElement getRealTimeLink() {
        return realTimeLink;
    }

    @FindBy(xpath=DECONSTRUCTED_HEADER)
    private WebElement deconstructedHeader;
    public WebElement getDeconstructedHeader() {
        return deconstructedHeader;
    }

    @FindBy(xpath=MODEL_HOSTING_HEADER)
    private WebElement modelHostingHeader;
    public WebElement getModelHostingHeader() {
        return modelHostingHeader;
    }

    @FindBy (xpath=EXPLAINABLE_AI_HEADER)
    private WebElement explainableAIHeader;
    public WebElement getExplainableAIHeader() {
        return explainableAIHeader;
    }

    @FindBy (xpath=REAL_TIME_HEADER)
    private WebElement realTimeHeader;
    public WebElement getRealTimeHeader() {
        return realTimeHeader;
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

    public void clickModelHostingLink() throws InterruptedException {
        waitForElementToAppear(getModelHostingLink());
        getModelHostingLink().click();
        Thread.sleep(300);
    }

    public void clickExplainableAILink() throws InterruptedException {
        waitForElementToAppear(getExplainableAILink());
        getExplainableAILink().click();
        Thread.sleep(300);
    }

    public void clickRealTimeLink() throws InterruptedException {
        waitForElementToAppear(getRealTimeLink());
        getRealTimeLink().click();
        Thread.sleep(300);
    }

    public void checkDeconstructed(){
        assertThat("Header should be displayed", getDeconstructedHeader().isDisplayed());
    }

    public void checkModelHosting(){
        assertThat("Header should be displayed", getModelHostingHeader().isDisplayed());
    }

    public void checkExplainableAI(){
        assertThat("Header should be displayed", getExplainableAIHeader().isDisplayed());
    }

    public void checkRealTime(){
        assertThat("Header should be displayed", getRealTimeHeader().isDisplayed());
    }
}
