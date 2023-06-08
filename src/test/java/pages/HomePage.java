package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {



    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"menu\"]/li[1]/a")
    public WebElement home;
    @FindBy(xpath = "(//*[text()='Services'])[2]")
    public WebElement services;
    @FindBy(xpath = "(//*[text()='Destinations'])[2]")
    public WebElement destinations;
    @FindBy(xpath = "(//*[text()='Packages'])[2]")
    public WebElement packages;
    @FindBy(xpath = "(//*[text()='About Us'])[2]")
    public WebElement aboutus;
    @FindBy(xpath = "(//*[text()='FAQ'])[2]")
    public WebElement faq;
    @FindBy(xpath = "(//*[text()='Blog'])[2]")
    public WebElement blog;
    @FindBy(xpath = "(//*[text()='Contact'])[2]")
    public WebElement contact;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div/p[1]")
    public WebElement tel;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div/p[2]")
    public WebElement email;

    @FindBy(xpath= "//*[@alt='Logo']")
    public WebElement logo;

    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/traveller/register']")
    public WebElement registration;

    @FindBy(xpath = "//a[@href='https://qa.tripandway.com/traveller/login']")
    public WebElement login;
    }

