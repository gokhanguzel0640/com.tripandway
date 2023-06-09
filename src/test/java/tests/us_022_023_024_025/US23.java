package tests.us_022_023_024_025;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Traveller_dashboard_Us22_Us23_Page;

import utilities.Driver;
import utilities.TestBaseRapor;

public class US23 extends TestBaseRapor {



    @Test
    public void test01(){
        extentTest=extentReports.createTest("Logout Test " +
                "User must be able to log out");

        Traveller_dashboard_Us22_Us23_Page traveller_loginPage = new Traveller_dashboard_Us22_Us23_Page();

        SoftAssert softAssert=new SoftAssert();

        extentTest.info("User goes to home page, enters email, password");

        //01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        //02_User clicks on the "Login" button,enters "Email and password" information
        traveller_loginPage.loginlinki.click();
        traveller_loginPage.acceptbuton.click();
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        //03_User clicks on the "Login" button
        traveller_loginPage.loginbuton.click();

        extentTest.info("Tests that you have successfully logged in");


        //04_User sees "Completed Orders" and "Pending Orders"
        String expectedContent = "Completed Orders";
        String actualContent = traveller_loginPage.completed.getText();
        softAssert.assertTrue(actualContent.contains(expectedContent));

        //05_User tests successful exit by pressing the "Logout" button
        traveller_loginPage.logoutButon.click();

        extentTest.info("The user was able to exit successfully");

        //close the page
        Driver.closeDriver();


    }
}
