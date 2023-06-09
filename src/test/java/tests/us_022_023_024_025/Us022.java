package tests.us_022_023_024_025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Traveller_dashboard_Us22_Us23_Page;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us022 extends TestBaseRapor{
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01(){
        extentTest=extentReports.createTest("Forget Password Login Test " +
                "The user should be able to change their password via the forgot password button");

        extentTest.info("User goes to homepage, accepts cookies");

//01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        Traveller_dashboard_Us22_Us23_Page traveller_loginPage = new Traveller_dashboard_Us22_Us23_Page();
        //02_User clicks on the "Login" button
        traveller_loginPage.loginlinki.click();
        //User accepts cookies
        traveller_loginPage.acceptbuton.click();
//03_User clicks on "Forget Password" button
        extentTest.info("Clicks the Forget Password button");
        traveller_loginPage.forgetPasswordButon.click();
//04_User clicks on the "Email Address" tab
        extentTest.info("Enters the registered email address");
        traveller_loginPage.forgetEmailTab.click();
//05_User enters the Email Address where the password is registered
        traveller_loginPage.forgetEmailTab.sendKeys("yekta2124@gmail.com");
//06_User clicks on the "Submit" button
        traveller_loginPage.submitButon.click();
//07_User sees"Please check your email to get password reset information"
        softAssert.assertTrue(traveller_loginPage.sifreSifirlama.isDisplayed());

        extentTest.pass("The user was able to successfully change their password via the Forget Password link");

        //close the page
        Driver.closeDriver();
    }

    @Test
    public void test02() {

        extentTest=extentReports.createTest("Update Test " +
                "The user must be able to successfully change their password");

        //01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        Traveller_dashboard_Us22_Us23_Page traveller_loginPage = new Traveller_dashboard_Us22_Us23_Page();

        extentTest.info("User goes to homepage");

        //02_User clicks on the "Login" button
        traveller_loginPage.loginlinki.click();
        //User accepts cookies
        traveller_loginPage.acceptbuton.click();
        //03_User enters "Email" and "Password"
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        //05_User clicks on the "Login" button
        traveller_loginPage.loginbuton.click();

        WebElement Dashboard = Driver.getDriver().findElement(By.linkText("Dashboard"));

        //06_User tests the visibility of the "Dashboard" panel
        softAssert.assertTrue(Dashboard.isDisplayed());

        extentTest.info("User successfully logs in");

        //07_User clicks on "Update Password" button
        traveller_loginPage.UpdatePassword.click();

        traveller_loginPage.NewPasswordTab.click();
        //08_User creates a new password by clicking on "New Password sure
        traveller_loginPage.NewPasswordTab.sendKeys("123123Y.");
        //09_User clicks on the "Update" button
        traveller_loginPage.UpdateButon.click();
        //10_User sees "Password successfully updated"
        softAssert.assertTrue(traveller_loginPage.PUsuccessfully.isDisplayed());

        extentTest.pass("User was able to successfully change his password");

        //close the page
        Driver.closeDriver();
    }
    @Test
    public void test03() {
        extentTest=extentReports.createTest("New Password Login Test " +
                "User must be able to login");

        //01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        Traveller_dashboard_Us22_Us23_Page traveller_loginPage = new Traveller_dashboard_Us22_Us23_Page();
        extentTest.info("The user goes to the homepage, fills in the required fields");
        //02_User clicks on the "Login" button
        traveller_loginPage.loginlinki.click();
        //User accepts cookies
        traveller_loginPage.acceptbuton.click();
        extentTest.info("The user tests that she can login to the site with the new password she has created.");
        //03_User enters "Email Address" and "New Password"
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        //Login butonuna tiklar
        traveller_loginPage.loginbuton.click();


        extentTest.info("User tests that they are logged in by seeing the Dashbord text");

        WebElement Dashboard = Driver.getDriver().findElement(By.linkText("Dashboard"));
        //Kullanici "Dashboard" panelinin gorunur olmasiyla basarili login girisi yaptigini test eder
        softAssert.assertTrue(Dashboard.isDisplayed());

        extentTest.pass("User successfully logged in");

        //close the page
        Driver.closeDriver();
    }

}
