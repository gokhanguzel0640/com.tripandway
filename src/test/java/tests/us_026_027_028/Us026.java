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
     ReusableMethods.adminlogin();

     extentTest=extentReports.createTest("Admin Login Görüntüleme Testi", "Sitenin yönetim paneline admin bilgileri ile \" +\n" +
             "                     \"girip yönetim panelini görüntüleyebildiğimi doğrulayabilmeliyim\\n\"\");");


     Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
     SoftAssert softAssert = new SoftAssert();
     softAssert.assertTrue(admin_dashboard_page.dashboardButton.isDisplayed());
     extentTest.info("05_Admin 'Dashboard' yazısını görüntüleyebilir");
     ReusableMethods.bekle(5);
     softAssert.assertAll();
     extentTest.pass("Sitenin yönetim paneline admin bilgileri ile girdikten sonra yönetim panelini görüntülenebildim");
     Driver.closeDriver();




    }

}
