package tests.us_026_027_028;

import org.apache.http.impl.auth.KerberosScheme;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
     // 06_Admin enters the categories section from the Blog section.
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
        extentTest.info("06_Admin clicks the Blog section.");
        Admin_dashboard_Us27_Us28_Page admin_dashboard_us27_us28_page=new Admin_dashboard_Us27_Us28_Page();
        admin_dashboard_us27_us28_page.dashboarCategoriesButton.click();
        extentTest.info("07_Admin clicks the categories from the Blog section.");
        admin_dashboard_us27_us28_page.blogCreateNewButton.click();
        extentTest.info("08_Admin clicks the Create Button");
        Actions actions = new Actions(Driver.getDriver());
        actions
                .sendKeys(ConfigReader.getProperty("blogCategoryName")+ Keys.TAB)
                .sendKeys(ConfigReader.getProperty("blogCategorySlug")+ Keys.TAB)
                .sendKeys(ConfigReader.getProperty("blogTitle")+ Keys.TAB)
                .sendKeys(ConfigReader.getProperty("blogMetaDescription")+ Keys.TAB + Keys.ENTER)
                .perform();
        extentTest.info("09_Admin enters information into " +
                "Category Name, Category Slug, Title and Meta description and then submits");
        String actualAdded=admin_dashboard_us27_us28_page.categoryAddedAlert.getText();
        softAssert.assertEquals(ConfigReader.getProperty("expectedAdded"),actualAdded);
        extentTest.pass("10_Admin verifies he can add a new category");
        admin_dashboard_us27_us28_page.search.sendKeys(ConfigReader.getProperty("blogCategoryName"));
        extentTest.info("11_Admin enters the category name into search box");
        ReusableMethods.bekle(5);
        admin_dashboard_us27_us28_page.categoryedit.click();
        extentTest.info("12_Admin clicks the edit button");
        actions
                .sendKeys(ConfigReader.getProperty("blogCategoryNameedit")+ Keys.TAB)
                .sendKeys(ConfigReader.getProperty("blogCategorySlugedit")+ Keys.TAB)
                .sendKeys(ConfigReader.getProperty("blogTitleedit")+ Keys.TAB)
                .sendKeys(ConfigReader.getProperty("blogMetaDescriptionedit")+ Keys.TAB + Keys.ENTER)
                .perform();
        extentTest.info("13_Admin updates information in the boxes and submits");
        String actualupdated=admin_dashboard_us27_us28_page.categoryUpdatedAlert.getText();
        softAssert.assertEquals(ConfigReader.getProperty("expectedUpdated"),actualupdated);
        extentTest.pass("14_Admin verifies he can update the category");
        ReusableMethods.bekle(5);
        admin_dashboard_us27_us28_page.search.sendKeys(ConfigReader.getProperty("blogCategoryNameedit"));
        extentTest.info("15_Admin enters the category name into search box");
        ReusableMethods.bekle(5);

        admin_dashboard_us27_us28_page.categorydelete.click();
        extentTest.info("16_Admin clicks delete button");
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("17_Admin accepts alert button");
        String actuaDeleted=admin_dashboard_us27_us28_page.categoryDeletedAlert.getText();
        softAssert.assertEquals(ConfigReader.getProperty("expectedDeleted"),actualupdated);
        extentTest.pass("18_Admin verifies he can delete the category");
        ReusableMethods.bekle(5);


    }

}
