package pages;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_loginPage {
    public Admin_loginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(id= "email")
        public WebElement email;
        @FindBy(id = "password")
        public WebElement password;

        @FindBy (xpath = "//button[text()='Login']")
        public WebElement adminLoginButton;

        @FindBy(xpath = "//*[@type='submit']")
        public WebElement loginButton;

}

