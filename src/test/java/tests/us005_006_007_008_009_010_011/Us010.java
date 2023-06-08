package tests.us005_006_007_008_009_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us010 extends TestBaseRapor {
    /*
   As a user, I should be able to verify that I can view the terms and conditions page of the website.
     */
    FooterPage footerPage;
    Actions actions;
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("term and conditions display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.termsAndConditions.isDisplayed());
        Assert.assertTrue(footerPage.termsAndConditions.isEnabled());
        extentTest.pass("Verifies that term and conditions are displayed");
        Thread.sleep(5000);
        footerPage.termsAndConditions.click();
        extentTest.info("clicks the term and conditions button");
    }
}
