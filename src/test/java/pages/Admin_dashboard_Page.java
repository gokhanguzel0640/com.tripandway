package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_dashboard_Page {
    public Admin_dashboard_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span)[1]")
    public WebElement dashboardButton;
    @FindBy(xpath = "(//span)[2]")
    public WebElement generalSettingsButton;
    @FindBy(xpath = "(//span)[3]")
    public WebElement pageSettingsButton;
    @FindBy(xpath = "(//span)[4]")
    public WebElement paymentSettingsButton;
    @FindBy(xpath = "(//span)[5]")
    public WebElement blogSectionButton;
    @FindBy(xpath = "(//span)[6]")
    public WebElement destinationsButton;
    @FindBy(xpath = "(//span)[7]")
    public WebElement packagesButton;
    @FindBy(xpath = "(//span)[8]")
    public WebElement dynamicPagesButton;
    @FindBy(xpath = "(//span)[9]")
    public WebElement languageButton;
    @FindBy(xpath = "(//span)[10]")
    public WebElement webSiteSectionButton;
    @FindBy(xpath = "(//span)[11]")
    public WebElement orderButton;
    @FindBy(xpath = "(//span)[12]")
    public WebElement travellerButton;
    @FindBy(xpath = "(//span)[13]")
    public WebElement emailTemplateButton;
    @FindBy(xpath = "(//span)[14]")
    public WebElement subscriberButton;
    @FindBy(xpath = "//*[text()='Logo']")
    public WebElement logoButton;
    @FindBy(xpath = "//*[text()='Home']")
    public WebElement homeButton;
    @FindBy(xpath = "//*[text()='Payment Information']")
    public WebElement paymentInformationButton;
    @FindBy(xpath = "(//*[text()='Dynamic Pages'])[2]")
    public WebElement dynamicPagesText;
    @FindBy(xpath = "//*[text()='Language Setting']")
    public WebElement languageSettingText;
    @FindBy(xpath = "//*[text()='Email Templates']")
    public WebElement emailTemplatesText;


    }


