package tests.us005_006_007_008_009_010_011;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Set;
@Test
public class Us007 extends TestBaseRapor {

    /*
    As a user, I should be able to verify that the social media icons
    in the footer section of the website are visible and active.
     */
    FooterPage footerPage;
    Actions actions;




    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("social media viewing test");

        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");


        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
       Assert.assertTrue(footerPage.facebookIcon.isDisplayed());
       Assert.assertTrue(footerPage.facebookIcon.isEnabled());
       extentTest.pass("Verifies that the facebook icon is visible and active");

        footerPage.facebookIcon.click();
        extentTest.info("clicks on facebook icon");
        Thread.sleep(2000);

        String IlksayfaninHandleDegeri=Driver.getDriver().getWindowHandle();
        Set<String> TumHandleDegerleri=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for (String each:TumHandleDegerleri
             ) {
            if (!each.equals(IlksayfaninHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }


        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="facebook";
        Assert.assertTrue(actualUrl.contains(expectedUrl));









    }@Test
    public void test02() {
        extentTest=extentReports.createTest("social media viewing test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");


        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.twitterIcon.isDisplayed());
        extentTest.pass("Verifies that the twitter icon is visible and active");
        footerPage.twitterIcon.click();//bug
        extentTest.info("click on twitter icon");

        String IlksayfaninHandleDegeri=Driver.getDriver().getWindowHandle();
        Set<String> TumHandleDegerleri=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for (String each:TumHandleDegerleri
        ) {
            if (!each.equals(IlksayfaninHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }


        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="twitter";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.pass("Tests that second tab's Url contains desired word");
        Driver.closeDriver();





    }@Test
    public void test03(){
        extentTest=extentReports.createTest("social media viewing test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.linkedInIcon.isDisplayed());

        Assert.assertTrue(footerPage.linkedInIcon.isEnabled());
        extentTest.pass("Verifies that the linkedIn icon is visible and active");
        footerPage.linkedInIcon.click();
        extentTest.info("clicks on linkedIn icon");

        String IlksayfaninHandleDegeri=Driver.getDriver().getWindowHandle();
        Set<String> TumHandleDegerleri=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for (String each:TumHandleDegerleri
        ) {
            if (!each.equals(IlksayfaninHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }


        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="linkedin";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
         Driver.closeDriver();





    }@Test
    public void test04(){
        extentTest=extentReports.createTest("social media viewing test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest=extentReports.createTest("user goes to tripandway homepage");
        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.pinterestIcon.isDisplayed());

        Assert.assertTrue(footerPage.pinterestIcon.isEnabled());
        extentTest.pass("pVerifies that the pinterest icon is visible and active");
        footerPage.pinterestIcon.click();//bug
        extentTest.info("clicks on pinterest icon");

        String IlksayfaninHandleDegeri=Driver.getDriver().getWindowHandle();
        Set<String> TumHandleDegerleri=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for (String each:TumHandleDegerleri
        ) {
            if (!each.equals(IlksayfaninHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }


        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="pinterest";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.pass("Tests that second tab's Url contains desired word");
        Driver.closeDriver();






    }@Test
    public void test05(){
        extentTest=extentReports.createTest("social media viewing test");
        footerPage=new FooterPage();
        actions=new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("user goes to tripandway homepage");


        actions.sendKeys(Keys.END).perform();
        extentTest.info("goes to user footer");
        Assert.assertTrue(footerPage.cookies.isDisplayed());
        footerPage.cookiesClick.click();
        extentTest.info("clicks on accept cookies button");
        Assert.assertTrue(footerPage.instagramIcon.isDisplayed());

        Assert.assertTrue(footerPage.instagramIcon.isEnabled());
        extentTest.pass("Verifies that the instagram icon is visible and active");
        footerPage.instagramIcon.click();
        extentTest.info("clicks on instagram icon");

        String IlksayfaninHandleDegeri=Driver.getDriver().getWindowHandle();
        Set<String> TumHandleDegerleri=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for (String each:TumHandleDegerleri
        ) {
            if (!each.equals(IlksayfaninHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }


        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        extentTest.info("user switches to new tab");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="instagram";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        extentTest.pass("Tests that second tab's Url contains desired word");
        Driver.closeDriver();




    }
}

