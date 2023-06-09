package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Traveller_loginPage {

    public Traveller_loginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/a[2]")
    public WebElement loginPageButton;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public  WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@class ='wpcc-btn']")
    public WebElement acceptCookies;

    @FindBy(xpath = "/html/body/div[6]/div/div/div[2]/div/div/div[1]")
    public WebElement comletedOrdersButton;

    @FindBy(xpath = "//*[text()='ACCEPT']")
    public WebElement acceptButonu;

    @FindBy(xpath="//*[text()='Login']")
    public WebElement loginButonuGiris;

    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement emailAddressKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public  WebElement passwordKutusu;

    @FindBy(xpath="(//*[text()='Login'])[3]")
    public WebElement loginButonu;

    @FindBy(className = "logo")
    public WebElement anasayfaGoruntuleme;


}
