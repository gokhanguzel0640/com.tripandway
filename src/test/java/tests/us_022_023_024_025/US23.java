package tests.us_022_023_024_025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Packages_Page;
import pages.Traveller_loginPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US23 extends TestBaseRapor {



    @Test
    public void test01(){
        extentTest=extentReports.createTest("Logout Test " +
                "User must be able to log out");

        Traveller_loginPage travellerLoginPage=new Traveller_loginPage();
        Packages_Page packages_page = new Packages_Page();
        SoftAssert softAssert=new SoftAssert();

        extentTest.info("User goes to home page, enters email, password");

        //01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        //02_User clicks on the "Login" button,enters "Email and password" information
        travellerLoginPage.loginlinki.click();
        travellerLoginPage.acceptbuton.click();
        travellerLoginPage.email.sendKeys("yekta2124@gmail.com");
        travellerLoginPage.password.sendKeys("123123Y.");
        //03_User clicks on the "Login" button
        travellerLoginPage.loginbuton.click();

        extentTest.info("Tests that you have successfully logged in");


        //04_User sees "Completed Orders" and "Pending Orders"
        String expectedContent = "Completed Orders";
        String actualContent = packages_page.completed.getText();
        softAssert.assertTrue(actualContent.contains(expectedContent));

        //05_User tests successful exit by pressing the "Logout" button
        travellerLoginPage.logoutButon.click();

        extentTest.info("The user was able to exit successfully");

        //close the page
        Driver.closeDriver();


    }
}