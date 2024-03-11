package com.emir.step_definitions;

import com.emir.pages.GoogleSearchPage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

/**
 * Step definitions class for Google search feature.
 */
public class Google_StepDefinitions {

    // Initializing GoogleSearchPage object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    /**
     * Step definition for searching for "word".
     */
    @When("user searches for {word}")
    public void userSearchesForApple(String word) {
        googleSearchPage.searchBox.sendKeys(word + Keys.ENTER);
    }

    /**
     * Step definition for verifying if the title contains "word".
     */
    @Then("user should see {word} in the title")
    public void userShouldSeeAppleInTheTitle(String word) {
        Assert.assertTrue(BrowserUtils.verifyTitle(word+" - Google Search"));
    }

    /**
     * Step definition for navigating to the Google search page.
     */
    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        // Navigate to Google search page
        Driver.getDriver().get(ConfigurationReader.getProperty("env.google"));
    }

    /**
     * Step definition for verifying the title of the Google search page.
     */
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Get actual title of the page
        String actualTitle = Driver.getDriver().getTitle();
        // Expected title
        String expectedTitle = ConfigurationReader.getProperty("expected.title.google");

        // Assert the title
        Assert.assertEquals(expectedTitle,actualTitle);

        // Close the driver after verification
        Driver.closeDriver();
    }

}
