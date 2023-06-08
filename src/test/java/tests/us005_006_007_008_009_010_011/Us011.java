package tests.us005_006_007_008_009_010_011;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us011 extends TestBaseRapor {
    FooterPage footerPage;
    Actions actions;
    /*
   As a user, I should be able to verify that I can view the privacy policy page of the website.
     */
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("privacy policy görüntüleme testi");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.privacyPolicy.isDisplayed());
        Assert.assertTrue(footerPage.privacyPolicy.isDisplayed());
        extentTest.pass("Verifies that the privacypolicy section is viewed and active");
        Thread.sleep(3000);
        footerPage.privacyPolicy.click();
        extentTest.info("clicks on privacy policy page");

    }
}
