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

   // category_name
   // category_slug
    seo_title
    seo_meta_description














}
