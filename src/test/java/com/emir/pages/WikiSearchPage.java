package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Wikipedia Search page.
 */
public class WikiSearchPage {

    /**
     * Constructor to initialize elements of the WikiSearchPage class.
     */
    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * WebElement representing the search box on the Wikipedia search page.
     */
    @FindBy(id = "searchInput")
    public WebElement searchBox;

    /**
     * WebElement representing the search button on the Wikipedia search page.
     */
    @FindBy(xpath ="//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;
}
