package tests.us_031_032;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Us31_Us32_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_31 extends TestBaseRapor{
    SoftAssert softAssert=new SoftAssert();
    Admin_dashboard_Us31_Us32_Page admin_dashboard_us31_us32_page=new Admin_dashboard_Us31_Us32_Page();
    Actions actions=new Actions(Driver.getDriver());
    protected static ExtentTest extentTest;


    @Test
    public void tc01(){
        extentTest=extentReports.createTest("The Packages Section is Available Test",
                                           "User verifies that she has entered the packages section.");
        //1- User goes to https://qa.tripandway.com/admin/login
        //2- User enters  email address
        //3- User enters password
        //4- User clicks the login button
        ReusableMethods.adminlogin();
        extentTest.info( "1- User goes to https://qa.tripandway.com/admin/login" +
                               "  2- User enters  email address and password and clicks the login button." );
        //5- User verifies that she has entered the admin panel
        softAssert.assertTrue(admin_dashboard_us31_us32_page.adminPanelText.isDisplayed());
        //6- User clicks the  Packages section
        admin_dashboard_us31_us32_page.packagesSectionButton.click();
        extentTest.info("User clicks the Packages section.");
        //7- User verifies that she has entered the packages section.
        softAssert.assertTrue(admin_dashboard_us31_us32_page.packagesText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("User verifies that she has entered the packages section.");
        Driver.closeDriver();
    }
    @Test
    public void tc02(){
        extentTest=extentReports.createTest("Adding a new package test",
                                           "User should be able to add a new package.");
        //1- User goes to https://qa.tripandway.com/admin/login
        //2- User enters  email address
        //3- User enters password
        //4- User clicks the login button
        ReusableMethods.adminlogin();
        extentTest.info( "1- User goes to https://qa.tripandway.com/admin/login" +
                                "2- User enters  email address and password and clicks the login button." );
        //5- User clicks the Packages section
        admin_dashboard_us31_us32_page.packagesSectionButton.click();
        extentTest.info("User clicks the Packages section.");
        //6- User clicks "Add New" button
        admin_dashboard_us31_us32_page.packagesAddNewButton.click();
        extentTest.info("User clicks the Add New button.");
        //7- User enters name and slug
        admin_dashboard_us31_us32_page.nameBox.sendKeys(ConfigReader.getProperty("namePac") + Keys.TAB);
        admin_dashboard_us31_us32_page.slugBox.sendKeys(ConfigReader.getProperty("slug"));
        extentTest.info("User enters name and slug.");
        //8- User upload a photo
        String differentPath=System.getProperty("user.dir");
        String samePath="/src/test/java/tests/us_031_032/image.jpg";
        String filePath=differentPath+samePath;
        admin_dashboard_us31_us32_page.uploadPhotoButton.sendKeys(filePath);
        extentTest.info("User uploads a photo.");
        actions.sendKeys(Keys.TAB);
        //9- User enters description
        admin_dashboard_us31_us32_page.descriptionBox.sendKeys(ConfigReader.getProperty("descriptionp")+ Keys.TAB);
        extentTest.info("User enters description.");
        //10- User enters short description
        admin_dashboard_us31_us32_page.shortDescriptionBox.sendKeys(ConfigReader.getProperty("shortDescription")+ Keys.TAB);
        extentTest.info("User enters short description.");
        //11- User enters location
        admin_dashboard_us31_us32_page.locationBox.sendKeys(ConfigReader.getProperty("location")+ Keys.TAB);
        extentTest.info("User enters location.");
        //12-User enters start date
        admin_dashboard_us31_us32_page.startDateBox.sendKeys(ConfigReader.getProperty("startDate")+Keys.TAB);
        extentTest.info("User enters start date.");
        //13- User enters end date
        admin_dashboard_us31_us32_page.endDateBox.sendKeys(ConfigReader.getProperty("endDate")+Keys.TAB);
        extentTest.info("User enters end date.");
        //14- User enters last booking date
        admin_dashboard_us31_us32_page.lastBookingDateBox.sendKeys(ConfigReader.getProperty("lastBookingDate")+Keys.TAB);
        extentTest.info("User enters last booking date.");
        //15- User enters map
        admin_dashboard_us31_us32_page.mapBox.sendKeys(ConfigReader.getProperty("mapPac")+Keys.TAB);
        extentTest.info("User enters map.");
        //16-User enters itinerary
        admin_dashboard_us31_us32_page.itineraryBox.sendKeys(ConfigReader.getProperty("itinerary")+Keys.TAB);
        extentTest.info("User enters itinerary.");
        //17- User enters price
        admin_dashboard_us31_us32_page.priceBox.sendKeys(ConfigReader.getProperty("price")+Keys.TAB);
        extentTest.info("User enters price.");
        //18- User enters terms
        admin_dashboard_us31_us32_page.termsBox.sendKeys(ConfigReader.getProperty("terms")+Keys.TAB);
        extentTest.info("User enters terms.");
        //19- User selects No
        Select select= new Select(admin_dashboard_us31_us32_page.isFeaturedList);
        select.selectByVisibleText("No");
        extentTest.info("User selects No.");
        //20- User enters destination
        Select select1= new Select(admin_dashboard_us31_us32_page.destinationList);
        select1.selectByVisibleText("Salina Island, Italy");
        extentTest.info("User enters destination");
        actions.sendKeys(Keys.TAB);
        //21- User enters Title
        admin_dashboard_us31_us32_page.title.sendKeys(ConfigReader.getProperty("packageTitle")+Keys.TAB);
        extentTest.info("User enters title.");
        //22- User enters Meta description
        admin_dashboard_us31_us32_page.metaDescription.sendKeys(ConfigReader.getProperty("metaDesc"));
        extentTest.info("User enters Meta description.");
        //23- User clicks the submit button
        admin_dashboard_us31_us32_page.submitButton.click();
        extentTest.info("User clicks the submit button.");
        //24- User verifies that the package is displayed in the list
        softAssert.assertTrue(admin_dashboard_us31_us32_page.actualAddText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("User verifies that the package is displayed in the list.");
    }
    @Test
    public void tc03(){
        extentTest= extentReports.createTest("Package Edit and Delete Test", "User verifies that the package can be edit and delete");
        //1- User goes to https://qa.tripandway.com/admin/login
        //2- User enters  email address
        //3- User enters password
        //4- User clicks the login button
        ReusableMethods.adminlogin();
        extentTest.info( "1- User goes to https://qa.tripandway.com/admin/login" +
                               "2- User enters  email address and password and clicks the login button." );
        //5- User clicks the  Packages section
        admin_dashboard_us31_us32_page.packagesSectionButton.click();
        extentTest.info("User clicks the Packages section.");
        //6- User clicks edit package icon
        admin_dashboard_us31_us32_page.editButton.click();
        extentTest.info("User clicks edit package icon.");
        //7- User changes the package name
        admin_dashboard_us31_us32_page.editNameBox.sendKeys(ConfigReader.getProperty("newName"));
        extentTest.info("User changes the package name.");
        //8- User clicks the update button
        admin_dashboard_us31_us32_page.editUpdateButton.click();
        extentTest.info("User clicks the update button");
        //9- User verifies that the package is updated
        softAssert.assertTrue(admin_dashboard_us31_us32_page.uptadeSucText.isDisplayed());
        extentTest.pass("User verifies that the package is updated.");
        //10- User clicks delete button
        admin_dashboard_us31_us32_page.deleteButton.click();
        extentTest.info("User clicks delete button.");
        //11- User clicks Ok button on the "Are you sure text"
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("User clicks Ok button on the \"Are you sure\"text");
        //12- User verifies that the package is deleted.
        softAssert.assertTrue(admin_dashboard_us31_us32_page.deleteSucText.isDisplayed());
        softAssert.assertAll();
        extentTest.pass("User verifies that the package is deleted");
        Driver.closeDriver();
    }
}
