package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableOrderPage {

    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement selectProduct;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement cardVisa;

    @FindBy(xpath = "//input[@name='cardNo']")
    public  WebElement cardNumber;

    @FindBy(xpath = "//input[@name='cardExp']")
    public  WebElement cardNExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    @FindBy(xpath = "//tbody//td")
    public WebElement firstRowName;


  

  




}
