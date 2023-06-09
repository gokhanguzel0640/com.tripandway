package tests.us_033_034_035;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us33_Us34_Us35_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;
import java.util.Set;

public class Us034 extends TestBaseRapor {


    @Test
    public void test01() {

        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        Admin_dashboard_Us33_Us34_Us35_Page admin_dashboard_us33_us34_us35_page = new Admin_dashboard_Us33_Us34_Us35_Page();
        Admin_loginPage admin_loginPage = new Admin_loginPage();

        extentTest=extentReports.createTest("Test to display order invoice",
                "After logging in as an admin, "+
                        "I should be able to verify that the details"+
                        " of any order can be viewed by entering the Order section.");


        Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info("01_Admin goes to https://qa.tripandway.com/admin/login");

        admin_loginPage.email.click();
        admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
        extentTest.info("02_Enters email address");

        admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") );
        extentTest.info("03_enters password");

        admin_loginPage.loginButton.click();
        extentTest.info("04_presses the login button");

        admin_dashboard_page.orderButton.click();
        extentTest.info("05_presses the order button");

        String firtWindow = Driver.getDriver().getWindowHandle();

        admin_dashboard_us33_us34_us35_page.firstInvoiceButton.click();
        extentTest.info("06_presses the Invoice button of the first order");


        Set<String> totalWindowsHandles = Driver.getDriver().getWindowHandles();

        String secondWindow = "";

        for (String eachWHD : totalWindowsHandles
        ) {

            if (!eachWHD.equals(firtWindow)){
                secondWindow=eachWHD;

          }
        }
        Driver.getDriver().switchTo().window(secondWindow);

        ReusableMethods.bekle(1);
        admin_dashboard_us33_us34_us35_page.orderInvoice.isDisplayed();
        extentTest.pass("I can view the invoice of the first order");

        Driver.quitDriver();

    }

    @Test
    public void test02() {

        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        Admin_dashboard_Us33_Us34_Us35_Page admin_dashboard_us33_us34_us35_page = new Admin_dashboard_Us33_Us34_Us35_Page();
        Admin_loginPage admin_loginPage = new Admin_loginPage();

        extentTest=extentReports.createTest("Test to display order invoice",
                "After logging in as an admin, "+
                        "I should be able to verify that the details"+
                        " of any order can be viewed by entering the Order section.");


        Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info("01_Admin goes to https://qa.tripandway.com/admin/login");

        admin_loginPage.email.click();
        admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
        extentTest.info("02_Enters email address");

        admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") );
        extentTest.info("03_enters password");

        admin_loginPage.loginButton.click();
        extentTest.info("04_presses the login button");

        admin_dashboard_page.orderButton.click();
        extentTest.info("05_presses the order button");

        String firtWindow = Driver.getDriver().getWindowHandle();

        admin_dashboard_us33_us34_us35_page.secondInvoiceButton.click();
        extentTest.info("06_presses the Invoice button of the second order");

        Set<String> totalWindowsHandles = Driver.getDriver().getWindowHandles();

        String secondWindow = "";

        for (String eachWHD : totalWindowsHandles
        ) {

            if (!eachWHD.equals(firtWindow)){
                secondWindow=eachWHD;

            }
        }
        Driver.getDriver().switchTo().window(secondWindow);

        ReusableMethods.bekle(1);
        admin_dashboard_us33_us34_us35_page.orderInvoice.isDisplayed();
        extentTest.pass("I can view the invoice of the second order");

        Driver.quitDriver();

    }
}