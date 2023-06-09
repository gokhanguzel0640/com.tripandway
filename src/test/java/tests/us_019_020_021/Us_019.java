package tests.us_019_020_021;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Traveller_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.IOException;

public class Us_019 extends TestBaseRapor {
    @Test
    public void test01() throws IOException {
        extentTest = extentReports.createTest("Traveller login test",
                "As a user I can log in to the website using the email and password information I used during registration.   )" +
                        "I should also confirm that I can access the site's homepage after logging in.gi");

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info(" The user goes to https://qa.tripandway.com/");
        Traveller_loginPage travellerLoginPage = new Traveller_loginPage();

        travellerLoginPage.acceptButonu.click();
        extentTest.info("The user clicks ACCEPT button");

        travellerLoginPage.loginButonuGiris.click();
        extentTest.info("The user clicks login button");

        travellerLoginPage.emailAddressKutusu.sendKeys("takimcalismasi11@gmail.com");
        extentTest.info("The user enters Email Address information");

        travellerLoginPage.passwordKutusu.sendKeys("deneme14.");
        extentTest.info("The user enters Password information");

        travellerLoginPage.loginButonu.click();
        extentTest.info("The user clicks Login button");

        Assert.assertTrue(travellerLoginPage.anasayfaGoruntuleme.isDisplayed());
        extentTest.pass("The user verifies and tests that the user can navigate to the homepage");


    }
}
