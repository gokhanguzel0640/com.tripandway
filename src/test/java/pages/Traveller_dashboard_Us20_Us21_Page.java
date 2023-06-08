package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Traveller_dashboard_Us20_Us21_Page {
   public Traveller_dashboard_Us20_Us21_Page (){

    PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Update Profile']")
    public WebElement updateProfileButonu;
    @FindBy(xpath="//input[@name='traveller_name']")
    public  WebElement nameDuzenlemeButonu;

    @FindBy(xpath="//input[@name='traveller_email']")
    public  WebElement emailAdressDuzenlemeButonu;

    @FindBy(xpath="//input[@name='traveller_phone']")
    public WebElement phoneDuzenlemeButonu;

    @FindBy(xpath="//input[@name='traveller_country']")
    public  WebElement countryDuzenlemeButonu;

    @FindBy(xpath="//input[@name='traveller_address']")
    public  WebElement addressDuzenlemeButonu;

    @FindBy(xpath="//input[@name='traveller_state']")
    public WebElement stateDuzenlemeButonu;

    @FindBy(xpath="//input[@name='traveller_city']")
    public  WebElement cityDuzenlemeButonu;

    @FindBy (xpath = "//input[@name='traveller_zip']")
    public  WebElement zipDuzenlemeButonu;


    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement updateButonu;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement profileIsUpdatedSuccessfully ;


    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/traveller/order']")
    public WebElement paymentHistoryButonu;

    @FindBy(xpath = "//div[@class='detail-dashboard table-responsive mt_30']")
    public WebElement ViewAllPayments;
}

