package tests.us_022_023_024_025;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Traveller_dashboard_Us22_Us23_Page;

import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Random;

public class US24 extends TestBaseRapor{
    @Test
    public void SelectPackages() throws InterruptedException {

        extentTest = extentReports.createTest("PACKAGES TEST","The user should be able to log in" +
                " and successfully navigate to the package page and purchase any package.");

        Traveller_dashboard_Us22_Us23_Page traveller_loginPage = new Traveller_dashboard_Us22_Us23_Page();

        //01_User goes to https://qa.tripandway.com/
        Driver.getDriver().get("https://qa.tripandway.com/");
        extentTest.info("The user goes to the tripandway homepage.");

        //2_User clicks the login button to log in.
        traveller_loginPage.loginlinki.click();

        //Clicks on the Accept button.
        traveller_loginPage.acceptbuton.click();

       //03_User clicks on the "Login" button,enters "Email and password" information
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");
        Thread.sleep(3000);

        traveller_loginPage.loginbuton.click();

        extentTest.info("The user logs in to the site by entering the valid email and password information.");


        //04_User clicks on the  "Packages" button
       traveller_loginPage.packegeLink.click();
        extentTest.info("The user clicks the Packages button.");
        Thread.sleep(3000);

        //05_User selects a random packages

        WebElement [] packagesList={traveller_loginPage.Istanbul,
                traveller_loginPage.bangkok,
                traveller_loginPage.salina,
                                    //packages_page.threeDaysBuenos,
                                    //packages_page.tenDaysBuenos
                traveller_loginPage.california};

        SoftAssert softAssert=new SoftAssert();
        Random random=new Random();
        Actions actions=new Actions(Driver.getDriver());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


        WebElement webElement=packagesList[random.nextInt(3)];
        // random objesi ile listeden herhangi bir web element seceriz.
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        // action objesini kullanarak sayfada biraz asagi indik.

        jse.executeScript("arguments[0].click();",webElement);
        Thread.sleep(3000);

        //06_User clicks on "Book Your Seat" button

        jse.executeScript("arguments[0].click();",traveller_loginPage.BookYourSeat);
        extentTest.info("Kullanici yerini ayirtmak icin BookYourSeat butonuna tiklar.");
        Thread.sleep(3000);

        //07_User clicks on "Pay with Stripe" button
        jse.executeScript("arguments[0].click();",traveller_loginPage.PaywCard);
        extentTest.info("The user clicks on the PayWithCard button to make a payment.");
        Thread.sleep(3000);

        //09_User fills in "Card Number", "MM/YY", "CVC" respectivel
        //   and clicks on the Pay button

        actions.sendKeys("4242424242424242").
                sendKeys(Keys.TAB).
                sendKeys("12/34").
                sendKeys(Keys.TAB).
                sendKeys("567").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

        extentTest.info( "In order to make the payment," +
                "the user fills in the Card Number, MM/YY, CVC and clicks the Pay button");

        //11_User sees "Payment is successful!" the text
        softAssert.assertTrue(traveller_loginPage.PaymentisSuc.isDisplayed());
        extentTest.pass("The user was able to complete the payment successfully");

        //10_close the page
        Driver.closeDriver();
    }
}
