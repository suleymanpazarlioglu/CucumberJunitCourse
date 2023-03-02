package cydeo.step_definitions;

import cydeo.pages.WebTablePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class WebTable_StepDefinitions {

    WebTablePage webTablePage=new WebTablePage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String keyword) {
        webTablePage.username.sendKeys(keyword);
    }
    @When("user enter password {string}")
    public void user_enter_password(String keyword) {
        webTablePage.password.sendKeys(keyword);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();
    }
    @Then("user should see url contains order")
    public void user_should_see_url_contains_order() {
        BrowserUtils.verifyURLContains("order");
    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTablePage.loginWithConfig();
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {
       //webTablePage.username.sendKeys(credentials.get("username"));
       //webTablePage.password.sendKeys(credentials.get("password"));
       //webTablePage.loginButton.click();

        webTablePage.login(credentials.get("username"),credentials.get("password"));
    }
}
