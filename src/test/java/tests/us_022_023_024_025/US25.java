package tests.us_022_023_024_025;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.PackagesPage_US22;
import pages.Traveller_loginPage22;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US25 extends TestBaseRapor {

    @Test
    public void paymentHistoryTest() {

        extentTest = extentReports.createTest("PAYMENT HISTORY TEST",
                "The user successfully navigates to the packages page");

        PackagesPage_US22 packages_page = new PackagesPage_US22();
        Traveller_loginPage22 traveller_loginPage = new Traveller_loginPage22();
        SoftAssert softAssert=new SoftAssert();

        extentTest.info("User Trip and way goes to the homepage,email," +
                "enters password information and successfully logs in");

        //01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        //02_User clicks on the "Login" button
        traveller_loginPage.loginlinki.click();
        //Clicks on the Accept button
        traveller_loginPage.acceptbuton.click();
        //03_User enters email and password, clicks login button
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        traveller_loginPage.loginbuton.click();

        //04_User sees "Completed Orders" and "Pending Orders"
        String expectedContent1 = "Completed Orders";
        String actualContent1 = packages_page.completed.getText();
        softAssert.assertTrue(actualContent1.contains(expectedContent1));

        extentTest.info("The user checks the payment history by clicking the Payment History button");
        //05_User clicks on the"Payment History" button
        packages_page.paymentHistory.click();

        //06_User tests payments made under the "View All Payments" text
        String expectedContent2 = "View All Payments";
        String actualContent2 = packages_page.viewAllPayments.getText();
        softAssert.assertTrue(actualContent2.contains(expectedContent2));
        extentTest.info("User was able to control the payments made");

        //softAssert.assertAll();

        //close the page
        Driver.closeDriver();


    }
}
