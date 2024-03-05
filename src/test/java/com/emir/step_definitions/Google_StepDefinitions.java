package com.emir.step_definitions;

import com.emir.pages.GoogleSearchPage;
import com.emir.utilities.BrowserUtils;
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
     * Step definition for searching for "apple".
     */
    @When("user searches for apple")
    public void userSearchesForApple() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    /**
     * Step definition for verifying if the title contains "apple".
     */
    @Then("user should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        Assert.assertTrue(BrowserUtils.verifyTitle("apple"));
    }

    /**
     * Step definition for navigating to the Google search page.
     */
    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        // Navigate to Google search page
        Driver.getDriver().get("https://www.google.com");
    }

    /**
     * Step definition for verifying the title of the Google search page.
     */
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Get actual title of the page
        String actualTitle = Driver.getDriver().getTitle();
        // Expected title
        String expectedTitle = "Google";

        // Assert the title
        Assert.assertEquals(actualTitle, expectedTitle);

        // Close the driver after verification
        Driver.closeDriver();
    }

}
