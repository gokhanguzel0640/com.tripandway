package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_dashboard_Us27_Us28_Page {
    public Admin_dashboard_Us27_Us28_Page(){
    PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span)[2]")
    public WebElement adminGeneralsettings;
    @FindBy(xpath = "(//span)[3]")
    public WebElement adminPageSettings;
    @FindBy(xpath = "(//span)[4]")
    public WebElement adminPaymentSettings;
    @FindBy(xpath = "(//span)[5]")
    public WebElement adminBlocksection;
    @FindBy(xpath = "(//span)[8]")
    public WebElement adminDynamicPages;
    @FindBy(xpath = "(//span)[9]")
    public WebElement adminLanguage;
    @FindBy(xpath = "(//span)[10]")
    public WebElement adminWebSiteSection;
    @FindBy(xpath = "(//span)[13]")
    public WebElement adminEmailTemplate;

    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement adminCategories;

    @FindBy(xpath = "//*[@href='https://qa.tripandway.com/admin/category/create']")
    public WebElement adminBlogCreateNew;















}
