package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Dashboard page of VyTrack application.
 */
public class VytrackDashboardPage {

    /**
     * Constructor to initialize the VyTrackDashboardPage object.
     */
    public VytrackDashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /** WebElement representing the full name displayed on the dashboard. */
    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement fullName;

    /** WebElement representing the logout link on the dashboard. */
    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    /**
     * Performs logout action by clicking on the full name and then the logout link.
     */
    public void logout() {
        fullName.click();
        logOutLink.click();
    }
}