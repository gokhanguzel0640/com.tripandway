package tests.us001_002_003_004;

import org.testng.annotations.Test;
import pages.FooterPage_US04;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US004 {

    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));

        FooterPage_US04 footerPage_us04 = new FooterPage_US04();

        footerPage_us04.featured1.isDisplayed();
        footerPage_us04.featured1.isEnabled();

        footerPage_us04.featured2.isDisplayed();
        footerPage_us04.featured2.isEnabled();

        footerPage_us04.featured3.isDisplayed();
        footerPage_us04.featured3.isEnabled();

        footerPage_us04.featured4.isDisplayed();
        footerPage_us04.featured4.isEnabled();




    }
}