package tests.us001_002_003_004;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BodyPage;
import pages.FooterPage;
import pages.FooterPage_US04;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US004  extends TestBaseRapor {
    SoftAssert softAssert=new SoftAssert();


        @Test
        public void testKaydirma() {
            Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
           FooterPage_US04 footerPageUs04=new FooterPage_US04();
           footerPageUs04.acceptbuton.click();

            extentTest = extentReports.createTest("tripandway testi",
                    "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


            WebElement[] webElementsIsDisplayedAndIsEnable = {footerPageUs04.featured1,
            footerPageUs04.featured2,
            footerPageUs04.featured3,
            footerPageUs04.featured4,
            footerPageUs04.featured5};

            String[] stringsWebElements = {"featured1", "featured2",
                    "featured3","featured4","featured5"};

            for (int i = 0; i < 5; i++) {
                softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
                extentTest.info(stringsWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

                softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
                extentTest.info(stringsWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
            }


        }





    }