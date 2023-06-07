package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class Admin_dashboard_Us33_Us34_Us35_Page {
       public Admin_dashboard_Us33_Us34_Us35_Page (){
                PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "(//a[@class='btn btn-success btn-sm btn-block'])[1]")
        public  WebElement  firstdetailButton;
        @FindBy(xpath = "(//a[@class='btn btn-success btn-sm btn-block'])[2]")
        public  WebElement  secondDetailButton;

        @FindBy(xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
        public WebElement orderDetail;

        @FindBy(xpath = "(//a[@class='btn btn-info btn-sm btn-block'])[1]")
         public WebElement firstInvoiceButton;

        @FindBy(xpath = "(//a[@class='btn btn-info btn-sm btn-block'])[2]")
        public WebElement secondInvoiceButton;

        @FindBy(xpath = "//h1[@class='h3 mb-3 text-gray-800 invoice-heading']")
        public WebElement orderInvoice;

        @FindBy(xpath = "(//a[@class='collapse-item'])[12]")
        public WebElement allSubscribersButton;

        @FindBy(xpath = "//h6[@class='m-0 mt-2 font-weight-bold text-primary']")
        public WebElement viewSubscribers;




}
