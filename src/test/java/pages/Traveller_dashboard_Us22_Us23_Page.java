package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Traveller_dashboard_Us22_Us23_Page {
    public Traveller_dashboard_Us22_Us23_Page(){

    PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath ="//*[@class='fas fa-lock']")
    public WebElement loginlinki;

    @FindBy(xpath ="//*[@name='traveller_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='traveller_password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='form1']")
    public WebElement loginbuton;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement acceptbuton;

    @FindBy (xpath = "//*[@class='top-header-right']")
    public WebElement DashboardPanel; //basarili login girisi yapilirsa Dashboard paneli gorunmeli

    @FindBy(xpath = "//*[@class='fas fa-key']")
    public WebElement UpdatePassword;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement NewPasswordTab;

    @FindBy(name = "form1")
    public WebElement UpdateButon;

    @FindBy(xpath = "//*[contains(text(),'Password is updated successfully')]")
    public WebElement PUsuccessfully; // Sifre degistirme islemi basarili olursa cikacak olan yazi

    @FindBy(xpath = "(//*[contains(text(),'Forget Password')])")
    public WebElement forgetPasswordButon;

    @FindBy(xpath = "//*[@name='traveller_email']")
    public WebElement forgetEmailTab;

    @FindBy(xpath = "//*[@name='form1']")
    public WebElement submitButon;

    @FindBy(linkText = "Logout")
    public WebElement logoutButon;

    @FindBy(linkText = "Packages")
    public WebElement packegeslink;
    @FindBy(xpath = "//*[contains(text(),'Please check your email to get password reset information')]")
    public WebElement sifreSifirlama;
    @FindBy(xpath = "//*[@id=\"menu\"]/li[4]/a")
    public WebElement packegeLink;

    @FindBy(linkText = "Update Profile")
    public WebElement UpdateProfileLink;

    @FindBy(xpath = "//*[contains(text(),'Profile is updated successfully']")
    public WebElement SucProfileUpdate;

    @FindBy(xpath = "//*[@name='traveller_phone']")
    public WebElement PhoneTab;

    @FindBy(xpath = "//*[@name='traveller_country']")
    public WebElement ContryTab;

    @FindBy(xpath = "//*[@name='traveller_address']")
    public WebElement AddressTab;

    @FindBy(xpath = "//*[@name='traveller_state']")
    public WebElement StateTab;

    @FindBy(xpath = "//*[@name='traveller_city']")
    public WebElement CityTab;

    @FindBy(xpath = "//*[@name='traveller_zip']")
    public WebElement ZipcodeTab;

   // @FindBy(xpath = "//*[@class='btn btn-primary']")
   // public WebElement UpdateButon;

    @FindBy(xpath = "//*[contains(text(),'Packages')]")
    public WebElement SucPackages;
    @FindBy(xpath = "//*[contains(text(),'Profile is updated successfully')]")
    public WebElement BasariliUpdateProfile;

    @FindBy(xpath = "//select[@id='numberPerson']")
    public WebElement totalPerson;

    @FindBy(xpath = "//*[@class='stripe-button-el']")
    public WebElement PaywCard;
    @FindBy(xpath = "//*[@id='card_number']")
    public WebElement CardNo;
    @FindBy(xpath = "//*[@class='cardExpiresInput input left bottom']")
    public WebElement MMYY;
    @FindBy(xpath = "//*[@id='cc-csc']")
    public WebElement Cvc;
    @FindBy(xpath = "//*[@class='iconTick']")
    public WebElement PayIst;
    @FindBy(xpath = "//*[contains(text(),'Payment is successful!')]")
    public WebElement PaymentisSuc; // Odeme isleminin basarili bir sekilde gerceklestigini test etme
    @FindBy(xpath = "(//*[contains(text(),'Payment')])[2]")
    public WebElement PaymentTitle;

    @FindBy(xpath = "(//span[@class='fz_22'])[4]")
    public WebElement bangkok;
    @FindBy(xpath = "//*[contains(text(),'7 days in Istanbul')]")
    public WebElement Istanbul;
    @FindBy(xpath = "(//*[contains(text(),'3 days in Buenos Aires')])[1]")
    public WebElement threeDaysBuenos;
    @FindBy(xpath = "(//*[contains(text(),'10 days in Buenos Aires')])[1]")
    public WebElement tenDaysBuenos;

    @FindBy(xpath = "//*[contains(text(),'Pay $5,500.00')]")
    public WebElement PayBang;
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement BYSeatBang;
    @FindBy(xpath = "//button[@class='stripe-button-el']")
    public WebElement payWithCard;

    @FindBy(xpath = "(//*[contains(text(),'7 days in Salina Island')])[1]")
    public WebElement salina;
    @FindBy(xpath = "(//*[contains(text(),'5 Day California')])[1]")
    public WebElement california;

    @FindBy(xpath = "(//*[text()='Packages'])[2]")
    public WebElement packages;
    @FindBy(xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement BookYourSeat;

    @FindBy(xpath = "//*[@class='fas fa-history']")
    public WebElement paymentHistory;

    @FindBy(xpath = "(//*[@class='text fz_25'])[1]")
    public WebElement completed;

    @FindBy(xpath = "//h1[text()='View All Payments']")
    public WebElement viewAllPayments;

    @FindBy(xpath ="//*[contains(text(),'You can not book your seat. Date is over.')]")
    public WebElement notBookSeat;


}
