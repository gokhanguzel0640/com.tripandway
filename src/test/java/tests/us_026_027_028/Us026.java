package tests.us_026_027_028;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us026 extends TestBaseRapor {
    @Test
    public void Us026() {
         extentTest=extentReports.createTest("Admin Succesful Login Test",
            "I should be able to verify that I can access " +
            "the administration panel of the website using admin credentials and view the admin dashboard");
    Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
    extentTest.info("01_Admin goes to https://qa.tripandway.com/admin/login");
    Admin_loginPage admin_loginPage = new Admin_loginPage();
    admin_loginPage.email.click();
    extentTest.info("02_Admin clicks on the email box");
    admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
    extentTest.info("03_Admin enters a valid email in the email box");
    admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") );
    extentTest.info("04_Admin enters a valid password in the password box");
    admin_loginPage.loginButton.click();
    extentTest.info("05_Admin clicks the login button");

     Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
     SoftAssert softAssert = new SoftAssert();
     softAssert.assertTrue(admin_dashboard_page.dashboardButton.isDisplayed());
     extentTest.info("05_Admin verifies that admin dashboard is displayed");
     ReusableMethods.bekle(5);
     softAssert.assertAll();
     extentTest.pass("I can access the administration panel of the website " +
             "using admin credentials and view the admin dashboard");
     Driver.closeDriver();




    }

}
