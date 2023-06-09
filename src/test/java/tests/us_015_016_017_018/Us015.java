package tests.us_015_016_017_018;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import pages.AboutPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import javax.swing.*;
import java.io.IOException;

public class Us015 extends TestBaseRapor {

    Action actions;

    @Test


    public void aboutUsTesti (){

        extentTest = extentReports.createTest("About Us Page test" +
                "User can test that they can go to 'About Us' page after navigating to 'TRIPANDWAY' page");


        //01_User goes to https://www.tripandway.com

        extentTest.info("User goes to https://www.tripandway.com");

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));


        //02_User clicks "About Us"
        extentTest.info("User clicks \"About Us\"");

        AboutPage aboutPage = new AboutPage();

        aboutPage.aboutUsButton.click();

        //03_Tests that all elements on the opened page are visible

        extentTest.info("Tests that all elements on the opened page are visible");

        Assert.assertTrue(aboutPage.ourMissionText.isDisplayed());
        Assert.assertTrue(aboutPage.ourVisionText.isDisplayed());

        //04_User closes the page

        extentTest.pass("User closes the page");

        Driver.closeDriver();


    }


}
