package com.emir.step_definitions;

import com.emir.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * This class contains Cucumber hooks for setup and teardown operations.
 */
public class Hooks {

    /**
     * Method to execute before each scenario.
     */
   //@Before
    public void setupMethod() {
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");
    }

    /**
     * Method to execute after each scenario.
     *
     * @param scenario The scenario object representing the current scenario.
     */
    @After
    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()){

            // Take screenshot of the current state of the browser
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // Attach the screenshot to the scenario report
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");

        // Close the driver
        Driver.closeDriver();

    }

    /**
     * Method to execute before each step within a scenario.
     */
    // @BeforeStep
    public void setupStep() {
        System.out.println("----->@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    /**
     * Method to execute after each step within a scenario.
     */
    // @AfterStep
    public void tearDownStep() {
        System.out.println("------>@AfterStep: RUNNING AFTER EACH STEP");
    }
}
