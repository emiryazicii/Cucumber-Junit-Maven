package com.emir.step_definitions;

import com.emir.pages.WebTableLoginPage;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * Step definitions for scenarios related to the WebTable application login page.
 */
public class WebTableStepDefinitions {

    // Creating an instance of the WebTableLoginPage class
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    /**
     * Navigates the user to the WebTable application login page.
     * This step is specified in the Cucumber feature files.
     */
    @Given("user is on the WebTable app login page")
    public void user_is_on_the_web_table_app_login_page() {
        // Navigates to the URL specified in the configuration file
        Driver.getDriver().get(ConfigurationReader.getProperty("env.webTable.login"));
    }

    /**
     * Enters the correct username into the username input field.
     * This step is specified in the Cucumber feature files.
     */
    @When("user enters correct username")
    public void user_enters_correct_username() {
        // Enters the username retrieved from the configuration file into the username input field
        webTableLoginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username.webTable.login"));
    }

    /**
     * Enters the correct password into the password input field.
     * This step is specified in the Cucumber feature files.
     */
    @When("user enters correct password")
    public void user_enters_correct_password() {
        // Enters the password retrieved from the configuration file into the password input field
        webTableLoginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password.webTable.login"));
    }

    /**
     * Clicks the login button on the login page.
     * This step is specified in the Cucumber feature files.
     */
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        // Clicks the login button on the login page
        webTableLoginPage.loginButton.click();
    }

    /**
     * Verifies that the URL contains the word "orders".
     * This step is specified in the Cucumber feature files.
     */
    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
        // Asserts that the current URL contains the word "orders"
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }
}
