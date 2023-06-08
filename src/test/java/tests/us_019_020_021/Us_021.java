package tests.us_019_020_021;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Traveller_dashboard_Us20_Us21_Page;
import pages.Traveller_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_021 extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Traveller dashboard test",
                "After logs in  as a user I can verify that the payment history has been displayed");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("The user goes to https://qa.tripandway.com/");
        Traveller_loginPage travellerLoginPage = new Traveller_loginPage();
        travellerLoginPage.acceptButonu.click();
        extentTest.info("The user clicks ACCEPT button");
        travellerLoginPage.loginButonuGiris.click();
        extentTest.info("The user clicks login button");
        travellerLoginPage.emailAddressKutusu.sendKeys("takimcalismasi11@gmail.com");
        extentTest.info("The user enters Email Address information");
        travellerLoginPage.passwordKutusu.sendKeys("deneme14.");
        extentTest.info("The user enters Password information");
        travellerLoginPage.loginButonu.submit();
        extentTest.info("The user clicks Login button");

        Traveller_dashboard_Us20_Us21_Page travellerDashboardUs20Us21Page=new Traveller_dashboard_Us20_Us21_Page();
        travellerDashboardUs20Us21Page.paymentHistoryButonu.click();
        extentTest.info("User clicks Payment History button");

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(travellerDashboardUs20Us21Page.ViewAllPayments.isDisplayed());
        extentTest.pass("All payments history has been tested and seen");

    }

}