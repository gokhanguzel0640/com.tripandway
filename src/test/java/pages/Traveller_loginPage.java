package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Traveller_loginPage {
    public Traveller_loginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='ACCEPT']")
    public  WebElement acceptButonu;

    @FindBy(xpath="//*[text()='Login']")
    public WebElement loginButonuGiris;

    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement LoginemailKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public  WebElement LoginpasswordKutusu;

    @FindBy(xpath="(//*[text()='Login'])[3]")
    public WebElement loginButonu;

    @FindBy(className = "logo")
    public WebElement anasayfaGoruntuleme;

}

