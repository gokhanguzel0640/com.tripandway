package tests.us_015_016_017_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_17 extends TestBaseRapor {
    @Test

    public void  contactTesti(){

        extentTest = extentReports.createTest("Contact Page Test" +
                        "User can test that they can go to 'Contact' page after navigating to 'TRIPANDWAY' page");
        //01_User goes to https://www.tripandway.com
        extentTest.info("User goes to https://www.tripandway.com");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));

        //02_User tests that the "Contact" page is reachable
        extentTest.info("User tests that the \"Contact\" page is reachable");

        ContactPage contactPage = new ContactPage();

        contactPage.contactPageButton.click();
        //03_Tests that the opened page is in the active state

        extentTest.info("Tests that the opened page is in the active state");
        Assert.assertTrue(contactPage.contactPageButton.isEnabled());

        //04_User closes the page

        extentTest.pass("User closes the page");
        Driver.closeDriver();
    }

}
