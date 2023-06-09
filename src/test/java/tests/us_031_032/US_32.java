package tests.us_031_032;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us31_Us32_Page;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_32  extends TestBaseRapor{
    SoftAssert softAssert=new SoftAssert();
    Admin_dashboard_Us31_Us32_Page admin_dashboard_us31_us32_page=new Admin_dashboard_Us31_Us32_Page();
    Actions actions;
    Admin_dashboard_Page admin_dashboard_page=new Admin_dashboard_Page();
    protected static ExtentTest extentTest;

    @Test
    public void tc01(){

        extentTest=extentReports.createTest("Orders is displayed test","User should be able to verify that Orders section is accessible.");
        //1- User goes to https://qa.tripandway.com/admin/login
        //2- User enters  email address
        //3- User enters password
        //4- User clicks the login button
        ReusableMethods.adminlogin();
        ReusableMethods.bekle(2);
        extentTest.info("1- User goes to https://qa.tripandway.com/admin/login" +
                               "2- User enters  email address and password and clicks the login button" );
        //6- User clicks the Order section
        admin_dashboard_us31_us32_page.ordersSection.click();
        extentTest.info("User clicks the Order section.");
        //7-  User verifies that she has entered the order section.
        Assert.assertTrue(admin_dashboard_us31_us32_page.ordersText.isDisplayed());
        extentTest.pass("User verifies that she has entered the order section.");
        Driver.closeDriver();
    }
    @Test
    public void tc02(){
        extentTest=extentReports.createTest("Orders are in the list test","User should be able view all the orders placed");
        admin_dashboard_page=new Admin_dashboard_Page();
        //1- User goes to https://qa.tripandway.com/admin/login
        //2- User enters  email address
        //3- User enters password
        //4- User clicks the login button
        ReusableMethods.adminlogin();
        extentTest.info("1- User goes to https://qa.tripandway.com/admin/login" +
                               "2- User enters  email address and password and clicks the login button" );
        //6- User clicks the Order section
        admin_dashboard_us31_us32_page.ordersSection.click();
        extentTest.info("User clicks the Order section.");
        //8- The user verifies that all the orders have been seen in the order list
        Assert.assertTrue(admin_dashboard_us31_us32_page.ordersAmount.isDisplayed());
        extentTest.pass("All orders are seen in the order list");
        Driver.closeDriver();
    }

}
