package tests.us_015_016_017_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaqPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_16 extends TestBaseRapor {

    @Test

    public void faqTesti(){

        extentTest = extentReports.createTest("FAQ Page test" +
                        "User can test that they can go to 'FAQ' page after navigating to 'TRIPANDWAY' page");
        //01_User goes to https://www.tripandway.com

        extentTest.info("User goes to https://www.tripandway.com");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        //02_ User clicks "FAQ"

        extentTest.info("User clicks \"FAQ\"");

       FaqPage faqPage = new FaqPage();

       faqPage.faqPageButton.click();
        //03_Tests that the items are accessible on the page that opens

        extentTest.info("Tests that the items are accessible on the page that opens");

        Assert.assertTrue(faqPage.faqPageElement.isEnabled());
        //04_Tests that the items are visible on the opened page

        extentTest.info("Tests that the items are visible on the opened page");

        Assert.assertTrue(faqPage.faqPageElement.isDisplayed());

        //05_User closes the page

        extentTest.pass("User closes the page");
        Driver.closeDriver();
    }

}
