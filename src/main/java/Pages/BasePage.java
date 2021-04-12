package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class BasePage {
    public static final String BASE_URL="https://preprod.abacus.ai/";
    public static final String TEST_USER="lushpigana@gmail.com";
    public static final String TEST_PASS="iiiiii12";

    private static final String LOADING_ICON = "div.vld-icon";
    protected WebDriver driver;
    private Wait<WebDriver> wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=LOADING_ICON)
    private WebElement loadingIcon;
    public WebElement getLoadingIcon() {
        return loadingIcon;
    }

    public void waitForElementToAppear(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (Exception e){
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
    }

    protected void waitForElementToDisappear(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    protected void waitForTextToAppear(By locator, String text) {
        wait.until(ExpectedConditions.textToBe(locator, text));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }

    public void clickProfileIcon() {
        driver.findElement(By.xpath("//nav[@class='wide-nav-bar ng-star-inserted']//div[@class='profile']//span[@class='mat-button-wrapper']")).click();
    }

    public boolean isElementExisting(WebElement we) {
        try {
            we.isDisplayed();
            return true;
        } catch(NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isElementPresent(By by) {
        if(driver.findElements(by).size() > 0) return true;
        return false;
    }

    public void waitForLoadingIcon() throws InterruptedException {
        Thread.sleep(100);
        if(!driver.findElements(By.cssSelector("div.vld-icon")).isEmpty()) {
            waitForElementToDisappear(getLoadingIcon());
            Thread.sleep(200);
        }
    }
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            String methodName=result.getName().toString().trim();
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                FileUtils.copyFile(screenshot, new File("target/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public boolean isAttribtuePresent(WebElement element, String attribute) {
        Boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null){
                result = true;
            }
        } catch (Exception e) {}

        return result;
    }

    public boolean isElementHasClass(WebElement element, String classValue) {
        return element.getAttribute("class").contains(classValue);
    }

    public Boolean isPreprod(){
        boolean isPreprod = false;
        if(BASE_URL.contains("preprod")) isPreprod = true;
        return isPreprod;
    }
}
