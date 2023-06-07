package tests.us_033_034_035;

import org.testng.annotations.Test;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us33_Us34_Us35_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Us035 extends TestBaseRapor {
    @Test
    public void test01(){

        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        Admin_dashboard_Us33_Us34_Us35_Page admin_dashboard_us33_us34_us35_page = new Admin_dashboard_Us33_Us34_Us35_Page();
        Admin_loginPage admin_loginPage = new Admin_loginPage();

        extentTest=extentReports.createTest("Test to display all members of the news list",
                "After logging in as admin, I should be able to "+
                            "verify that all newslist members are viewable");


        Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
        extentTest.info("01_Admin goes to https://qa.tripandway.com/admin/login");

        admin_loginPage.email.click();
        admin_loginPage.email.sendKeys(ConfigReader.getProperty("admin31email"));
        extentTest.info("02_Enters email address");

        admin_loginPage.password.sendKeys(ConfigReader.getProperty("adminsifre") );
        extentTest.info("03_enters password");

        admin_loginPage.loginButton.click();
        extentTest.info("04_presses the login button");

        //05_Presses the Subscribers button
        admin_dashboard_page.subscriberButton.click();
        extentTest.info("05_Presses the Subscribers button");

        //06_All Subscribers press the button
        admin_dashboard_us33_us34_us35_page.allSubscribersButton.click();
        extentTest.info("06_All Subscribers press the button");

        ReusableMethods.bekle(1);
        admin_dashboard_us33_us34_us35_page.viewSubscribers.isDisplayed();
        extentTest.pass("All members of the news list viewed");

        Driver.quitDriver();


    }
}
