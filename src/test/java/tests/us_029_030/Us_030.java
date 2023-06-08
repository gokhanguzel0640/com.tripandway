package tests.us_029_030;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us29_Us30_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us_030 extends TestBaseRapor {

    Actions actions;

    @Test
    public void test01(){
        extentTest = extentReports.createTest("Admin Blog Section Testi"+
                "\nKullanici Admin girişi yaptıktan sonra Blog Section bölümüne yeni blog yazısı ekleyebilmeli");


        // 01_ Kullanici https://qa.tripandway.com/admin/login adresine gider,
        //                                                     Email adresini girer,
        //                                                     Sifresini girer,
        //                                                     Login butonuna tiklar

        ReusableMethods.adminlogin();
        extentTest.info("Kullanici https://qa.tripandway.com/admin/login adresine gider, " +
                "\nEmail adresini girer, " +
                "\nSifresini girer, " +
                "\nLogin butonuna tiklar");

        // 02_'Destination' butonuna tıklar
        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        admin_dashboard_page.destinationsButton.click();
        extentTest.info("'Destination' butonuna tıklar");

        // 03_'Add New' butonuna tıklar
        Admin_dashboard_Us29_Us30_Page admin_dashboard_us29_us30_page = new Admin_dashboard_Us29_Us30_Page();
        admin_dashboard_us29_us30_page.addNewDestinationsButton.click();
        extentTest.info("'Add New' butonuna tıklar");

        // 04_Sırasıyla 'Name', 'Slug', 'Heading', 'Short Description', 'Package Heading', 'Package Subheading',
        //              'Detail Heading', 'Detail Subheading' bölümlerini doldurur
        actions = new Actions(Driver.getDriver());

        actions.sendKeys(ConfigReader.getProperty("destinationName")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("destinationSlug")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("destinationHeading")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("destinationShortDesc")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("packageHeading")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("packageSubheading")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("detailHeading")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("detailSubheading")).
                sendKeys(Keys.TAB).
                perform();

        extentTest.info("Sırasıyla 'Name', 'Slug', 'Heading', 'Short Description', 'Package Heading', " +
                                "\n'Package Subheading', 'Detail Heading', 'Detail Subheading' bölümlerini doldurur");

        // 05_'Dosya Seç' butonuna tıklar ve fotoğraf seçer
        String userDir = System.getProperty("user.dir");
        String samePath = "/src/test/java/tests/us_029_030/images.jpeg";
        String filePath = userDir + samePath;
        admin_dashboard_us29_us30_page.destinationDosyaSecButton.sendKeys(filePath);
        extentTest.info("'Dosya Seç' butonuna tıklar ve fotoğraf seçer");

        // 06_Sırasıyla 'Introduction', 'Experience', 'Weather', 'Hotel', 'Transportation', 'Culture', 'Title',
        //              'Meta Description' bölümlerini doldurur ve 'Submit' butonuna tıklar
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("introduction")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("experience")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("weather")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("hotel")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("transportation")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("culture")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("title")).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("metaDescription")).
                perform();

        admin_dashboard_us29_us30_page.addDestinationSubmit.click();
        extentTest.info("Sırasıyla 'Introduction', 'Experience', 'Weather', 'Hotel', 'Transportation', 'Culture'," +
                                " 'Title', 'Meta Description' bölümlerini doldurur ve 'Submit' butonuna tıklar");

        // 07_Destination'ın başarılı bir şekilde eklendiğini test eder

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(admin_dashboard_us29_us30_page.newDestinationText.isDisplayed());
        extentTest.pass("Destination'ın başarılı bir şekilde eklendiğini test eder");

    }

    @Test
    public void test02(){
        extentTest = extentReports.createTest("Admin Blog Section Testi"+
                "\nKullanici Admin girişi yaptıktan sonra Blog Section bölümüne yeni blog yazısı ekleyebilmeli");


        // 01_ Kullanici https://qa.tripandway.com/admin/login adresine gider,
        //                                                     Email adresini girer,
        //                                                     Sifresini girer,
        //                                                     Login butonuna tiklar

        ReusableMethods.adminlogin();
        extentTest.info("Kullanici https://qa.tripandway.com/admin/login adresine gider, " +
                "\nEmail adresini girer, " +
                "\nSifresini girer, " +
                "\nLogin butonuna tiklar");


        // 02_'Destination' butonuna tıklar
        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        admin_dashboard_page.destinationsButton.click();
        extentTest.info("'Destination' butonuna tıklar");

        // 02_'Action' bölümünden 'edit' işaretinin bulunduğu butona tıklar
        Admin_dashboard_Us29_Us30_Page admin_dashboard_us29_us30_page = new Admin_dashboard_Us29_Us30_Page();
        admin_dashboard_us29_us30_page.editDestinationButton.click();
        extentTest.info("'Action' bölümünden 'edit' işaretinin bulunduğu butona tıklar");

        // 03_İlgili birimleri düzenler ve 'Update' butonuna tıklayarak destination'ın düzenlenebilir olduğunu test eder
        admin_dashboard_us29_us30_page.destinationName.clear();
        admin_dashboard_us29_us30_page.destinationName.sendKeys(ConfigReader.getProperty("newDestinationName"));

        admin_dashboard_us29_us30_page.destinationSlug.clear();
        admin_dashboard_us29_us30_page.destinationSlug.sendKeys(ConfigReader.getProperty("newDestinationSlug"));

        admin_dashboard_us29_us30_page.updateDestinationButton.click();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(admin_dashboard_us29_us30_page.editDestinationText.isDisplayed());
        extentTest.pass("İlgili birimleri düzenler ve 'Update' butonuna tıklayarak destination'ın düzenlenebilir olduğunu test eder");


    }
}
