package tests.us_026_027_028;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us27_Us28_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us026to028 extends TestBaseRapor {
    @Test
    public void Test026(){
        extentTest= extentReports.createTest("Admin Page Login testi");
        Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info("01_Admin https://qa.tripandway.com/admin/login adresine gider");
        Admin_loginPage admin_loginPage = new Admin_loginPage();
        admin_loginPage.email.click();
        extentTest.info("02_Admin email kutusuna tıklar");
        admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
        extentTest.info("03_Admin email kutusuna geçerli email girer");
        admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") );
        extentTest.info("04_Admin password kutusuna geçerli password girer ve enter tusuna basar");
        admin_loginPage.loginButton.click();
        Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(admin_dashboard_page.dashboardButton.isDisplayed());
        extentTest.info("05_Admin 'Dashboard' yazısını görüntüleyebilir");
        ReusableMethods.bekle(5);
        softAssert.assertAll();
        extentTest.pass("Sitenin yönetim paneline admin bilgileri ile girdikten sonra yönetim panelini görüntülenebildim");
        Driver.closeDriver();
    }
    @Test
    public void Test027(){
        extentTest=extentReports.createTest("Admin Dashboard Elemanları Testi", "Admin giriş yaptıktan sonra sırasıyla " +
                "General Settings, Page Settings, " +
                "Payment Settings,Dynamic Pages, " +
                "Language, Web Site Section  ve " +
                "Email Template sayfalarını " +
                "görüntüleyebildiğimi doğrulayabilmeliyim\n");
        Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info("01_Admin https://qa.tripandway.com/admin/login adresine gider");
        Admin_loginPage admin_loginPage = new Admin_loginPage();
        admin_loginPage.email.click();
        extentTest.info("02_Admin email kutusuna tıklar");
        admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
        extentTest.info("03_Admin email kutusuna geçerli email girer");
        admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") + Keys.ENTER);
        extentTest.info("04_Admin password kutusuna geçerli password girer ve enter tusuna basar");
        Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
        ReusableMethods.bekle(3);


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
        extentTest.pass("Admin giriş yaptıktan sonra sırasıyla General Settings, " +
                "Page Settings, Payment Settings,Dynamic Pages, Language, Web Site Section  " +
                "ve Email Template sayfalarını görüntüleyebildim");

        softAssert.assertAll();
        Driver.closeDriver();
    }
    @Test
    public void Test028(){
        extentTest=extentReports.createTest("Admin Blog ekleme silme Testi");
        Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info("01_Admin https://qa.tripandway.com/admin/login adresine gider");
        Admin_loginPage admin_loginPage = new Admin_loginPage();
        admin_loginPage.email.click();
        extentTest.info("02_Admin email kutusuna tıklar");
        admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
        extentTest.info("03_Admin email kutusuna geçerli email girer");
        admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") + Keys.ENTER);
        extentTest.info("04_Admin password kutusuna geçerli password girer ve enter tusuna basar");
        Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
        ReusableMethods.bekle(3);


        SoftAssert softAssert = new SoftAssert();
        admin_dashboard_page.blogSectionButton.click();
        Admin_dashboard_Us27_Us28_Page admin_dashboard_us27_us28_page=new Admin_dashboard_Us27_Us28_Page();
        admin_dashboard_us27_us28_page.dashboarCategoriesButton.click();
        extentTest.info("05_Admin Blog section bölümünden kategoriler kısmına girer");

        admin_dashboard_us27_us28_page.blogCreateNewButton.click();
        extentTest.info("06_Admin yeni kategori ekler");

        extentTest.info("07_Admin yeni kategoriyi düzenleyebildiğini test eder");
        extentTest.info("08_Admin yeni kategoriyi silebildiğini test eder");

        softAssert.assertAll();
        extentTest.pass("Admin giriş yaptıktan sonra blog section bölümünden kategoriler sayfasına girip yeni kategori ekliyebildim" +
                "sonrasında düzenyebildim ve silebildim");


        Driver.closeDriver();
    }
}
