package com.emir.step_definitions;

import com.emir.pages.WikiResultPage;
import com.emir.pages.WikiSearchPage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.ObjectInputFilter;

/**
 * Step definitions class for Wikipedia search feature.
 */
public class Wiki_StepDefinitions {

    // Initializing WikiSearchPage object
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    // Initializing WikiResultPage object
    WikiResultPage wikiResultPage = new WikiResultPage();

    /**
     * Step definition for navigating to the Wikipedia home page.
     */
    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        // Navigate to Wikipedia home page
        Driver.getDriver().get(ConfigurationReader.getProperty("env.wiki"));
    }

    /**
     * Step definition for typing a search term in the Wikipedia search box.
     *
     * @param searchKey The search term to type.
     */
    @When("user types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String searchKey) {
        // Typing the search term in the search box
        wikiSearchPage.searchBox.sendKeys(searchKey);
    }

    /**
     * Step definition for clicking the Wikipedia search button.
     */
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        // Clicking the search button
        wikiSearchPage.searchButton.click();
    }

    /**
     * Step definition for verifying if the expected term is present in the title of the Wikipedia search results page.
     *
     * @param expectedTitle The expected term to verify in the title.
     */
    @Then("user sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String expectedTitle) {
        // Verifying if the expected term is present in the title of the search results page
        Assert.assertTrue(BrowserUtils.verifyTitleContains(expectedTitle));
    }

    /**
     * Step definition for verifying if the expected term is present in the main header of the Wikipedia search results page.
     *
     * @param expectedHeaderPart The expected term to verify in the main header.
     */
    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String expectedHeaderPart) {
        // Verifying if the expected term is present in the main header of the search results page
        Assert.assertTrue(wikiResultPage.mainHeader.getText().contains(expectedHeaderPart));
    }

    /**
     * Step definition for verifying if the expected text is present in the image header of the Wikipedia search results page.
     *
     * @param expectedText The expected text to verify in the image header.
     */
    @Then("user sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String expectedText) {
        // Verifying if the expected text is present in the image header
        Assert.assertEquals(expectedText,wikiResultPage.imageHeader.getText());
    }
}
