package com.emir.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * A utility class for browser-related operations.
 */
public class BrowserUtils {

    /**
     * Switches to the window with the expected URL and verifies the expected title.
     *
     * @param expectedURL   Expected URL to be found in the window.
     * @param expectedTitle Expected title of the window.
     * @return true if the title contains the expectedTitle, false otherwise.
     */
    public static boolean switchWindowAndVerify(String expectedURL, String expectedTitle) {
        // Get all window handles
        Set<String> allHandles = Driver.getDriver().getWindowHandles();

        // Iterate through each handle
        for (String eachHandle : allHandles) {
            // Switch to the window
            Driver.getDriver().switchTo().window(eachHandle);
            // Check if the current URL contains the expectedURL
            if (Driver.getDriver().getCurrentUrl().contains(expectedURL)) {
                // If found, break the loop
                break;
            }
        }

        // Return whether the title contains the expectedTitle
        return Driver.getDriver().getTitle().contains(expectedTitle);
    }

    /**
     * Verifies if the title of the current page matches the expected title.
     *
     * @param expectedTitle Expected title of the page.
     * @return true if the title matches the expected title, false otherwise.
     */
    public static boolean verifyTitle(String expectedTitle) {
        // Compare the current title with the expected title
        return Driver.getDriver().getTitle().equals(expectedTitle);
    }

    /**
     * Verifies if the title of the current page contains the expected text.
     *
     * @param expectedInTitle The text expected to be contained in the title.
     * @return true if the title contains the expected text, false otherwise.
     */
    public static boolean verifyTitleContains(String expectedInTitle) {
        // Check if the current title contains the expected text
        return Driver.getDriver().getTitle().contains(expectedInTitle);
    }

    /**
     * Utility method to pause the execution for a specified number of seconds.
     *
     * @param seconds The number of seconds to sleep.
     */
    public static void sleep(int seconds) {
        // Convert seconds to milliseconds
        seconds *= 1000;
        try {
            // Sleep for the specified number of milliseconds
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            // If interrupted while sleeping, catch and ignore the exception
        }
    }

}
/*
 Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: String expectedInUrl
• Arg2: String expectedTitle
 */

/*
Create utility method
1. Create a new method for title verification
2. Create a method to make title verification logic re-usable
3. When method is called, it should simply verify expected title with actual
title
Method info:
• Name: verifyTitle()
• Return type: void
• Arg: String expectedTitle
 */