package com.emir.step_definitions;

import com.emir.pages.DropdownsPage;
import com.emir.pages.GoogleSearchPage;
import com.emir.utilities.BrowserUtils;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

/**
 * Step definitions class for handling Cucumber Data Tables.
 */
public class DataTables_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    /**
     * Step definition for verifying the list of fruits and vegetables.
     *
     * @param fruitsAndVegetables The list of fruits and vegetables.
     */
    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        // Print out the list of fruits and vegetables
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);
    }

    /**
     * Step definition for verifying the list of animals.
     *
     * @param animals The list of animals.
     */
    @Then("user should see below list of animals")
    public void user_should_see_below_list_of_animals(List<String> animals) {
        // Print out the list of animals
        System.out.println("animals = " + animals);
    }

    /**
     * Step definition for verifying that the officer is able to see any data he wants about the driver.
     *
     * @param driverInfo The map containing the driver's information.
     */
    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String,String> driverInfo) {
        // Printing out the driver's information
        System.out.println("driverInfo = " + driverInfo);

        // Printing out specific information about the driver
        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"zipcode\") = " + driverInfo.get("zipcode"));
        System.out.println("driverInfo.get(\"state\") = " + driverInfo.get("state"));
    }

    // Initializing DropdownsPage object
    DropdownsPage dropdownsPage = new DropdownsPage();

    /**
     * Step definition for navigating to the dropdowns page of the practice tool.
     */
    @Given("user is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        // Navigate to the dropdowns page of the practice tool
        Driver.getDriver().get(ConfigurationReader.getProperty("env.dropdown"));
    }

    /**
     * Step definition for verifying the expected months in the month dropdown.
     *
     * @param expectedMonths The list of expected months.
     */
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        // Retrieving the actual months from the month dropdown
        List<String> actualMonths = BrowserUtils.dropdownOptions_as_String(dropdownsPage.monthDropdown);

        // Verifying if the actual months match the expected months
        Assert.assertEquals(expectedMonths, actualMonths);
    }

    /**
     * Step definition for searching for keywords on Google search page.
     *
     * @param searchKeyword The list of keywords to search for.
     */
    @Then("user should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> searchKeyword) {
        // Loop through each keyword and perform a search
        for (String eachKeyword : searchKeyword) {
            googleSearchPage.searchBox.sendKeys(eachKeyword+ Keys.ENTER);
        }
    }
}