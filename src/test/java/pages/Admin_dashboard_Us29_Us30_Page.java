package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_dashboard_Us29_Us30_Page {

    public Admin_dashboard_Us29_Us30_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Blogs")
    public WebElement blogsButton;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement addNewButton;

    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement blogTitleButton;

    @FindBy(xpath = "//input[@name='blog_photo']")
    public WebElement dosyaSecButton;

    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement selectCategory;

    @FindBy(xpath = "//select[@name='comment_show']")
    public WebElement showComment;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addBlogSubmit;

    @FindBy(xpath = "//*[text()='Blog is added successfully!']")
    public WebElement newBlogText;

    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[7]")
    public WebElement editBlogButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[text()='Blog is updated successfully!']")
    public WebElement editBlogText;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[7]")
    public WebElement deleteBlogButton;

    @FindBy(xpath = "//*[text()='Blog is deleted successfully!']")
    public WebElement deleteBlogText;








}
