package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page {
    public Admin_dashboard_Us36_Us37_Us38_Us39_Us40_Us41_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='All Subscribers']")
    public WebElement allSubscribersButton;
    @FindBy(xpath = "//*[text()=' Send Email to Subscribers']")
    public WebElement sendEmailToSubscribersButton;
    @FindBy(name = "subject")
    public WebElement subjectBox;
    @FindBy(xpath = "//*[@role='textbox']")
    public WebElement textBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendEmailButton;
    @FindBy(xpath = "//*[text()='Email is sent successfully to all subscribers!']")
    public WebElement sentSuccessfullyAlert;
    @FindBy(xpath = "//*[@class='img-profile rounded-circle']")
    public WebElement adminProfilePhoto;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement profileChangePasswordButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement profileChangePhotoButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement editNameBox;
    @FindBy(xpath = "//img[@class='w_150']")
    public WebElement existingFotoIcon;
    @FindBy(xpath = "//*[@id='sidebarToggle']")
    public WebElement dropdownArrowSymbol;
    @FindBy(xpath = "//*[@target='_blank']")
    public WebElement visitWebsiteButton;
    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement profileLogoutButton;
}
