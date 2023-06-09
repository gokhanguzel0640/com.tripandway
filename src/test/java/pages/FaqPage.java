package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaqPage {


    public FaqPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    public WebElement faqPageButton;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div")
    public WebElement faqPageElement;

}
