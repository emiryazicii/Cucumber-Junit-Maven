package com.emir.step_definitions;

import io.cucumber.java.en.Then;
import java.util.List;

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
}
