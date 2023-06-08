package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FooterPage {
    public FooterPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h3[text()='Latest Packages']")
    public WebElement footerPageLatestPackages;



    @FindBy(xpath = "//span[@class='wpcc-message']")
    public WebElement cookies;
    @FindBy(xpath = "//button[@type='button']")
    public WebElement cookiesClick;
    @FindBy(xpath = "//div[2]/div/ul/li[1]/a")
    public WebElement footerPageOge1;
    @FindBy(xpath = "//div[2]/div/ul/li[2]/a")
    public WebElement footerPageOge2;
    @FindBy(xpath ="//div[2]/div/ul/li[3]/a")
    public WebElement footerPageOge3;
    @FindBy(xpath ="//div[2]/div/ul/li[4]/a" )
    public WebElement footerPageOge4;
    @FindBy(xpath ="//div[2]/div/ul/li[5]/a" )
    public WebElement footerPageOge5;

    @FindBy(xpath ="//h3[text()='Recent Posts']" )
    public WebElement footerPageRecentPosts;
    @FindBy(xpath = "//div[3]/div/ul/li[1]/a")
    public WebElement recentPostsOge1;

    @FindBy(xpath = "//div[3]/div/ul/li[2]/a")
    public WebElement recentPostsOge2;

    @FindBy(xpath ="//div[3]/div/ul/li[3]/a" )
    public WebElement recentPostsOge3;

    @FindBy(xpath = "//div[3]/div/ul/li[4]/a")
    public WebElement recentPostsOge4;

    @FindBy(xpath = "//div[3]/div/ul/li[5]/a")
    public WebElement recentPostsOge5;

    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[13]")
    public WebElement facebookIcon;
    @FindBy(xpath = "(//a[@href='http://www.facebook.com'])[14]")
    public WebElement twitterIcon;

    @FindBy(xpath = "(//a[@href='http://www.linkedin.com'])[13]")
    public WebElement linkedInIcon;

    @FindBy(xpath = "//i[@class='fab fa-pinterest-p']")
    public WebElement pinterestIcon;

    @FindBy(xpath = "//i[@class='fab fa-instagram']")
    public WebElement instagramIcon;



    @FindBy(xpath = "//h3[text()='Address']")
    public WebElement footerPageAddres;


    @FindBy(xpath = "//div[@class='footer-address-item']")
    public WebElement adresIcon;

    @FindBy(xpath = "(//div[@class='footer-address-item'][2])")
    public WebElement telephoneIcon;

    @FindBy(xpath = "(//div[@class='footer-address-item'][3])")
    public WebElement emailIcon;



    @FindBy(xpath = "//a[text()='Terms and Conditions']")
    public WebElement termsAndConditions;


    @FindBy(xpath = "//a[text()='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//input[@name='subs_email']")
    public WebElement newsLetterTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement newsLetterSubmitTus;

    @FindBy(xpath = "//div[text()='To activate your subscription please check your email and follow instruction there.']")
    public WebElement newsLetterToastMessage;



















}
