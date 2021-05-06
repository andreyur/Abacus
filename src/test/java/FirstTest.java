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
    PredictiveModelingPage predictiveModelingPage;
    MarketingSalesPages marketingSalesPages;
    RecommenderAIPages recommenderAIPages;
    AnomalyDetectionPages anomalyDetectionPages;
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
                predictiveModelingPage = header.openPredictiveModelingLink();
                predictiveModelingPage.checkPredictiveModeling();
                rs.checkRequestAndScheduleButtons();
                predictiveModelingPage.clickPlayButtons();
                predictiveModelingPage.checkPressLink();
                Thread.sleep(500);
                header.openHomeLink();
        }

        @Test
        public void forthTest() throws IOException, InterruptedException {
                Thread.sleep(500);
                marketingSalesPages = header.openMarketingSalesAILink();
                Thread.sleep(500);
                marketingSalesPages.checkMarketingSalesAI();
                rs.checkRequestAndScheduleButtons();
                marketingSalesPages.clickPlayButtons();
                marketingSalesPages.checkPressLink();
                marketingSalesPages.clickPredictiveLeadLink();
                marketingSalesPages.checkPredictiveLeadScoring();
                rs.checkRequestAndScheduleButtons();
                marketingSalesPages.clickPlayButtons();
                marketingSalesPages.clickBackButton();
                marketingSalesPages.clickPersonalizedPromotionsLink();
                marketingSalesPages.checkPersonalizedPromotions();
                rs.checkRequestAndScheduleButtons();
                marketingSalesPages.clickPlayButtons();
                marketingSalesPages.clickBackButton();
                marketingSalesPages.clickCustomerPredictionLink();
                marketingSalesPages.checkCustomerChurnPrediction();
                rs.checkRequestAndScheduleButtons();
                marketingSalesPages.clickPlayButtons();
                marketingSalesPages.clickBackButton();
                marketingSalesPages.clickSalesForecastingPLink();
                marketingSalesPages.checkSalesRevenueForecasting();
                rs.checkRequestAndScheduleButtons();
                marketingSalesPages.clickPlayButtons();
                marketingSalesPages.clickBackButton();
                Thread.sleep(500);
                header.openHomeLink();
        }

        @Test
        public void fifthTest() throws IOException, InterruptedException {
                Thread.sleep(500);
                recommenderAIPages = header.openRecommenderAILink();
                Thread.sleep(500);
                recommenderAIPages.checkRecommenderAI();
                rs.checkRequestAndScheduleButtons();
                recommenderAIPages.clickPlayButtons();
                recommenderAIPages.checkPressLink();
                recommenderAIPages.clickPersonalizedRecommendationsLink();
                recommenderAIPages.checkPersonalizedRecommendations();
                rs.checkRequestAndScheduleButtons();
                recommenderAIPages.clickPlayButtons();
                recommenderAIPages.clickBackButton();
                recommenderAIPages.clickRelatedItemsLink();
                recommenderAIPages.checkRelatedItems();
                rs.checkRequestAndScheduleButtons();
                recommenderAIPages.clickPlayButtons();
                recommenderAIPages.clickBackButton();
                recommenderAIPages.clickPersonalizedSearchLink();
                recommenderAIPages.checkPersonalizedSearch();
                rs.checkRequestAndScheduleButtons();
                recommenderAIPages.clickPlayButtons();
                recommenderAIPages.clickBackButton();
                recommenderAIPages.clickRealTimeFeedRecommendationsLink();
                recommenderAIPages.checkRealTimeFeedRecommendations();
                rs.checkRequestAndScheduleButtons();
                recommenderAIPages.clickPlayButtons();
                recommenderAIPages.clickBackButton();
                Thread.sleep(500);
                header.openHomeLink();
        }

        @Test
        public void sixthTest() throws IOException, InterruptedException {
                Thread.sleep(500);
                anomalyDetectionPages = header.openAnomalyDetectionLink();
                Thread.sleep(500);
                anomalyDetectionPages.checkAnomalyDetection();
                rs.checkRequestAndScheduleButtons();
                anomalyDetectionPages.clickPlayButtons();
                anomalyDetectionPages.checkPressLink();
                anomalyDetectionPages.clickTimeseriesAnomalyDetectionLink();
                anomalyDetectionPages.checkTimeseriesAnomalyDetection();
                rs.checkRequestAndScheduleButtons();
                anomalyDetectionPages.clickPlayButtons();
                anomalyDetectionPages.clickBackButton();
                anomalyDetectionPages.clickEventStreamAnomalyDetectionLink();
                anomalyDetectionPages.checkEventStreamAnomalyDetection();
                rs.checkRequestAndScheduleButtons();
                anomalyDetectionPages.clickPlayButtons();
                anomalyDetectionPages.clickBackButton();
                Thread.sleep(500);
                header.openHomeLink();
        }
}
