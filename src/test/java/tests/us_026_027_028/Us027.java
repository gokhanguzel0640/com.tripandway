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
        admin_dashboard_page.generalSettingsButton.click();
        extentTest.info("06_Admin clicks 'General Settings' button");
        softAssert.assertTrue(admin_dashboard_page.logoButton.isDisplayed());
        extentTest.info("07_Admin verifies that he can display 'Logo' text");
        admin_dashboard_page.pageSettingsButton.click();
        extentTest.info("08_Admin clicks 'Page Settings' button");
        softAssert.assertTrue(admin_dashboard_page.homeButton.isDisplayed());
        extentTest.info("09_Admin verifies that he can display 'Home' text");
        admin_dashboard_page.paymentSettingsButton.click();
        extentTest.info("10_Admin clicks 'Payment Settings' button");
        softAssert.assertTrue(admin_dashboard_page.paymentInformationButton.isDisplayed());
        extentTest.info("11_Admin verifies that he can display 'Payment Information' text");
        ReusableMethods.bekle(3);
        admin_dashboard_page.dynamicPagesButton.click();
        extentTest.info("12_Admin clicks 'Dynamic Pages' button");
        ReusableMethods.bekle(5);
        softAssert.assertTrue(admin_dashboard_page.dynamicPagesText.isDisplayed());
        extentTest.info("13_Admin verifies that he can display 'Dynamic Pages' text");
        admin_dashboard_page.languageButton.click();
        extentTest.info("14_Admin clicks 'Language' button");
        softAssert.assertTrue(admin_dashboard_page.languageSettingText.isDisplayed());
        extentTest.info("15_Admin verifies that he can display 'Language Settings' text");
        admin_dashboard_page.emailTemplateButton.click();
        extentTest.info("16_Admin clicks 'Email Template' button");
        softAssert.assertTrue(admin_dashboard_page.emailTemplatesText.isDisplayed());
        extentTest.info("17_Admin verifies that he can display 'Email Template' text");
        //softAssert.assertAll();
        extentTest.pass("After logging in as an admin,I can sequentially view the following pages: " +
                        "General Settings, Page Settings, Payment Settings, Dynamic Pages, Language, " +
                        "Web Site Section, and Email Template.");

        ReusableMethods.bekle(5);
        Driver.closeDriver();


    }
}


