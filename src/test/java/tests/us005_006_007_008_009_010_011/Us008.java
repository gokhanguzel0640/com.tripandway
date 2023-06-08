package tests.us005_006_007_008_009_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us008 extends TestBaseRapor {
    FooterPage footerPage;
    Actions actions;



    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Contact information imaging test");

        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
    /*
       As a user, I should be able to verify that the company's contact
        information in the footer section of the website visible and accessible.
         */


        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");


        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.footerPageAddres.isDisplayed());
        extentTest.pass("Verifies that the address section is viewable");
        Thread.sleep(2000);
        Driver.getDriver().close();
    }@Test
    public void test02() throws InterruptedException {
        extentTest=extentReports.createTest("address information display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");

        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");

        Assert.assertTrue(footerPage.adresIcon.isEnabled());
        extentTest.pass("Verifies that address information can be viewed");
        Thread.sleep(2000);
        Driver.getDriver().close();




    }@Test
    public void test03() throws InterruptedException {
        extentTest=extentReports.createTest("tphone information display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("goes to user footer");

        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes down to the footer of the page");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.telephoneIcon.isDisplayed());
        extentTest.pass("Verifies that phone information can be viewed");
        Thread.sleep(2000);
        Driver.getDriver().close();


    }@Test
    public void test04() throws InterruptedException {
        extentTest=extentReports.createTest("email information display test");

        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.emailIcon.isEnabled());
        extentTest.pass("Verifies that emial information is viewable");
        Thread.sleep(2000);
        Driver.getDriver().close();



    }

}
