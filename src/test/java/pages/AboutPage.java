package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AboutPage {

    public AboutPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"menu\"]/li[5]/a")
   public WebElement aboutUsButton;

    @FindBy(xpath = "//h3[text()='OUR MISSION']")
    public WebElement ourMissionText;

    @FindBy(xpath = "//h3[text()='OUR VISION']")
    public WebElement ourVisionText;
}
