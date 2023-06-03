package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Traveller_loginPage {


    public Traveller_loginPage(){
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
}
