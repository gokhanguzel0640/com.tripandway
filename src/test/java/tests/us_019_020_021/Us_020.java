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
        extentTest=extentReports.createTest("Traveller dashboard testi",
                "Kullanici kaydoldugu gmail ve password bilgilerini girdikten sonra login olup\n"+
                        "Profil bilgilerini düzenleyebildigini dogrulayabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("Kullanici https://qa.tripandway.com/ sitesine gider");
        Traveller_loginPage travellerLoginPage=new Traveller_loginPage();
        travellerLoginPage.acceptButonu.click();
        extentTest.info("ACCEPT butonu");
        travellerLoginPage.loginButonuGiris.click();
        extentTest.info("Kullanici Login butonu'na tıklar");
        travellerLoginPage.emailAddressKutusu.sendKeys("takimcalismasi11@gmail.com");
        extentTest.info("Kullanici Email Address bilgilerini girer");
        travellerLoginPage.passwordKutusu.sendKeys("deneme14.");
        extentTest.info("Kullanici Password bilgilerini girer");
        travellerLoginPage.loginButonu.submit();
        extentTest.info("Kullanici Login butonuna tıklar");

        Traveller_dashboard_Us20_Us21_Page travellerDashboardUs20Us21Page=new Traveller_dashboard_Us20_Us21_Page();
        travellerDashboardUs20Us21Page.updateProfileButonu.click();
        extentTest.info("Kullanici Update Profile butonuna tiklar");
        travellerDashboardUs20Us21Page.nameDuzenlemeButonu.sendKeys(("  ")+"Tankisi");
        extentTest.info("Kullanici name bilgisini günceller");
        travellerDashboardUs20Us21Page.addressDuzenlemeButonu.sendKeys((" ")+"Merkez");
        extentTest.info("Kullanici address bilgisini günceller");
        travellerDashboardUs20Us21Page.zipDuzenlemeButonu.clear();
        extentTest.info("Kullanici eski zip numarasini siler");
        travellerDashboardUs20Us21Page.zipDuzenlemeButonu.sendKeys("10000");
        extentTest.info("Kullanici yeni zip numarası yazar");
        travellerDashboardUs20Us21Page.updateButonu.submit();
        extentTest.info("Kullanici update Butonu'na tiklar");
        Assert.assertTrue(travellerDashboardUs20Us21Page.profileIsUpdatedSuccessfully.isDisplayed());
        extentTest.pass("Profile Is Updated Success fully'i yazisi goruntulendi ve test edildi");








    }

}
