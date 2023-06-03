package tests.us_026_027_028;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us27_Us28_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us027 extends TestBaseRapor {
    @Test
    public void Us027 (){
      //01_Admin goes to https://qa.tripandway.com/admin/login
      //02_Admin clicks on the email box
      //03_Admin enters a valid email in the email box
      //04_Admin enters a valid password in the password box
      //05_Admin clicks the login button
      //06_Admin verifies that he can display 'General Settings'
      //07_Admin verifies that he can display 'Page Settings'
      //08_Admin verifies that he can display 'Payment Settings'
      //09_Admin verifies that he can display 'Dynamic Pages'
      //10_Admin verifies that he can display 'Language'
      //11_Admin verifies that he can display 'Email Template'
        extentTest=extentReports.createTest("Admin Dashboard Elements Test",
                "After logging in as an admin, I should be able to verify that " +
                        "I can sequentially view the following pages: " +
                        "General Settings, Page Settings, Payment Settings, " +
                        "Dynamic Pages, Language, Web Site Section, and Email Template.");
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

        SoftAssert softAssert = new SoftAssert();

        Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
        softAssert.assertTrue(admin_dashboard_page.generalSettingsButton.isDisplayed());
        extentTest.info("06_Admin verifies that he can display 'General Settings'");

        softAssert.assertTrue(admin_dashboard_page.pageSettingsButton.isDisplayed());
        extentTest.info("07_Admin verifies that he can display 'Page Settings'");

        softAssert.assertTrue(admin_dashboard_page.paymentSettingsButton.isDisplayed());
        extentTest.info("08_Admin verifies that he can display 'Payment Settings'");

        softAssert.assertTrue(admin_dashboard_page.dynamicPagesButton.isDisplayed());
        extentTest.info("09_Admin verifies that he can display 'Dynamic Pages'");

        softAssert.assertTrue(admin_dashboard_page.languageButton.isDisplayed());
        extentTest.info("10_Admin verifies that he can display 'Language'");

        softAssert.assertTrue(admin_dashboard_page.emailTemplateButton.isDisplayed());
        extentTest.info("11_Admin verifies that he can display 'Email Template'");
        softAssert.assertAll();
        extentTest.pass("After logging in as an admin,I can sequentially view the following pages: " +
                        "General Settings, Page Settings, Payment Settings, Dynamic Pages, Language, " +
                        "Web Site Section, and Email Template.");

        ReusableMethods.bekle(5);
        Driver.closeDriver();


    }
}


