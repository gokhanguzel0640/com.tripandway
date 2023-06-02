package tests.us_026_027_028;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us27_Us28_Page;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us028 extends TestBaseRapor {
    @Test
    public void Us028(){
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
        admin_dashboard_page.blogSectionButton.click();
        Admin_dashboard_Us27_Us28_Page admin_dashboard_us27_us28_page=new Admin_dashboard_Us27_Us28_Page();
        admin_dashboard_us27_us28_page.dashboarCategoriesButton.click();
        extentTest.info("05_Admin Blog section bölümünden kategoriler kısmına girer");

        admin_dashboard_us27_us28_page.blogCreateNewButton.click();
        extentTest.info("06_Admin yeni kategori ekler");

        extentTest.info("07_Admin yeni kategoriyi düzenleyebildiğini test eder");
        extentTest.info("08_Admin yeni kategoriyi silebildiğini test eder");
     //
     //

    }

}
