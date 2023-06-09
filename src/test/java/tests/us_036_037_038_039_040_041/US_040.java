package tests.us_036_037_038_039_040_041;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_040 extends TestBaseRapor {
    @Test
    public void TC_01() {
        extentTest = extentReports.createTest("'Visit Website' button works properly",
        "An admin user can verify that the 'Visit Website' button works properly");
    Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info(" 01_Admin user reaches to https://qa.tripandway.com/admin/login address");
    Admin_loginPage adminLoginPage = new Admin_loginPage();
        adminLoginPage.email.sendKeys(ConfigReader.getProperty("admin32email"));
        extentTest.info(" 02_Admin user enters the email address");
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminsifre"));
        extentTest.info(" 03_Admin user enters the password");
        adminLoginPage.loginButton.submit();
        extentTest.info(" 04_Admin user clicks on the Login button");
    Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page admin_dashboard_us36_us37_us38_us39_us40_us41_page=new
                Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page();
        admin_dashboard_us36_us37_us38_us39_us40_us41_page.dropdownArrowSymbol.click();
         extentTest.info("05_Admin user clicks on the dropdown arrow symbol located below the menu");
        admin_dashboard_us36_us37_us38_us39_us40_us41_page.visitWebsiteButton.click();
         extentTest.info("06_Admin user clicks on the 'Visit Website' button");
        String firstWHD= Driver.getDriver().getWindowHandle();
    Set<String> WHDValuesSet = Driver.getDriver().getWindowHandles();
        String secondWHD= "";
        for (String eachWhd: WHDValuesSet
        ) {
            if (!eachWhd.equals(firstWHD)){
                secondWHD = eachWhd;
            }
        }
    Driver.getDriver().switchTo().window(secondWHD);
    Assert.assertTrue(admin_dashboard_us36_us37_us38_us39_us40_us41_page.registrationButton.isDisplayed());
        extentTest.pass("07_Admin user tests that 'Visit Website' button works properly");
    Driver.quitDriver();
    }
}