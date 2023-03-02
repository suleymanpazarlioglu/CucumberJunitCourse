package cydeo.pages;

import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "cardNo")
    public WebElement card;

    @FindBy(xpath = "//input[@name=\"cardNo\"]")
    public WebElement card2;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }

    public void login(String username,String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public void loginWithConfig(){
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        this.username.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        this.password.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        this.loginButton.click();
    }


}
