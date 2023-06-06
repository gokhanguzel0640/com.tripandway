package tests.us_019_020_021;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Traveller_dashboard_Us20_Us21_Page;
import pages.Traveller_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_021 extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Traveller dashboard testi",
                "kullanici kaydoldugu gmail ve password bilgilerini girdikten sonra login olup\n" +
                        "ödeme geçmişini görüntüleyebildiğini doğrulayabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        extentTest.info("kullanici https://qa.tripandway.com/ sitesine gider");
        Traveller_loginPage travellerLoginPage = new Traveller_loginPage();
        travellerLoginPage.acceptButonu.click();
        extentTest.info("ACCEPT butonu");
        travellerLoginPage.loginButonuGiris.click();
        extentTest.info("Kullanici login butonuna tiklar");
        travellerLoginPage.emailAddressKutusu.sendKeys("takimcalismasi11@gmail.com");
        extentTest.info("kullanici Email Address bilgilerini girer");
        travellerLoginPage.passwordKutusu.sendKeys("deneme14.");
        extentTest.info("Kullanici Password bilgilerini girer");
        travellerLoginPage.loginButonu.submit();
        extentTest.info("Kullanici Login butonuna tıklar");

        Traveller_dashboard_Us20_Us21_Page travellerDashboardUs20Us21Page=new Traveller_dashboard_Us20_Us21_Page();
        travellerDashboardUs20Us21Page.paymentHistoryButonu.click();
        extentTest.info("Kullanici Payment History butonu'na tiklar");
        Assert.assertTrue(travellerDashboardUs20Us21Page.ViewAllPayments.isDisplayed());
        extentTest.pass("View All Payments goruntulendi ve test edildi");

    }

}