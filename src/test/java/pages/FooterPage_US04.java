package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FooterPage_US04 {
    public FooterPage_US04() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@type='button']")
    public WebElement acceptbuton;

    @FindBy (xpath ="(//div[@class='footer-item mt_30']/ul/li)[1]")
    public WebElement featured1;

    @FindBy (xpath ="(//div[@class='footer-item mt_30']/ul/li)[2]")
    public WebElement featured2;

    @FindBy (xpath ="(//div[@class='footer-item mt_30']/ul/li)[3]")
    public WebElement featured3;

    @FindBy (xpath ="(//div[@class='footer-item mt_30']/ul/li)[4]")
    public WebElement featured4;

    @FindBy (xpath ="(//div[@class='footer-item mt_30']/ul/li)[5]")
    public WebElement featured5;


}