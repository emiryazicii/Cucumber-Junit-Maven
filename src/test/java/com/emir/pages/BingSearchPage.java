package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Bing Search page.
 */
public class BingSearchPage {

    /**
     * Constructor to initialize elements of the BingSearchPage class.
     */
    public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * WebElement representing the search box on the Bing search page.
     */
    @FindBy(id = "sb_form_q")
    public WebElement searchBox;
}
