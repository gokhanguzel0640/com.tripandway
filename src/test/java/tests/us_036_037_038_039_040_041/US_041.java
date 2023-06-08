package tests.us_036_037_038_039_040_041;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class US_041 extends TestBaseRapor {
    @Test
    public void TC_01() {
         extentTest = extentReports.createTest("Logging out from the admin account and returning to the main screen.",
         "An admin can log out from the admin account and turn back to main screen of admin login page");
    Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
         extentTest.info(" 01_Admin user reaches to https://qa.tripandway.com/admin/login address");
    Admin_loginPage adminLoginPage = new Admin_loginPage();
        adminLoginPage.email.sendKeys(ConfigReader.getProperty("admin32email"));
         extentTest.info(" 02_Admin user enters the email address");
        adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminsifre"));
         extentTest.info(" 03_Admin user enters the password");
        adminLoginPage.loginButton.submit();
         extentTest.info(" 04_Admin user clicks on the Login button");
    Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page admin_dashboard_us36_us37_us38_us39_us40_us41_page = new
                Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page();
        admin_dashboard_us36_us37_us38_us39_us40_us41_page.adminProfilePhoto.click();
         extentTest.info(" 05_Admin user clicks on the admin profile icon");
        admin_dashboard_us36_us37_us38_us39_us40_us41_page.profileLogoutButton.click();
         extentTest.info("06_Admin user clicks on the logout button");
    Assert.assertTrue(adminLoginPage.password.isDisplayed());
         extentTest.pass("07_Admin user tests that return the main screen of admin login page");
    }
}

