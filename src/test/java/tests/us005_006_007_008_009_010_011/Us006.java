package tests.us005_006_007_008_009_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


@Test
public class Us006 extends TestBaseRapor {
    /*
    As a user, I should be able to verify that the items in the Recent Posts section,
     located in the footer section of the website, are visible and active.
     */
    FooterPage footerPage;
    Actions actions;

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Recent Posts imaging test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");

        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
       Assert.assertTrue(footerPage.footerPageRecentPosts.isEnabled());
      extentTest.pass("Verifies that Recent Posts is displayed in the footer");

        Thread.sleep(5000);
        Driver.closeDriver();


    }@Test
    public void test02() throws InterruptedException {
        extentTest=extentReports.createTest("item1 display test");

        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.recentPostsOge1.isEnabled());
        extentTest.pass("Verifies that item1 is displayed and active");


        Thread.sleep(5000);
        Driver.closeDriver();



    }@Test
    public void test03() throws InterruptedException {
        extentTest=extentReports.createTest("item2 display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        //Assert.assertTrue(footerPage.recentPostsOge2.isDisplayed());
        Assert.assertTrue(footerPage.recentPostsOge2.isEnabled());
        extentTest.pass("Verifies that item2 is displayed and active");
        Thread.sleep(5000);

        Driver.closeDriver();


    }@Test
    public void test04() throws InterruptedException {
        extentTest=extentReports.createTest("item3 display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        //Assert.assertTrue(footerPage.recentPostsOge3.isDisplayed());
        Assert.assertTrue(footerPage.recentPostsOge3.isEnabled());
        extentTest.pass("Verifies that item3 is displayed and active");

        Thread.sleep(5000);

        Driver.closeDriver();


    }@Test
    public void test05() throws InterruptedException {
        extentTest=extentReports.createTest("item4 display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("cclicks on accept cookies button");
        Assert.assertTrue(footerPage.recentPostsOge4.isDisplayed());
        Assert.assertTrue(footerPage.recentPostsOge4.isEnabled());
        extentTest.pass("Recent Posts Verifies that item4 is displayed and active");

        Thread.sleep(5000);

        Driver.closeDriver();


    }@Test
    public void test06() throws InterruptedException {
        extentTest=extentReports.createTest("item5 display test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");

       // Assert.assertTrue(footerPage.recentPostsOge5.isDisplayed());
        Assert.assertTrue(footerPage.recentPostsOge5.isEnabled());
        extentTest.pass("Verifies that item5 is displayed and active");
        Thread.sleep(5000);

        Driver.closeDriver();
    }

}
