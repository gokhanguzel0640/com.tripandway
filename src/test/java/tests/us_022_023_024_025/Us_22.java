package tests.us_022_023_024_025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Traveller_loginPage;
import utilities.Driver;

public class Us_22 {

    @Test
    public void test01() {



        // Kullanici Tripandway anasayfaya gider
        Driver.getDriver().get("https://qa.tripandway.com/");

        Traveller_loginPage traveller_loginPage =new Traveller_loginPage();

        //Kullanici login linkine tiklar
        traveller_loginPage.loginlinki.click();

        //Accept butonuna tiklar
        traveller_loginPage.acceptbuton.click();

        // Gecerli Email ve Password bilgilerini ilgili alana yazar
        traveller_loginPage.email.sendKeys("yekta2124@gmail.com");
        traveller_loginPage.password.sendKeys("123123Y.");

        //Login butonuna tiklar
        traveller_loginPage.loginbuton.click();

        WebElement Dashboard=Driver.getDriver().findElement(By.linkText("Dashboard"));

        //Kullanici "Dashboard" panelinin gorunur olmasiyla basarili login girisi yaptigini test eder
        Assert.assertTrue(Dashboard.isDisplayed());


    }
}
