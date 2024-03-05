package com.emir.step_definitions;

import com.emir.pages.BingSearchPage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

/**
 * Step definitions class for Bing search feature.
 */
public class Bing_StepDefinitions {

    // Initializing BingSearchPage object
    BingSearchPage bingSearchPage = new BingSearchPage();

    /**
     * Step definition for navigating to the Bing search page.
     */
    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        // Navigate to Bing search page
        Driver.getDriver().get("https://www.bing.com");
    }

    /**
     * Step definition for searching for "orange" in Bing search box.
     */
    @When("user searches for orange in Bing search box")
    public void user_searches_for_orange_in_bing_search_box() {
        bingSearchPage.searchBox.sendKeys("orange");
        BrowserUtils.sleep(3); // Adding a delay for demonstration purposes
        bingSearchPage.searchBox.sendKeys(Keys.ENTER);
    }

    /**
     * Step definition for verifying if the title contains "orange".
     */
    @Then("user should see orange in title")
    public void user_should_see_orange_in_title() {
        Assert.assertTrue(BrowserUtils.verifyTitle("orange - Search"));
    }
}
