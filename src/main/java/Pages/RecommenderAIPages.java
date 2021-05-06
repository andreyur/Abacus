package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class RecommenderAIPages extends BasePage {
    public RecommenderAIPages(WebDriver driver){
        super(driver);
    }
    private static final String PERSONALIZED_RECOMMENDATIONS_LINK = "//a[@class='linkNon'][@href='/user_recommendations']";
    private static final String RELATED_ITEMS_LINK = "//a[@class='linkNon'][@href='/user_related']";
    private static final String PERSONALIZED_SEARCH_LINK = "//a[@class='linkNon'][@href='/user_rankings']";
    private static final String REAL_RECOMMENDATIONS_LINK = "//a[@class='linkNon'][@href='/feed_recommend']";
    private static final String RECOMMENDER_HEADER = "//div[contains(text(),'Recommender AI')]";
    private static final String PERSONALIZED_RECOMMENDATIONS_HEADER = "//div[contains(text(),'Personalized Recommendations')]";
    private static final String RELATED_ITEMS_HEADER = "//div[contains(text(),'Related Items')]";
    private static final String PERSONALIZED_SEARCH_HEADER = "//div[contains(text(),'Personalized Search')]";
    private static final String REAL_RECOMMENDATIONS_HEADER = "//div[contains(text(),'Real-Time Feed Recommendations')]";
    private static final String REQUEST_BUTTON = "//td/span[contains(text(),'Request Access')]";
    private static final String SCHEDULE_BUTTON = "//td/span[contains(text(),'Schedule Free Consultation')]";
    private static final String PLAY_BUTTONS = "img.imgHover";

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

    @FindBy (xpath=RECOMMENDER_HEADER)
    private WebElement recommenderHeader;
    public WebElement getRecommenderHeader() {
        return recommenderHeader;
    }

    @FindBy (xpath=PERSONALIZED_RECOMMENDATIONS_HEADER)
    private WebElement personalizedRecommendationsHeader;
    public WebElement getPersonalizedRecommendationsHeader() {
        return personalizedRecommendationsHeader;
    }

    @FindBy (xpath=RELATED_ITEMS_HEADER)
    private WebElement relatedItemsHeader;
    public WebElement getRelatedItemsHeader() {
        return relatedItemsHeader;
    }

    @FindBy (xpath=PERSONALIZED_SEARCH_HEADER)
    private WebElement personalizedSearchHeader;
    public WebElement getPersonalizedSearchHeader() {
        return personalizedSearchHeader;
    }

    @FindBy (xpath=REAL_RECOMMENDATIONS_HEADER)
    private WebElement realRecommendationsHeader;
    public WebElement getRealRecommendationsHeader() {
        return realRecommendationsHeader;
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

    public void clickPersonalizedRecommendationsLink() throws InterruptedException {
        waitForElementToAppear(getRecommenderHeader());
        Actions actions = new Actions(driver);
        actions.moveToElement(getRecommenderHeader());
        actions.perform();
        getPersonalizedRecommendationsLink().click();
        Thread.sleep(300);
    }

    public void clickRelatedItemsLink() throws InterruptedException {
        waitForElementToAppear(getRelatedItemsLink());
        getRelatedItemsLink().click();
        Thread.sleep(300);
    }

    public void clickPersonalizedSearchLink() throws InterruptedException {
        waitForElementToAppear(getPersonalizedSearchLink());
        getPersonalizedSearchLink().click();
        Thread.sleep(300);
    }

    public void clickRealTimeFeedRecommendationsLink() throws InterruptedException {
        waitForElementToAppear(getRealRecommendationsLink());
        getRealRecommendationsLink().click();
        Thread.sleep(300);
    }

    public void checkRecommenderAI(){
        assertThat("Header should be displayed", getRecommenderHeader().isDisplayed());
    }

    public void checkPersonalizedRecommendations(){
        assertThat("Header should be displayed", getPersonalizedRecommendationsHeader().isDisplayed());
    }

    public void checkRelatedItems(){
        assertThat("Header should be displayed", getRelatedItemsHeader().isDisplayed());
    }

    public void checkPersonalizedSearch(){
        assertThat("Header should be displayed", getPersonalizedSearchHeader().isDisplayed());
    }

    public void checkRealTimeFeedRecommendations(){
        assertThat("Header should be displayed", getRealRecommendationsHeader().isDisplayed());
    }
}
