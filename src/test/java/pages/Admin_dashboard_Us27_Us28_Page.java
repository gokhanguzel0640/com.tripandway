package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_dashboard_Us27_Us28_Page {
    public Admin_dashboard_Us27_Us28_Page(){
    PageFactory.initElements(Driver.getDriver(),this);
    }
    //admin/category/view
    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement dashboarCategoriesButton;

    //https://qa.tripandway.com/admin/category/create
    @FindBy(xpath = "//*[@href='https://qa.tripandway.com/admin/category/create']")
    public WebElement blogCreateNewButton;
    @FindBy (xpath = "//*[text()='Category is added successfully!']")
     public WebElement categoryAddedAlert;
    @FindBy (xpath = "//*[text()='Category is updated successfully!']")
    public WebElement categoryUpdatedAlert;
    @FindBy (xpath = "//*[text()='Category is deleted successfully!']")
    public WebElement categoryDeletedAlert;
    @FindBy (xpath = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[4]/a[1]")
    public WebElement categoryedit;
    @FindBy (xpath = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[4]/a[2]")
    public WebElement categorydelete;
    @FindBy (xpath = "//*[@type='search']")
    public WebElement search;


















}
