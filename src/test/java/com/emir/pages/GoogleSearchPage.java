package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Google Search page.
 */
public class GoogleSearchPage {

    /**
     * Constructor to initialize elements of the GoogleSearchPage class.
     */
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * WebElement representing the search box on the Google search page.
     */
    @FindBy(id = "APjFqb")
    public WebElement searchBox;
}
