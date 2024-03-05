package com.emir.step_definitions;

import com.emir.pages.DropdownsPage;
import com.emir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Step definitions class for handling Cucumber Data Tables.
 */
public class DataTables_StepDefinitions {

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
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    /**
     * Step definition for verifying the expected months in the month dropdown.
     *
     * @param expectedMonths The list of expected months.
     */
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {
        // Creating a Select object for the month dropdown
        Select month = new Select(dropdownsPage.monthDropdown);

        // Getting the list of actual months as WebElements
        List<WebElement> actualMonth_as_WebElement = month.getOptions();

        // Converting the list of actual months from WebElements to Strings
        List<String> actualMonth_as_String = new ArrayList<>();
        for (WebElement eachElement : actualMonth_as_WebElement) {
            actualMonth_as_String.add(eachElement.getText());
        }

        // Verifying if the actual months match the expected months
        Assert.assertEquals(actualMonth_as_String, expectedMonths);
    }

}