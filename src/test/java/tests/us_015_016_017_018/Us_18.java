package tests.us_015_016_017_018;

import org.testng.annotations.Test;
import pages.Traveller_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_18 extends TestBaseRapor {
    @Test
    public void kayitTesti(){

        extentTest = extentReports.createTest("Login Test" + "The user tests that they can log in successfully.");

        //01_User goes to https://www.tripandway.com

        extentTest.info("User goes to https://www.tripandway.com");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));

        //02_User goes to login page

        extentTest.info("User goes to login page");
        Traveller_loginPage travellerLoginPage = new Traveller_loginPage();

        travellerLoginPage.loginPageButton.click();

        //03_User enters email address

        extentTest.info("User enters email address");
        travellerLoginPage.emailBox.sendKeys("takimcalismasi11@gmail.com");


        //04_User enters password

        extentTest.info("User enters password");
        travellerLoginPage.passwordBox.sendKeys("deneme14.");

        //05_User accepts Cookies

        extentTest.info("User accepts Cookies");
        travellerLoginPage.acceptCookies.click();

        //06_User presses the login button

        extentTest.info("User presses the login button");
        travellerLoginPage.loginButton.click();

        travellerLoginPage.comletedOrdersButton.click();

        //07_User closes the page
        extentTest.pass("User closes the page");
        Driver.closeDriver();

    }

}
