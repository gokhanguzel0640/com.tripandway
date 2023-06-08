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
        extentTest = extentReports.createTest("Traveller login testi",
                "kullanici kaydoldugu gmail ve password bilgilerini girdikten sonra login olmali\n" +
                        "site anasayfasına gidebildiğini doğrulayabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info(" kullanici https://qa.tripandway.com/ sitesine gider");
        Traveller_loginPage travellerLoginPage = new Traveller_loginPage();

        travellerLoginPage.acceptButonu.click();
        extentTest.info("ACCEPT butonu");

        travellerLoginPage.loginButonuGiris.click();
        extentTest.info("Login butonu'na tiklar");

        travellerLoginPage.emailAddressKutusu.sendKeys("takimcalismasi11@gmail.com");
        extentTest.info("Kullanici Email Address bilgilerini girer");

        travellerLoginPage.passwordKutusu.sendKeys("deneme14.");
        extentTest.info("Kullanici Password bilgilerini girer");

        travellerLoginPage.loginButonu.click();
        extentTest.info("Kullanici Login butonu'na tiklar");

        Assert.assertTrue(travellerLoginPage.anasayfaGoruntuleme.isDisplayed());
        extentTest.pass("Kullanicinin anasayfaya gidebildiği dogrulandi ve test edildi");


    }
}
