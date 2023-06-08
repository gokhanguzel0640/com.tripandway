package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_dashboard_Us31_Us32_Page {

    public Admin_dashboard_Us31_Us32_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[@class='sidebar-brand d-flex align-items-center justify-content-center']")
    public WebElement adminPanelText;
    @FindBy (xpath = "//span[text()='Packages']")
    public WebElement packagesSectionButton;
    @FindBy (xpath = "//h6[text()='View Packages']")
    public WebElement packagesText;
    @FindBy (xpath = "//i[@class='fa fa-plus']")
    public WebElement packagesAddNewButton;
    @FindBy (xpath = "//input[@name='p_name']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@name='p_slug']")
    public WebElement slugBox;
    @FindBy (xpath = "//input[@name='p_photo']")
    public WebElement uploadPhotoButton;
    @FindBy(xpath = "(//div[@class='note-editable card-block'])[1]")
    public WebElement descriptionBox;
    @FindBy(xpath = "//textarea[@name='p_description_short']")
    public WebElement shortDescriptionBox;
    @FindBy(xpath = "//textarea[@name='p_location']")
    public WebElement locationBox;
    @FindBy(xpath = "//input[@name='p_start_date']")
    public WebElement startDateBox;
    @FindBy(xpath = "//input[@name='p_end_date']")
    public WebElement endDateBox;
    @FindBy(xpath = "//input[@name='p_last_booking_date']")
    public WebElement lastBookingDateBox;
    @FindBy(xpath = "//textarea[@name='p_map']")
    public WebElement mapBox;
    @FindBy(xpath = "(//div[@class='note-editable card-block'])[2]")
    public WebElement itineraryBox;
    @FindBy(xpath = "//input[@name='p_price']")
    public WebElement priceBox;
    @FindBy(xpath = "(//div[@class='note-editable card-block'])[3]")
    public WebElement policyBox;
    @FindBy(xpath = "(//div[@class='note-editable card-block'])[4]")
    public WebElement termsBox;
    @FindBy(xpath = "//select[@name='p_is_featured']")
    public WebElement isFeaturedList;
    @FindBy(xpath = "//option[@value='No']")
    public WebElement isFeaturedNo;
    @FindBy(xpath = "//select[@name='destination_id']")
    public WebElement destinationList;
    @FindBy(xpath = "//input[@name='seo_title']")
    public WebElement title;
    @FindBy(xpath = "//textarea[@name='seo_meta_description']")
    public WebElement metaDescription;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//*[text()='Package is added successfully!']")
    public WebElement actualAddText;
    @FindBy(xpath = "(//i[@class='fas fa-edit'])[7]")
    public WebElement editButton;
    @FindBy (xpath = "//*[text()='Update']")
    public WebElement updateButton;
    @FindBy (xpath = "(//a[@class='nav-link'])[6]")
    public WebElement ordersSection;
    @FindBy (xpath = "//h1[@class='h3 mb-3 text-gray-800']")
    public WebElement ordersText;
    @FindBy (id = "dataTable_info")
    public WebElement ordersAmount;
    @FindBy(xpath = "(//span)[11]")
    public WebElement orderButton;
    @FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[7]")
    public WebElement deleteButton;
    @FindBy(xpath = "//input[@name='p_name']")
    public WebElement editNameBox;
    @FindBy (xpath = "//*[text()='Update']")
    public WebElement editUpdateButton;
    @FindBy(xpath = "//*[text()='Package is updated successfully!']")
    public WebElement uptadeSucText;
    @FindBy(xpath = "//*[text()='Package is deleted successfully!']")
    public WebElement deleteSucText;







}
