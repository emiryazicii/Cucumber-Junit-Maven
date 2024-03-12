package com.emir.pages;

import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class representing the login page of a web application with a web table.
 */
public class WebTableLoginPage {

    /**
     * Constructor to initialize the page elements using PageFactory.
     * It initializes the page elements using the driver instance.
     */
    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * WebElement representing the username input field on the login page.
     */
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    /**
     * WebElement representing the password input field on the login page.
     */
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    /**
     * WebElement representing the login button on the login page.
     */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    /**
     * Method to perform login action using predefined credentials.
     * It enters the username and password into their respective input fields
     * and clicks on the login button.
     */
    public void login() {
        // Enters the username from configuration into the username input field
        this.usernameBox.sendKeys(ConfigurationReader.getProperty("username.webTable.login"));

        // Enters the password from configuration into the password input field
        this.passwordBox.sendKeys(ConfigurationReader.getProperty("password.webTable.login"));

        // Clicks on the login button
        this.loginButton.click();
    }

    /**
     * Method to perform login action using custom username and password.
     * It enters the provided username and password into their respective input fields
     * and clicks on the login button.
     *
     * @param username The username to be entered into the username input field.
     * @param password The password to be entered into the password input field.
     */
    public void login(String username, String password) {
        // Enters the provided username into the username input field
        this.usernameBox.sendKeys(username);

        // Enters the provided password into the password input field
        this.passwordBox.sendKeys(password);

        // Clicks on the login button
        this.loginButton.click();
    }
}
