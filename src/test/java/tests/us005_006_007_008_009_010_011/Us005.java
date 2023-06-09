package tests.us005_006_007_008_009_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import javax.swing.*;

@Test
public class Us005 extends TestBaseRapor{
    /*
    As a user, I should be able to verify that the items in the Latest Packages section,
     located in the footer section of the website, are visible and active.
     */


    FooterPage footerPage;
    Actions actions;


    @Test
    public void test01(){
        extentTest= extentReports.createTest("lates Packages imaging test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());


        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");


        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");


        Assert.assertTrue(footerPage.footerPageLatestPackages.isDisplayed());
       Assert.assertTrue(footerPage.footerPageLatestPackages.isEnabled());
        extentTest.pass("Verifies that the LAtest Packages partition is viewable and active");

        String actualText=footerPage.footerPageLatestPackages.getText();
         String expectedText=ConfigReader.getProperty("latesPackagesExpectedText");

        Driver.closeDriver();

    }@Test

    public void test02() throws InterruptedException {
        extentTest=extentReports.createTest("Lates packages item 1 test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.footerPageLatestPackages.isDisplayed());
        Assert.assertTrue(footerPage.footerPageOge1.isDisplayed());
        extentTest.pass("Verifies that Lates Packages are viewable and active");

        Assert.assertTrue(footerPage.footerPageOge1.isEnabled());
        extentTest.pass("item1 is viewable and active");

        Thread.sleep(2000);


              Driver.closeDriver();



    }@Test
    public void test03() throws InterruptedException {
        extentTest=extentReports.createTest("Lates packages item 2 test");
         footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.footerPageLatestPackages.isDisplayed());
        extentTest.pass("Displays the LAtes Package in the footer");
        Assert.assertTrue(footerPage.footerPageOge2.isDisplayed());
        Assert.assertTrue(footerPage.footerPageOge2.isEnabled());
        extentTest.pass("item2 is viewable and active");
        Thread.sleep(2000);
        Driver.closeDriver();

    }@Test
    public void test04() throws InterruptedException {
        extentTest=extentReports.createTest("Lates packages item 3 test");
         footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        //extentTest.pass("sayfada cookiesi görüntüler") ;
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.footerPageLatestPackages.isDisplayed());
        extentTest.pass("Displays the LAtes Package in the footer");
        Assert.assertTrue(footerPage.footerPageOge3.isDisplayed());
        Assert.assertTrue(footerPage.footerPageOge3.isEnabled());
        extentTest.pass("item3 is viewable and active");

        Thread.sleep(5000);
        Driver.closeDriver();

    }@Test
    public void test05() throws InterruptedException {
        extentTest=extentReports.createTest("Lates packages item 4 test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
       // Assert.assertTrue(footerPage.cookies.isDisplayed());
       // extentTest.pass("cookiesi görüntüler");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.footerPageLatestPackages.isDisplayed());
        extentTest.pass("Displays the LAtes Package in the footer");
        Assert.assertTrue(footerPage.footerPageOge4.isDisplayed());
        Assert.assertTrue(footerPage.footerPageOge4.isEnabled());
        extentTest.pass("item4 is viewable and active");
        Thread.sleep(5000);
         Driver.closeDriver();
    }@Test
    public void test06() throws InterruptedException {
        extentTest=extentReports.createTest("Lates packages item 5 test");
         footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.footerPageLatestPackages.isDisplayed());
        extentTest.pass("Displays the LAtes Package in the footer");
        Assert.assertTrue(footerPage.footerPageOge5.isDisplayed());
        Assert.assertTrue(footerPage.footerPageOge5.isEnabled());
        extentTest.pass("item5 is viewable and active");
        Thread.sleep(5000);
         Driver.closeDriver();

    }

}
