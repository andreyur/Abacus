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
    private static final String SKU_INPUT = "#sku";
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

    @FindBy(css=SKU_INPUT)
    private WebElement skuInput;
    public WebElement getSkuInput() {
        return skuInput;
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
}
