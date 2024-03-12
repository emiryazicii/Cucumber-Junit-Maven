package com.emir.step_definitions;

import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * Step definitions for Etsy-related scenarios in Cucumber tests.
 */
public class EtsyStepDefinitions {

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
}
