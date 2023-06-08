package tests.us001_002_003_004;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Admin_loginPage;
import pages.BodyPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US002 extends TestBaseRapor {
    //Bir ziyaretçi olarak  Home page sayfasının
    // header bölümündeki menülerin
    // görünür ve aktif olduğunu görüntüleyebildiğimi doğrulayabilmeliyim

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test01() {

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        HomePage homePage = new HomePage();

        WebElement[] webElementsIsDisplayedAndIsEnable = {homePage.home,
                homePage.services,
                homePage.destinations,
                homePage.packages,
                homePage.blog,
                homePage.faq,
                homePage.contact,
                homePage.aboutus,
                homePage.logo,
                homePage.registration,
                homePage.login};

        String[] stringsWebElements = {"home", "services", "destintions", "packages", "blog", "faq", "contact", "aboutus", "logo", "logo"
                , "registration", "login"};

        for (int i = 0; i < 11; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringsWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }
        softAssert.assertAll();
            
        }

        

}



