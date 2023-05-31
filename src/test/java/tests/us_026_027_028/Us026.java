package tests.us_026_027_028;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us026 extends TestBaseRapor {
    @Test
    public void Us026() {
     extentTest= extentReports.createTest("Admin Page Login testi",
                "Sitenin yönetim paneline admin bilgileri ile girdikten\n" +
                        " sonra yönetim panelini görüntülenebilmeli");
     Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
     extentTest.info("01_Admin https://qa.tripandway.com/admin/login adresine gider");
     Admin_loginPage admin_loginPage = new Admin_loginPage();
     admin_loginPage.adminEmail.click();
     extentTest.info("02_Admin email kutusuna tıklar");

     admin_loginPage.adminEmail.sendKeys(ConfigReader.getProperty("admin31email"));
     extentTest.info("03_Admin email kutusuna geçerli email girer");
     admin_loginPage.adminPassword.sendKeys(ConfigReader.getProperty("adminsifre") + Keys.ENTER);
     extentTest.info("04_Admin password kutusuna geçerli password girer ve enter tusuna basar");

     System.out.println(admin_loginPage.adminDashboard.getText());
     Assert.assertTrue(admin_loginPage.adminDashboard.isDisplayed());
     ReusableMethods.bekle(5);
     extentTest.pass("05_Admin 'Dashboard' yazısını görüntüleyebilir");
     Driver.closeDriver();


    }

}
