package tests.us_036_037_038_039_040_041;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page;
import pages.Admin_loginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.sql.DriverManager;

public class US_036  extends TestBaseRapor{
     @Test
    public void TC_01()  {
          extentTest=extentReports.createTest("Mailing to all subscribers",
          "An admin user can send an email to all subscribers successfully");
    Driver.getDriver().get(ConfigReader.getProperty("twAdminUrl"));
          extentTest.info(" 01_Admin user reaches to https://qa.tripandway.com/admin/login address");
    Admin_loginPage adminLoginPage=new Admin_loginPage();
         adminLoginPage.email.sendKeys(ConfigReader.getProperty("admin32email"));
          extentTest.info(" 02_Admin user enters the email address");
         adminLoginPage.password.sendKeys(ConfigReader.getProperty("adminsifre"));
          extentTest.info(" 03_Admin user enters the password");
         adminLoginPage.loginButton.submit();
          extentTest.info(" 04_Admin user clicks on the Login button");
    Admin_dashboard_Page adminDashboardPage = new Admin_dashboard_Page();
         adminDashboardPage.subscriberButton.click();
          extentTest.info(" 05_Admin user clicks on the subscribers dropdown menu");
    Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page admin_dashboard_us36_us37_us38_us39_us40_us41_page=new
              Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page();
         admin_dashboard_us36_us37_us38_us39_us40_us41_page.allSubscribersButton.click();
          extentTest.info(" 06_Admin user clicks on the all subscribers menu");
         admin_dashboard_us36_us37_us38_us39_us40_us41_page.sendEmailToSubscribersButton.click();
          extentTest.info(" 07_Admin user clicks on the send email to subscribers button");
         admin_dashboard_us36_us37_us38_us39_us40_us41_page.subjectBox.sendKeys(ConfigReader.getProperty("emailSubject")+Keys.TAB);
         admin_dashboard_us36_us37_us38_us39_us40_us41_page.textBox.sendKeys(ConfigReader.getProperty("emailMessage"));
          extentTest.info(" 08_Admin user writes the subject and message to related boxes");
         admin_dashboard_us36_us37_us38_us39_us40_us41_page.sendEmailButton.submit();
          extentTest.info(" 09_Admin user clicks on the send email button");
    Assert.assertTrue(admin_dashboard_us36_us37_us38_us39_us40_us41_page.sentSuccessfullyAlert.isDisplayed());
          extentTest.pass("10_Admin user tests that'Email is sent successfully to all subscribers!'button is displayed");
    }
}