package tests.us_033_034_035;

import org.testng.annotations.Test;
import pages.Admin_dashboard_Page;
import pages.Admin_dashboard_Us33_Us34_Us35_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us033  {

    @Test
    public void test01(){

        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
       Admin_dashboard_Us33_Us34_Us35_Page admin_dashboard_us33_us34_us35_page = new Admin_dashboard_Us33_Us34_Us35_Page();

        //01_User https://qa.triandway.com/admin/login problem fix
        //Enters 02_email address
        //enters 03_password
        //presses the 04_login button
        ReusableMethods.adminlogin();


        //presses the 05_order button
        admin_dashboard_page.orderButton.click();


        //06_presses the Detail button of the first order
        admin_dashboard_us33_us34_us35_page.firstdetailButton.click();

        //07_display the details of the first order
        admin_dashboard_us33_us34_us35_page.orderDetail.isDisplayed();

       Driver.quitDriver();

    }

    @Test
    public void test02(){

        Admin_dashboard_Page admin_dashboard_page = new Admin_dashboard_Page();
        Admin_dashboard_Us33_Us34_Us35_Page admin_dashboard_us33_us34_us35_page = new Admin_dashboard_Us33_Us34_Us35_Page();


        //01_User https://qa.triandway.com/admin/login problem fix
        //Enters 02_email address
        //enters 03_password
        //presses the 04_login button
        ReusableMethods.adminlogin();

        //presses the 05_order button
        admin_dashboard_page.orderButton.click();

        //06_presses the Detail button of the second order
        admin_dashboard_us33_us34_us35_page.secondDetailButton.click();


        //07_must be able to display the details of the second order
        admin_dashboard_us33_us34_us35_page.orderDetail.isDisplayed();

        Driver.quitDriver();


    }


}
