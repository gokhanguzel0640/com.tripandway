package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BodyPage {
    public BodyPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //----------------kaydırmalar
    @FindBy(xpath ="//div[@class='owl-dot active'][1]")
    public WebElement kaydirma1;
    @FindBy(xpath ="(//div[@class='owl-dot'])[1]")
    public WebElement kaydirma2;
    @FindBy(xpath ="(//div[@class='owl-dot'])[2]")
    public WebElement kaydirma3;


    @FindBy(xpath ="(//div[@class='owl-dot'])[3]")
    public WebElement kaydirma4;
    @FindBy(xpath ="(//div[@class='owl-dot active'])[2]")
    public WebElement kaydirma5;
    @FindBy(xpath ="(//div[@class='owl-dot'])[4]")
    public WebElement kaydirma6;
    @FindBy(xpath ="(//div[@class='owl-dot'])[5]")
    public WebElement kaydirma7;

    @FindBy(xpath ="(//div[@class='owl-dot'])[6]")
    public WebElement kaydirma8;
    @FindBy(xpath ="(//div[@class='owl-dot active'])[3]")
    public WebElement kaydirma9;

    @FindBy(xpath ="(//div[@class='owl-dot active'])[4]")
    public WebElement kaydirma10;

    @FindBy(xpath ="(//div[@class='owl-next'])[1]")
    public WebElement sag1;
    @FindBy(xpath ="(//div[@class='owl-prev'])[1]")
    public WebElement sol1;
    @FindBy(xpath ="(//div[@class='owl-next'])[5]")
    public WebElement sag2;
    @FindBy(xpath ="(//i[@class='fas fa-angle-left'])[3]")
    public WebElement sol2;







    //-------------
    @FindBy(xpath = "//*[@type='button']")
    public WebElement acceptbuton;
    //-------------OurServices--------

    @FindBy(xpath = "(//div[@class='ser-text'])[1]")
    public WebElement internationalTourElement;
    // home / services Page

    @FindBy(xpath = "(//div[@class='ser-text'])[2]")
    public WebElement adventureTourElement;
    // home / services Page

    @FindBy(xpath = "(//div[@class='ser-text'])[3]")
    public WebElement cultureTourElement;
    // home / services Page
    @FindBy(xpath = "(//div[@class='ser-text'])[4]")
    public WebElement businessTourElement;
    @FindBy(xpath = "(//div[@class='ser-text'])[5]")
    public WebElement healthTourElement;

    @FindBy(xpath = "(//div[@class='ser-text'])[6]")
    public WebElement religiousTourElement;



    //-----------Destinations---------



    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement bangkokThailandElement;

    @FindBy(xpath = "(//div[@class='photo-title'])[2]")
    public WebElement granvilleSouthCarolinaElement;

    @FindBy(xpath = "(//div[@class='photo-title'])[3]")
    public WebElement buenosAiresArgentinaElement;

    @FindBy(xpath = "(//div[@class='photo-title'])[4]")
    public WebElement marrakeshMoroccoElement;

    @FindBy(xpath = "(//div[@class='photo-title'])[5]")
    public WebElement salinaIslandItalyElement;

    @FindBy(xpath = "(//div[@class='photo-title'])[6]")
    public WebElement istanbulTurkeyElement;


    //------------- Featured Package---------------

    @FindBy(xpath = "(//div[@class='featured-item wow fadeIn'])[1]")
    public WebElement threeDaysInBuenosAiresElement;

    @FindBy(xpath = "(//div[@class='featured-item wow fadeIn'])[2]")
    public WebElement tenDaysInBuenosAiresElement;


    @FindBy(xpath = "(//div[@class='featured-item wow fadeIn'])[3]")
    public WebElement threeDaysInBangkokElement;

    @FindBy(xpath = "(//div[@class='featured-item wow fadeIn'])[4]")
    public WebElement sevenDaysInSalinaIslandElement;

    @FindBy(xpath = "(//div[@class='owl-item active'])[4]")
    public WebElement fiveDayCaliforniaElement;


    //-----------TeamMembers------------------
    @FindBy(xpath = "(//div[@class='team-item wow fadeIn'])[6]")
    public WebElement teamMembersZara;

    @FindBy(xpath = "(//div[@class='team-item wow fadeIn'])[7]")
    public WebElement teamMembersJaxon;

    @FindBy(xpath = "(//div[@class='team-item wow fadeIn'])[8]")
    public WebElement teamMembersAvery;

    @FindBy(xpath = "(//div[@class='team-item wow fadeIn'])[5]")
    public WebElement teamMembersKnox;



    //-----------------ReadMore and SeeAllDestination------
    @FindBy(xpath = "//div[@class='button text-center']")
    public WebElement seeAllDestination;

    @FindBy(xpath = "//a[text()='Read More']")
    public WebElement readMore1;


    @FindBy(xpath = "(//div[@class='button mt_15'])[4]")
    public WebElement readMoreist;
    @FindBy(xpath = "(//div[@class='button mt_15'])[8]")
    public WebElement readMoreBuenos29;

    @FindBy(xpath = "(//div[@class='button mt_15'])[7]")
    public WebElement readMoreBangkok;


    @FindBy(xpath = "(//div[@class='button mt_15'])[5]")
    public WebElement readMoreDiscAnc;

    @FindBy(xpath = "(//div[@class='button mt_15'])[6]")
    public WebElement readMoreSalina;

    @FindBy(xpath = "(//div[@class='button mt_15'])[8]")
    public WebElement readMoreGreenVille;

    //----------------teamMembersSocialMedia-----------
    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[10]")
    public WebElement zaraFacebook;
    @FindBy(xpath = "(//a[@href='http://www.twitter.com'])[10]")
    public WebElement zaraTwitter;
    @FindBy(xpath = "(//a[@href='http://www.linkedin.com'])[10]")
    public WebElement zaraLinkedin;



    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[8]")
    public WebElement averyFacebook;
    @FindBy(xpath = "(//a[@href='http://www.twitter.com'])[8]")
    public WebElement averyTwitter;
    @FindBy(xpath = "(//a[@href='http://www.linkedin.com'])[8]")
    public WebElement averyLinkedin;



    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[7]")
    public WebElement jaxonFacebook;
    @FindBy(xpath = "(//a[@href='http://www.twitter.com'])[7]")
    public WebElement jaxonTwitter;
    @FindBy(xpath = "(//a[@href='http://www.linkedin.com'])[7]")
    public WebElement jaxonLinkedin;


    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[9]")
    public WebElement knoxFacebook;
    @FindBy(xpath = "(//a[@href='http://www.twitter.com'])[9]")
    public WebElement knoxTwitter;
    @FindBy(xpath = "(//a[@href='http://www.linkedin.com'])[9]")
    public WebElement knoxLinkedin;

    //----------email-submit-----

    @FindBy(xpath = "//input[@type='text']")
    public WebElement emailKutusu;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;















}
