package tests.us_029_030;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us29_Us30_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_029 extends TestBaseRapor{

    Actions actions;
    @Test
    public void test01() {
        extentTest = extentReports.createTest(
                "Admin Blog Section Test" +
                "After reaching admin login section I should be able to add new blog post in Blog Section");


        // 01_ User reaches to https://qa.tripandway.com/admin/login,
        //                              Enters the e-mail address,
        //                              Enters the password,
        //                              Clicks on the Login button

        ReusableMethods.adminlogin();
        extentTest.info("User reaches to https://qa.tripandway.com/admin/login,\n" +
                                                           "Enters the e-mail address,\n" +
                                                           "Enters the password,\n" +
                                                           "Clicks on the Login button");

        // 02_ 'Blog Section' butonuna tıklar
        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        admin_dashboard_page.blogSectionButton.click();
        extentTest.info("Clicks on the 'Blog Section' button");

        // 03_ 'Blogs' butonuna tıklar
        Admin_dashboard_Us29_Us30_Page admin_dashboard_us29_us30_page = new Admin_dashboard_Us29_Us30_Page();
        admin_dashboard_us29_us30_page.blogsButton.click();
        extentTest.info("Clicks on the 'Blogs' button");

        // 04_ 'Add New' butonuna tıklar
        admin_dashboard_us29_us30_page.addNewBlogsButton.click();
        extentTest.info("Clicks on the 'Add New' button");

        // 05_ Sırasıyla 'Blog Title', 'Blog Slug', 'Blog Content', 'Blog Short Content' bölümelerini doldurur
        actions = new Actions(Driver.getDriver());

        actions.sendKeys(ConfigReader.getProperty("blogName")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("blogSlug")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("blogContent")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("blogShortContent")).perform();

        extentTest.info("Fills 'Blog Name', 'Blog Slug', 'Blog Content', 'Blog Brief Content' consequently");

        // 06_ 'Dosya Seç' butonuna tıklar ve fotoğraf seçer
        String userDir = System.getProperty("user.dir");
        String samePath = "/src/test/java/tests/us_029_030/image.jpg";
        String filePath = userDir + samePath;
        admin_dashboard_us29_us30_page.dosyaSecButton.sendKeys(filePath);
        extentTest.info("Clicks on the 'Choose File' button and selects photo");

        // 07_ 'Select Category' bölümünden seyehat türünü seçer
        Select select = new Select(admin_dashboard_us29_us30_page.selectCategory);
        select.selectByVisibleText(ConfigReader.getProperty("selectCategory"));
        extentTest.info("Selects the type of trip from the 'Select Category' section");

        // 08_ 'Show Comment?' bölümünden ilgili seçimi yapar
        Select select1 = new Select(admin_dashboard_us29_us30_page.showComment);
        select1.selectByVisibleText(ConfigReader.getProperty("showComment"));
        extentTest.info("'Show Comment?' choose the relevant choice from the section");

        // 09_ Sırasıyla 'Title' ve 'Meta Description' bölümlerini doldurur ve 'Submit' butonuna tıklar
        actions.sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("title")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("metaDescription")).
                perform();

        admin_dashboard_us29_us30_page.addBlogSubmit.submit();
        extentTest.info("Fills 'Title' and 'Meta Description' consequently and clicks 'Submit' button");

        // 10_ Blog yazısının başırılı bir şekilde eklendiğini test eder

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(admin_dashboard_us29_us30_page.newBlogText.isDisplayed());
        extentTest.pass("Tests that the blog post has been successfully added");


    }
        @Test
        public void test02(){
        extentTest = extentReports.createTest("Admin Blog Section Test" +
                                "\nUser should be able to verify that the inserted blog post is editable");

        // 01_ User reaches to https://qa.tripandway.com/admin/login,
            //                              Enters the e-mail address,
            //                              Enters the password,
            //                              Clicks on the Login button

        ReusableMethods.adminlogin();
        extentTest.info("User reaches to https://qa.tripandway.com/admin/login,\n" +
                                                            "Enters the e-mail address,\n"+
                                                            "Enters the password,\n" +
                                                            "Clicks on the Login button");


        // 02_ 'Blog Section' butonuna tıklar
        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        admin_dashboard_page.blogSectionButton.click();
        extentTest.info("Clicks on the 'Blog Section' button");

        // 03_ 'Blogs' butonuna tıklar
        Admin_dashboard_Us29_Us30_Page admin_dashboard_us29_us30_page = new Admin_dashboard_Us29_Us30_Page();
        admin_dashboard_us29_us30_page.blogsButton.click();
        extentTest.info("Clicks on the 'Blogs' button");

        // 04_Açılan sayfada ilgili blog yazısıdaki 'edit' butonuna tıklar
        admin_dashboard_us29_us30_page.editBlogButton.click();
        extentTest.info("Click on the 'edit' button in the related blog post on the opened page");

        // 05_Ilgili birimleri düzenler ve 'Update' butonuna tıklayarak yazının düzenlenebilir olduğunu test eder
        actions = new Actions(Driver.getDriver());

        actions.sendKeys(ConfigReader.getProperty("blogName2")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("blogSlug2")).perform();

        admin_dashboard_us29_us30_page.updateButton.submit();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(admin_dashboard_us29_us30_page.editBlogText.isDisplayed());

        extentTest.pass("The user edits the relevant units and tests that the text" +
                                            " is editable by clicking the 'Update' button");

    }

    @Test
    public void test03(){
        extentTest = extentReports.createTest("Admin Blog Section Test" +
                "\nUser should be able to verify that the added blog post can be deleted");

        // User reaches to https://qa.tripandway.com/admin/login,
        //                              Enters the e-mail address,
        //                              Enters the password,
        //                              Clicks on the Login button

        ReusableMethods.adminlogin();
        extentTest.info("User reaches to https://qa.tripandway.com/admin/login,\n" +
                                                    "Enters the e-mail address,\n" +
                                                    "Enters the password,\n" +
                                                    "Clicks on the Login button");

        // 02_ 'Blog Section' butonuna tıklar
        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        admin_dashboard_page.blogSectionButton.click();
        extentTest.info("Clicks on the 'Blog Section' button");

        // 03_ 'Blogs' butonuna tıklar
        Admin_dashboard_Us29_Us30_Page admin_dashboard_us29_us30_page = new Admin_dashboard_Us29_Us30_Page();
        admin_dashboard_us29_us30_page.blogsButton.click();
        extentTest.info("Clicks on the 'Blogs' button");

        // 04_Açılan sayfada ilgili blog yazısındaki 'delete' butonuna tıklar
        admin_dashboard_us29_us30_page.deleteBlogButton.click();
        extentTest.info("Clicks on the 'delete' button in the related blog post on the opened page");

        // 04_Çıkan alerts'de 'Tamam' butonuna tıklayarak blog yazısının silindiğini test eder
        Driver.getDriver().switchTo().alert().accept();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(admin_dashboard_us29_us30_page.deleteBlogText.isDisplayed());

        extentTest.pass("Tests that the blog post is deleted by clicking the 'OK' button on the alerts");




    }

}
