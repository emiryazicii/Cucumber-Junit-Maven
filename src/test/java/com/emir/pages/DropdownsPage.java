package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page class for the Dropdowns page.
 */
public class DropdownsPage {

    // Web element representing the month dropdown
    @FindBy(id = "month")
    WebElement monthDropdown;

    /**
     * Constructor to initialize the page elements using PageFactory.
     */
    public DropdownsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
