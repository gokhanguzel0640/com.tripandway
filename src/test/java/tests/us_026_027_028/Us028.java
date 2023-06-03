package tests.us_026_027_028;

import org.apache.http.impl.auth.KerberosScheme;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us27_Us28_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.security.Key;

public class Us028 extends TestBaseRapor {
    @Test
    public void Us028(){
     // 01_Admin goes to https://qa.tripandway.com/admin/login
     // 02_Admin clicks on the email box
     // 03_Admin enters a valid email in the email box
     // 04_Admin enters a valid password in the password box
     // 05_Admin clicks the login button
     // 05_Admin enters the categories section from the Blog section.
     // 06_Admin adds new category
     // 07_Admin verifies that he can edit the new category
     // 07_Admin verifies that he can delete the new category
        extentTest=extentReports.createTest("Admin Blog Section Category Test",
                "After logging in as an admin, I should be able to verify " +
                        "that in the Blog Section, I can add a new category to the " +
                        "Categories section and confirm that the added category can be edited.");
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
        admin_dashboard_page.blogSectionButton.click();
        Admin_dashboard_Us27_Us28_Page admin_dashboard_us27_us28_page=new Admin_dashboard_Us27_Us28_Page();
        admin_dashboard_us27_us28_page.dashboarCategoriesButton.click();
        extentTest.info("05_Admin Blog section bölümünden kategoriler kısmına girer");

        admin_dashboard_us27_us28_page.blogCreateNewButton.click();
        extentTest.info("06_Admin yeni kategori ekler");
        Actions actions = new Actions(Driver.getDriver());

        actions
                .sendKeys("Category Name"+ Keys.TAB)
                .sendKeys("Category Slug"+ Keys.TAB)
                .sendKeys("Title"+ Keys.TAB)
                .sendKeys("Meta Description"+ Keys.TAB + Keys.ENTER)
                .perform();
        ReusableMethods.bekle(5);

        admin_dashboard_us27_us28_page.search.sendKeys("Category Name");
        ReusableMethods.bekle(5);
        admin_dashboard_us27_us28_page.categorydelete.click();
        ReusableMethods.bekle(5);




     //
     //

    }

}
