package com.emir.step_definitions;

import com.emir.pages.WebTableLoginPage;
import com.emir.pages.WebTableOrderPage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

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

    /**
     * Enters the specified username into the username input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param username The username to be entered into the username input field.
     */
    @When("user enters {string} username")
    public void user_enters_username(String username) {
        // Enters the provided username into the username input field
        webTableLoginPage.usernameBox.sendKeys(username);
    }

    /**
     * Enters the specified password into the password input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param password The password to be entered into the password input field.
     */
    @When("user enters {string} password")
    public void user_enters_password(String password) {
        // Enters the provided password into the password input field
        webTableLoginPage.passwordBox.sendKeys(password);
    }

    /**
     * Enters the provided username and password into the corresponding input fields.
     * This step is specified in the Cucumber feature files.
     *
     * @param credentials A Map containing the username and password to be entered.
     */
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
        // Enters the provided username from the credentials map into the username input field
        webTableLoginPage.usernameBox.sendKeys(credentials.get("username"));

        // Enters the provided password from the credentials map into the password input field
        webTableLoginPage.passwordBox.sendKeys(credentials.get("password"));
    }

    // Creating an instance of the WebTableOrderPage class
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();

    /**
     * Navigates the user to the WebTable application login page
     * and performs login using predefined credentials.
     * This step is specified in the Cucumber feature files.
     */
    @Given("user is already logged in to the WebTable app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        // Navigates to the URL specified in the configuration file
        Driver.getDriver().get(ConfigurationReader.getProperty("env.webTable.login"));
        // Performs login using predefined credentials
        webTableLoginPage.login();
    }

    /**
     * Clicks on the Orders link to navigate to the Orders page.
     * This step is specified in the Cucumber feature files.
     */
    @When("user is on the Orders page")
    public void user_is_on_the_orders_page() {
        // Clicks on the Orders link to navigate to the Orders page
        webTableOrderPage.orderLink.click();
    }

    /**
     * Verifies the options displayed under the product dropdown on the Orders page.
     * This step is specified in the Cucumber feature files.
     *
     * @param expectedOptions The list of expected options under the product dropdown.
     */
    @Then("user sees below options under product dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {
        // Retrieves the actual options from the product dropdown as a list of strings
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_String(webTableOrderPage.productDropdown);
        // Asserts that the actual options match the expected options
        Assert.assertEquals(expectedOptions, actualOptions);
    }
}
