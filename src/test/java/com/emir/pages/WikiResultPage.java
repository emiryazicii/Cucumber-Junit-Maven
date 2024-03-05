package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Wikipedia Search Results page.
 */
public class WikiResultPage {

    /**
     * Constructor to initialize elements of the WikiResultPage class.
     */
    public WikiResultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * WebElement representing the main header on the Wikipedia search results page.
     */
    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement mainHeader;

    /**
     * WebElement representing the image header on the Wikipedia search results page.
     */
    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;
}
