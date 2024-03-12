package com.emir.step_definitions;

import com.emir.pages.WebTableLoginPage;
import com.emir.pages.WebTableOrderPage;
import com.emir.pages.WebTableViewAllOrdersPage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

/**
 * Step definitions for scenarios related to the WebTable application login page.
 */
public class WebTableStepDefinitions {

    // Creating an instance of the WebTableOrderPage class
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();

    // Creating an instance of the WebTableLoginPage class
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    // Creating an instance of the WebTableViewAllOrdersPage class
    WebTableViewAllOrdersPage webTableViewAllOrdersPage = new WebTableViewAllOrdersPage();

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

    /**
     * Verifies that the VISA radio button is enabled.
     * This step is specified in the Cucumber feature files.
     */
    @Then("user sees VISA as enabled payment option")
    public void user_sees_visa_as_enabled_payment_option() {
        // Asserts that the VISA radio button is enabled
        Assert.assertTrue(webTableOrderPage.visaRadioButton.isEnabled());
    }

    /**
     * Verifies that the MasterCard radio button is enabled.
     * This step is specified in the Cucumber feature files.
     */
    @Then("user sees MasterCard as enabled payment option")
    public void user_sees_master_card_as_enabled_payment_option() {
        // Asserts that the MasterCard radio button is enabled
        Assert.assertTrue(webTableOrderPage.masterCardRadioButton.isEnabled());
    }

    /**
     * Verifies that the American Express radio button is enabled.
     * This step is specified in the Cucumber feature files.
     */
    @Then("user sees American Express as enabled payment option")
    public void user_sees_american_express_as_enabled_payment_option() {
        // Asserts that the American Express radio button is enabled
        Assert.assertTrue(webTableOrderPage.americanExpressRadioButton.isEnabled());
    }

    /**
     * Enters the specified quantity into the quantity input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param quantity The quantity to be entered into the quantity input field.
     */
    @When("user enters quantity {string}")
    public void user_enters_quantity(String quantity) {
        // Clears the quantity input field and enters the specified quantity
        webTableOrderPage.inputQuantity.clear();
        webTableOrderPage.inputQuantity.sendKeys(quantity);
    }

    /**
     * Clicks the calculate button.
     * This step is specified in the Cucumber feature files.
     */
    @When("user clicks to the calculate button")
    public void user_clicks_to_the_calculate_button() {
        // Clicks the calculate button
        webTableOrderPage.calculateButton.click();
    }

    /**
     * Enters the specified customer name into the customer name input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param customerName The customer name to be entered into the customer name input field.
     */
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        // Enters the specified customer name
        webTableOrderPage.customerNameBox.sendKeys(customerName);
    }

    /**
     * Enters the specified street into the street input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param street The street to be entered into the street input field.
     */
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        // Enters the specified street
        webTableOrderPage.streetBox.sendKeys(street);
    }

    /**
     * Enters the specified city into the city input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param city The city to be entered into the city input field.
     */
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        // Enters the specified city
        webTableOrderPage.cityBox.sendKeys(city);
    }

    /**
     * Enters the specified state into the state input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param state The state to be entered into the state input field.
     */
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        // Enters the specified state
        webTableOrderPage.stateBox.sendKeys(state);
    }

    /**
     * Enters the specified zip code into the zip code input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param zip The zip code to be entered into the zip code input field.
     */
    @When("user enters zip {string}")
    public void user_enters_zip(String zip) {
        // Enters the specified zip code
        webTableOrderPage.zipBox.sendKeys(zip);
    }

    /**
     * Selects the specified payment option.
     * This step is specified in the Cucumber feature files.
     *
     * @param expectedCardType The expected card type to be selected as a payment option.
     */
    @When("user selects payment option {string}")
    public void user_selects_payment_option(String expectedCardType) {
        // Selects the specified payment option
        BrowserUtils.clickRadioButton(webTableOrderPage.cardTypes, expectedCardType);
    }

    /**
     * Enters the specified credit card number into the credit card number input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param cardNumber The credit card number to be entered into the credit card number input field.
     */
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
        // Enters the specified credit card number
        webTableOrderPage.cardNoBox.sendKeys(cardNumber);
    }

    /**
     * Enters the specified expiration date into the expiration date input field.
     * This step is specified in the Cucumber feature files.
     *
     * @param expDate The expiration date to be entered into the expiration date input field.
     */
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String expDate) {
        // Enters the specified expiration date
        webTableOrderPage.expiryDateBox.sendKeys(expDate);
    }

    /**
     * Clicks the process order button.
     * This step is specified in the Cucumber feature files.
     */
    @When("user clicks to process order button")
    public void user_clicks_to_process_order_button() {
        // Clicks the process order button
        webTableOrderPage.processOrderButton.click();
    }

    /**
     * Verifies that the specified name is displayed in the first row of the web table.
     * This step is specified in the Cucumber feature files.
     *
     * @param expectedName The expected name to be displayed in the first row of the web table.
     */
    @Then("user should see {string} in the first row of the web table")
    public void user_should_see_in_the_first_row_of_the_web_table(String expectedName) {
        // Verifies that the expected name is displayed in the first row of the web table
        Assert.assertEquals(expectedName, webTableViewAllOrdersPage.newCustomerCell.getText());
    }
}

