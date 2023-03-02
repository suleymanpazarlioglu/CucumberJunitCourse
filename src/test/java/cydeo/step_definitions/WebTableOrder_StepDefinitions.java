package cydeo.step_definitions;

import cydeo.pages.WebTableOrderPage;
import cydeo.pages.WebTablePage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class  WebTableOrder_StepDefinitions {

    WebTablePage webTablePage=new WebTablePage();
    WebTableOrderPage webTableOrderPage=new WebTableOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        webTablePage.loginWithConfig();
        webTableOrderPage.orderButton.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        Select select=new Select(webTableOrderPage.selectProduct);
        select.selectByVisibleText(product);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        webTableOrderPage.quantity.sendKeys(""+quantity);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        webTableOrderPage.customerName.sendKeys(customerName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderPage.street.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.city.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOrderPage.state.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipCode) {
        webTableOrderPage.zipCode.sendKeys(zipCode);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String visa) {
        webTableOrderPage.cardVisa.click();
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
        webTableOrderPage.cardNumber.sendKeys(cardNumber);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String cardExp) {
        webTableOrderPage.cardNExp.sendKeys(cardExp);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String name) {
        Assert.assertEquals(name,webTableOrderPage.firstRowName.getText());
    }


}
