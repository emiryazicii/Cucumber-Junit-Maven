package com.emir.step_definitions;

import io.cucumber.java.en.Then;

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

}