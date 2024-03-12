package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class representing the login page of a web application with a web table.
 */
public class WebTableLoginPage {

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
     * Constructor to initialize the page elements using PageFactory.
     * It initializes the page elements using the driver instance.
     */
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
