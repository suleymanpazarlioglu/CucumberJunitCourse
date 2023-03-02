package cydeo.step_definitions;

import cydeo.pages.WikiHomePage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Wiki_StepDefinitions {

    WikiHomePage wikiHomePage=new WikiHomePage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String keyword) {

        wikiHomePage.searchBox.sendKeys(keyword);

    }
    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wikiHomePage.searchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String keyword) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(keyword));
    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String keyword) {

        Assert.assertTrue(wikiHomePage.header.getText().contains(keyword));
    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String keyword) {
        Assert.assertTrue(wikiHomePage.imageHeader.getText().contains(keyword));
    }
}
