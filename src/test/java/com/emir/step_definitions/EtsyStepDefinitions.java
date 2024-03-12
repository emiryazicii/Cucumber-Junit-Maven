package com.emir.step_definitions;

import com.emir.pages.EtsyHomePage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * Step definitions for Etsy-related scenarios in Cucumber tests.
 */
public class EtsyStepDefinitions {

    EtsyHomePage etsyHomePage = new EtsyHomePage();

    /**
     * Navigates the user to the Etsy homepage.
     * This step is specified in the Cucumber feature files.
     */
    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        // Navigates to the URL specified in the configuration file
        Driver.getDriver().get(ConfigurationReader.getProperty("env.etsy"));
    }

    /**
     * Verifies that the title of the Etsy homepage matches the expected title.
     * This step is specified in the Cucumber feature files.
     */
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        // Asserts that the title of the webpage matches the expected title
        Assert.assertTrue(BrowserUtils.verifyTitle(ConfigurationReader.getProperty("expected.title.etsy")));
    }

    /**
     * Performs the action of typing "Wooden Spoon" in the search box on the Etsy homepage.
     * This step is specified in the Cucumber feature files.
     */
    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        // Types "Wooden Spoon" into the search box
        etsyHomePage.searchBox.sendKeys(ConfigurationReader.getProperty("search.data.etsy"));
    }

    /**
     * Performs the action of clicking the search button on the Etsy homepage.
     * This step is specified in the Cucumber feature files.
     */
    @When("user clicks to Etsy search button")
    public void user_clicks_to_etsy_search_button() {
        // Clicks the search button
        etsyHomePage.searchButton.click();
    }

    /**
     * Verifies that "Wooden Spoon" is present in the title after performing a search on Etsy.
     * This step is specified in the Cucumber feature files.
     */
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        // Verifies that "Wooden Spoon" is in the title
        Assert.assertTrue(BrowserUtils.verifyTitle(ConfigurationReader.getProperty("expected.title.etsy.search")));
    }

    /**
     * Performs the action of typing a keyword in the search box on the Etsy homepage.
     * This step is specified in the Cucumber feature files.
     *
     * @param keyword The keyword to be typed into the search box
     */
    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {
        // Types the specified keyword into the search box
        etsyHomePage.searchBox.sendKeys(keyword);
    }

    /**
     * Verifies that a specified title is present in the browser title.
     * This step is specified in the Cucumber feature files.
     *
     * @param expectedTitle The expected title to be verified
     */
    @Then("user sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        // Verifies that the expected title is present in the browser title
        Assert.assertTrue(BrowserUtils.verifyTitle(expectedTitle));
    }
}

