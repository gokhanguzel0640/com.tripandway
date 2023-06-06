package tests.us001_002_003_004;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {
    //Bir ziyaretçi olarak siteyi kullanabilmek icin
    // web sitesine erişebildiğimi doğrulayabilmeliyim
    @Test
    public void erisimTesti() {
        Driver.getDriver().get(ConfigReader.getProperty ("twUrl"));

    }
}