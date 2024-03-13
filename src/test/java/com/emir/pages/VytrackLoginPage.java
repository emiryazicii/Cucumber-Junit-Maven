package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Vytrack login page.
 */
public class VytrackLoginPage {

    /** Constructor to initialize the page elements. */
    public VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /** WebElement representing the username input field. */
    @FindBy(id="prependedInput")
    public WebElement loginUser;

    /** WebElement representing the password input field. */
    @FindBy(id="prependedInput2")
    public WebElement loginPass;

    /** WebElement representing the login button. */
    @FindBy(id="_submit")
    public WebElement loginBtn;

    /**
     * Logs in to Vytrack with the provided username and password.
     *
     * @param username the username to login with.
     * @param password the password to login with.
     */
    public void login(String username, String password){
        loginUser.sendKeys(username);
        loginPass.sendKeys(password);
        loginBtn.click();
    }
}
