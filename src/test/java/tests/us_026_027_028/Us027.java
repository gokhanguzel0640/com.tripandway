package tests.us_026_027_028;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Admin_dashboard_Us27_Us28_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us027 {
    @Test
    public void Us027(){
        ReusableMethods.adminlogin();
        Admin_dashboard_Us27_Us28_Page admin_dashboard_us27_us28_page=new Admin_dashboard_Us27_Us28_Page();
        ReusableMethods.bekle(3);
       //System.out.println(admin_dashboard_us27_us28_page.adminGeneralsettings.getText());
       //System.out.println(admin_dashboard_us27_us28_page.adminPageSettings.getText());
       //System.out.println(admin_dashboard_us27_us28_page.adminPaymentSettings.getText());
       //System.out.println(admin_dashboard_us27_us28_page.adminDynamicPages.getText());
       //System.out.println(admin_dashboard_us27_us28_page.adminLanguage.getText());
       //System.out.println(admin_dashboard_us27_us28_page.adminWebSiteSection.getText());
       //System.out.println(admin_dashboard_us27_us28_page.adminEmailTemplate.getText());
        admin_dashboard_us27_us28_page.adminBlocksection.click();
        admin_dashboard_us27_us28_page.adminCategories.click();
        admin_dashboard_us27_us28_page.adminBlogCreateNew.click();
        ReusableMethods.bekle(5);
        Driver.closeDriver();


    }
}
