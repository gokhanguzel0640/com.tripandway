package tests.us005_006_007_008_009_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Random;
@Test

public class Us009 extends TestBaseRapor {
    /*
   As a user, I should be able to verify that I can join the website's email newsletter.
     */
    FooterPage footerPage;
    Actions actions=new Actions(Driver.getDriver());
    public void test01(){
        extentTest=extentReports.createTest("newsletter participation test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");

        Assert.assertTrue(footerPage.newsLetterTextBox.isDisplayed());
        extentTest.info("Verifies that the email address box is viewable");

        Random r=new Random(); //random sınıfı
        int a=r.nextInt(100000000);
        String testEmail=("testemail"+a+"@tripandway.com");

        footerPage.newsLetterTextBox.sendKeys(testEmail);
        footerPage.newsLetterSubmitTus.click();

        Assert.assertTrue(footerPage.newsLetterToastMessage.isDisplayed());
        extentTest.pass("Confirms participation in the mail newsgroup");




    }
}
