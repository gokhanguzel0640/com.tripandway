package tests.us001_002_003_004;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US001 extends TestBaseRapor {
    //Bir ziyaretçi olarak siteyi kullanabilmek icin
    // web sitesine erişebildiğimi doğrulayabilmeliyim

    @Test
    public void accessTest() {
        extentTest=extentReports.createTest("The website is accessible test", " User should be able to verify that I can access the website");

        Driver.getDriver().get(ConfigReader.getProperty ("twUrl"));
        ReusableMethods.bekle(2);
        extentTest.pass("User can access the website");


    }
}