package tests.us_026_027_028;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us27_Us28_Page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us027 extends TestBaseRapor {
    @Test
    public void Us027 (){
        ReusableMethods.adminlogin();
        Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
        ReusableMethods.bekle(3);
        extentTest=extentReports.createTest("Admin Dashboard Elemanları Testi", "Admin giriş yaptıktan sonra sırasıyla " +
                "General Settings, Page Settings, " +
                "Payment Settings,Dynamic Pages, " +
                "Language, Web Site Section  ve " +
                "Email Template sayfalarını " +
                "görüntüleyebildiğimi doğrulayabilmeliyim\n");

        SoftAssert softAssert = new SoftAssert();


        softAssert.assertTrue(admin_dashboard_page.generalSettingsButton.isDisplayed());
        extentTest.info("06_Admin 'General Settings' yazısını görüntüleyebilğini test eder");

        softAssert.assertTrue(admin_dashboard_page.pageSettingsButton.isDisplayed());
        extentTest.info("07_Admin 'Page Settings' yazısını görüntüleyebilğini test eder");

        softAssert.assertTrue(admin_dashboard_page.paymentSettingsButton.isDisplayed());
        extentTest.info("08_Admin 'Payment Settings' yazısını görüntüleyebilğini test eder.");

        softAssert.assertTrue(admin_dashboard_page.dynamicPagesButton.isDisplayed());
        extentTest.info("09_Admin 'Dynamic Pages' yazısını görüntüleyebilğini test eder.");

        softAssert.assertTrue(admin_dashboard_page.languageButton.isDisplayed());
        extentTest.info("10_Admin 'Language' yazısını görüntüleyebilğini test eder.");

        softAssert.assertTrue(admin_dashboard_page.emailTemplateButton.isDisplayed());
        extentTest.info("11_Admin 'Email Template' yazısını görüntüleyebilğini test eder.");
        softAssert.assertAll();
        extentTest.pass("Sitenin yönetim paneline admin bilgileri ile girdikten sonra yönetim panelini görüntüleyebildim\n");

        ReusableMethods.bekle(5);
        Driver.closeDriver();


    }
}


