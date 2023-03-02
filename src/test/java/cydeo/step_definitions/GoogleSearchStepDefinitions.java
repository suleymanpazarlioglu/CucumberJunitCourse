package cydeo.step_definitions;

import cydeo.pages.GoogleSearchPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearchStepDefinitions {

    GoogleSearchPage googleSearchPage;

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String keyword) {
        googleSearchPage=new GoogleSearchPage();
        googleSearchPage.inputBox.sendKeys(keyword+ Keys.ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String keyword) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(keyword));
    }






}
