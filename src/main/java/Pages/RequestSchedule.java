package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RequestSchedule extends BasePage {
    public RequestSchedule(WebDriver driver){
        super(driver);
    }
    private static final String CONTINUE_BUTTON = "//span[contains(text(),'Continue')]";
    private static final String FINISH_BUTTON = "//span[contains(text(),'Finish')]";
    private static final String EMAIL_INPUT = "//div[@class='ui form requestAccessForm success']//input[@type='email']";
    private static final String S_EMAIL_INPUT = "//div[@class='ui form requestConsForm success']//input[@type='email']";

    @FindBy (xpath=EMAIL_INPUT)
    private WebElement emailInput;
    public WebElement getEmailInput() {
        return emailInput;
    }

    @FindBy (xpath=S_EMAIL_INPUT)
    private WebElement sEmailInput;
    public WebElement getsEmailInput() {
        return sEmailInput;
    }

    @FindBy(xpath=CONTINUE_BUTTON)
    private WebElement continueButton;
    public WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy (xpath=FINISH_BUTTON)
    private WebElement finishButton;
    public WebElement getFinishButton() {
        return finishButton;
    }

    public void enterRequestEmail(String userName){
        waitForElementToAppear(getEmailInput());
        getEmailInput().sendKeys(userName);
    }

    public void enterScheduleEmail(String userName){
        waitForElementToAppear(getsEmailInput());
        getsEmailInput().sendKeys(userName);
    }

    public void clickFinishButton(){
        waitForElementToAppear(getFinishButton());
        getFinishButton().click(); }

    public void checkRequestAndScheduleButtons() throws InterruptedException {
        clickRequestButton();
        enterRequestEmail("Test");
        closePopUp();
        clickScheduleButton();
        enterScheduleEmail("Test");
        closePopUp(); }
}
