package com.emir.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * Method to retrieve the options of a dropdown element as strings.
     *
     * @param dropdownElement The dropdown element.
     * @return The list of dropdown options as strings.
     */
    public static List<String> dropdownOptions_as_String(WebElement dropdownElement) {
        // Creating a Select object for the dropdown element
        Select dropdown = new Select(dropdownElement);

        // Getting the list of actual options as WebElements
        List<WebElement> actualOptions_as_WebElement = dropdown.getOptions();

        // Converting the list of actual options from WebElements to strings
        List<String> actualOptions_as_String = new ArrayList<>();
        for (WebElement option : actualOptions_as_WebElement) {
            actualOptions_as_String.add(option.getText());
        }

        return actualOptions_as_String;
    }

    /**
     * Clicks the radio button with the specified attribute value.
     *
     * @param radioButtons   The list of radio buttons.
     * @param attributeValue The attribute value of the radio button to be clicked.
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        // Iterate through each radio button in the list
        for (WebElement radioButton : radioButtons) {
            // Check if the current radio button's value matches the specified attribute value
            if (radioButton.getAttribute("value").equals(attributeValue)) {
                // If a match is found, click on the radio button
                radioButton.click();
            }
        }
    }
}