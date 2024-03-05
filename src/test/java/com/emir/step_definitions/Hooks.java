package com.emir.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/**
 * This class contains Cucumber hooks for setup and teardown operations.
 */
public class Hooks {

    /**
     * Method to execute before each scenario.
     */
    //@Before
    public void setupMethod(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");
    }

    /**
     * Method to execute after each scenario.
     */
    //@After
    public void tearDown(){
        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
    }

    /**
     * Method to execute before each step within a scenario.
     */
   // @BeforeStep
    public void setupStep(){
        System.out.println("----->@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    /**
     * Method to execute after each step within a scenario.
     */
   // @AfterStep
    public void tearDownStep(){
        System.out.println("------>@AfterStep: RUNNING AFTER EACH STEP");
    }
}
