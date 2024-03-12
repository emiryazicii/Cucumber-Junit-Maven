package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object class representing the Etsy homepage.
 */
public class EtsyHomePage {

    /**
     * Constructor for EtsyHomePage class.
     * Initializes page elements using PageFactory.
     */
    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * WebElement representing the search box on the Etsy homepage.
     */
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    /**
     * WebElement representing the search button on the Etsy homepage.
     */
    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchButton;
}
