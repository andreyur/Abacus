import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static Pages.BasePage.BASE_URL;

public class FirstTest  {
    WebDriver driver;
    Header header;
    HomePage homePage;
    AIOperationsPages aiOperationsPages;
    FraudAndSecurity fraudAndSecurity;
    ForecastingPlanningPages forecastingPlanningPages;
    RequestSchedule rs;
@BeforeSuite
public void setUp() throws IOException {
        // Initialization WebDriver
        driver = BrowserFactory.getDriver("CHROME");
        homePage = new HomePage(driver);
        header = new Header(driver);
        rs = new RequestSchedule(driver);
        homePage.open(BASE_URL);
        }
        @Test
        public void firstTest() throws IOException, InterruptedException {
        Thread.sleep(500);
        aiOperationsPages = header.openAIForITOperationsLink();
        Thread.sleep(500);
        aiOperationsPages.checkAIForITOperations();
        rs.checkRequestAndScheduleButtons();
        aiOperationsPages.clickPlayButtons();
        aiOperationsPages.checkPressLink();
        aiOperationsPages.clickCloudAlertLink();
        aiOperationsPages.checkCloudSpendAlerts();
        rs.checkRequestAndScheduleButtons();
        aiOperationsPages.clickPlayButtons();
        aiOperationsPages.clickBackButton();
        aiOperationsPages.clickEarlyDetectionLink();
        aiOperationsPages.checkEarlyIncidentDetection();
        rs.checkRequestAndScheduleButtons();
        aiOperationsPages.clickPlayButtons();
        aiOperationsPages.clickBackButton();
        aiOperationsPages.clickPredictiveMaintenanceLink();
        aiOperationsPages.checkPredictiveMaintenance();
        rs.checkRequestAndScheduleButtons();
        aiOperationsPages.clickPlayButtons();
        aiOperationsPages.clickBackButton();
        Thread.sleep(500);
        header.openHomeLink();
        }

        @Test
        public void secondTest() throws IOException, InterruptedException {
                Thread.sleep(500);
                fraudAndSecurity = header.openFraudSecurityLink();
                Thread.sleep(500);
                fraudAndSecurity.checkFraudSecurity();
                rs.checkRequestAndScheduleButtons();
                fraudAndSecurity.clickPlayButtons();
                fraudAndSecurity.checkPressLink();
                fraudAndSecurity.clickAccountTakeoverLink();
                fraudAndSecurity.checkAccountTakeover();
                rs.checkRequestAndScheduleButtons();
                fraudAndSecurity.clickPlayButtons();
                fraudAndSecurity.clickBackButton();
                fraudAndSecurity.clickTransactionCardLink();
                fraudAndSecurity.checkTransactionCard();
                rs.checkRequestAndScheduleButtons();
                fraudAndSecurity.clickPlayButtons();
                fraudAndSecurity.clickBackButton();
                fraudAndSecurity.clickIntelligentDetectionLink();
                fraudAndSecurity.checkIntelligentDetection();
                rs.checkRequestAndScheduleButtons();
                fraudAndSecurity.clickPlayButtons();
                fraudAndSecurity.clickBackButton();
                Thread.sleep(500);
                header.openHomeLink();
        }

        @Test
        public void thirdTest() throws IOException, InterruptedException {
                Thread.sleep(500);
                forecastingPlanningPages = header.openForecastingPlanningLink();
                Thread.sleep(500);
                forecastingPlanningPages.checkForecastingPlanning();
                rs.checkRequestAndScheduleButtons();
                forecastingPlanningPages.clickPlayButtons();
                forecastingPlanningPages.checkPressLink();
                forecastingPlanningPages.clickDemandForecastingPLink();
                forecastingPlanningPages.checkDemandForecasting();
                rs.checkRequestAndScheduleButtons();
                forecastingPlanningPages.clickPlayButtons();
                forecastingPlanningPages.clickBackButton();
                forecastingPlanningPages.clickRealForecastingPLink();
                forecastingPlanningPages.checkRealForecasting();
                rs.checkRequestAndScheduleButtons();
                forecastingPlanningPages.clickPlayButtons();
                forecastingPlanningPages.clickBackButton();
                forecastingPlanningPages.clickFinancialForecastingPLink();
                forecastingPlanningPages.checkFinancialForecasting();
                rs.checkRequestAndScheduleButtons();
                forecastingPlanningPages.clickPlayButtons();
                forecastingPlanningPages.clickBackButton();
                Thread.sleep(500);
                header.openHomeLink();
        }
}
