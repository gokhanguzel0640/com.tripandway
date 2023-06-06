package tests.us001_002_003_004;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BodyPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US003 extends TestBaseRapor {



    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testKaydirma() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.kaydirma1,
                bodyPage.kaydirma2,
                bodyPage.kaydirma3,
                bodyPage.kaydirma4,
                bodyPage.kaydirma5,
                bodyPage.kaydirma6,
                bodyPage.kaydirma7,
                bodyPage.kaydirma8,
                bodyPage.kaydirma9,
                bodyPage.kaydirma10,
                bodyPage.sag1,
                bodyPage.sol1,
                bodyPage.sag2,
                bodyPage.sol2};

        String[] stringsWebElements = {"kaydirma1", "kaydirma2",
                "kaydirma3","kaydirma4",
                "kaydirma5","kaydirma6","kaydirma7","kaydirma8","kaydirma9","kaydirma10","sag1","sag2","sol1","sol2"};

        for (int i = 0; i < 14; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringsWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }


    }

    @Test
    public void readMores() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.readMore1,
                bodyPage.readMoreist,
                bodyPage.readMoreBuenos29,
                bodyPage.readMoreDiscAnc,
                bodyPage.readMoreBangkok,
                bodyPage.readMoreSalina,
                bodyPage.readMoreGreenVille,
                bodyPage.seeAllDestination};

        String[] stringsWebElements = {"readMore1",
                "readMoreist","readMoreBangkok","readMoreBuenos29",
                "readMoreDiscAnc","readMoreSalina","readMoreGreenVille","seeAllDestination"};

        for (int i = 0; i < 8; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringsWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }


    }


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.internationalTourElement,
                bodyPage.adventureTourElement,
                bodyPage.cultureTourElement,
                bodyPage.businessTourElement,
                bodyPage.healthTourElement,
                bodyPage.religiousTourElement};

        String[] stringsWebElements = {"internationalTourElement", "adventureTourElement",
                "cultureTourElement", "businessTourElement",
                "healthTourElement", "religiousTourElement"};

        for (int i = 0; i < 6; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringsWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }

    }
    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.threeDaysInBuenosAiresElement,
                bodyPage.tenDaysInBuenosAiresElement,
                bodyPage.threeDaysInBangkokElement,
                bodyPage.sevenDaysInSalinaIslandElement,
                bodyPage.fiveDayCaliforniaElement};

        String[] stringWebElements = {"threeDaysInBuenosAiresElement",
                "tenDaysInBuenosAiresElement",
                "threeDaysInBangkokElement", "sevenDaysInSalinaIslandElement",
                "fiveDayCaliforniaElement"};

        for (int i = 0; i < 5; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }

    }

    @Test
    public void test03() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();

        bodyPage.acceptbuton.click();
        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.bangkokThailandElement,
                bodyPage.granvilleSouthCarolinaElement,
                bodyPage.buenosAiresArgentinaElement,
                bodyPage.marrakeshMoroccoElement,
                bodyPage.salinaIslandItalyElement,
                bodyPage.istanbulTurkeyElement};

        String[] stringsWebElements = {"bangkokThailandElement","granvilleSouthCarolinaElement",
                "buenosAiresArgentinaElement",
                "marrakeshMoroccoElement","salinaIslandItalyElement",
                "istanbulTurkeyElement"};

        for (int i = 0; i < 6; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringsWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringsWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }
    }


    @Test
    public void test04() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.teamMembersZara,
                bodyPage.teamMembersJaxon,
                bodyPage.teamMembersAvery,
                bodyPage.teamMembersKnox};

        String[] stringWebElements = {"teamMembersZara",
                "teamMembersJaxon", "teamMembersAvery",
                "teamMembersKnox"};

        for (int i = 0; i < 4; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }

    }
    @Test
    public void teamMembersSocialMedia() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        extentTest = extentReports.createTest("tripandway testi",
                "Kullanici istenen elementlerin görünür ve aktif oldugunu doğrulayabilmeli");


        WebElement[] webElementsIsDisplayedAndIsEnable = {bodyPage.zaraFacebook,
                bodyPage.zaraLinkedin,
                bodyPage.zaraTwitter,
                bodyPage.jaxonFacebook,
                bodyPage.jaxonLinkedin,
                bodyPage.jaxonTwitter,
                bodyPage.averyFacebook,
                bodyPage.averyLinkedin,
                bodyPage.averyTwitter,
                bodyPage.knoxFacebook,
                bodyPage.knoxLinkedin,
                bodyPage.knoxTwitter};

        String[] stringWebElements = {"zaraFacebook",
                "zaraLinkedin", "zaraTwitter","jaxonFacebook","jaxonLinkedin","jaxonTwitter","averyFacebook","averyLinkedin",
                "averyTwitter","knoxFacebook","knoxLinkedin","knoxTwitter"};

        for (int i = 0; i < 12; i++) {
            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isDisplayed());
            extentTest.info(stringWebElements[i] + "ogesinin gorunebilir oldugu test edildi");

            softAssert.assertTrue(webElementsIsDisplayedAndIsEnable[i].isEnabled());
            extentTest.info(stringWebElements[i] + "ogesinin tiklanabilir oldugu test edildi");
        }

    }
    @Test
    public void emailAndSubmit() {
        Driver.getDriver().get(ConfigReader.getProperty("twUrl"));
        BodyPage bodyPage = new BodyPage();
        bodyPage.acceptbuton.click();

        softAssert.assertTrue(bodyPage.emailKutusu.isDisplayed());
        softAssert.assertTrue(bodyPage.emailKutusu.isEnabled());

        softAssert.assertTrue(bodyPage.submitButton.isDisplayed());
        softAssert.assertTrue(bodyPage.submitButton.isEnabled());




    }
}