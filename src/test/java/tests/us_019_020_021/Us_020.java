package tests.us_019_020_021;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Traveller_dashboard_Us20_Us21_Page;
import pages.Traveller_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_020 extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Traveller dashboard test",
                "As a user, I should be able to verify that I can edit my profile information after logging in");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("User goes to https://qa.tripandway.com/");
        Traveller_loginPage travellerLoginPage=new Traveller_loginPage();
        travellerLoginPage.acceptButonu.click();
        extentTest.info("User clicks ACCEPT button");
        travellerLoginPage.loginButonuGiris.click();
        extentTest.info("User clicks login button");
        travellerLoginPage.emailAddressKutusu.sendKeys("takimcalismasi11@gmail.com");
        extentTest.info("User enters Email Address information");
        travellerLoginPage.passwordKutusu.sendKeys("deneme14.");
        extentTest.info("User enters Password information");
        travellerLoginPage.loginButonu.submit();
        extentTest.info("User clicks Login button");

        Traveller_dashboard_Us20_Us21_Page travellerDashboardUs20Us21Page=new Traveller_dashboard_Us20_Us21_Page();
        travellerDashboardUs20Us21Page.updateProfileButonu.click();
        extentTest.info("User clicks Update Profile button");
        travellerDashboardUs20Us21Page.nameDuzenlemeButonu.sendKeys(("  ")+"Tankisi");
        extentTest.info("User updates user name");
        travellerDashboardUs20Us21Page.addressDuzenlemeButonu.sendKeys((" ")+"Merkez");
        extentTest.info("User updates user address information");
        travellerDashboardUs20Us21Page.zipDuzenlemeButonu.clear();
        extentTest.info("User deletes old zip number");
        travellerDashboardUs20Us21Page.zipDuzenlemeButonu.sendKeys("10000");
        extentTest.info("User writes new zip number");
        travellerDashboardUs20Us21Page.updateButonu.submit();
        extentTest.info("User clicks the Update Button");
        Assert.assertTrue(travellerDashboardUs20Us21Page.profileIsUpdatedSuccessfully.isDisplayed());
        extentTest.pass("Profile Is Updated Successfully! text has been viewed and tested");








    }

}
