package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page class representing the order page of the web application with a web table.
 * Extends the WebTableBasePage class.
 */
public class WebTableOrderPage extends WebTableBasePage {

    /**
     * Constructor to initialize the page elements using PageFactory.
     * It initializes the page elements using the driver instance.
     */
    public WebTableOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * WebElement representing the product dropdown on the order page.
     */
    @FindBy(name = "product")
    public WebElement productDropdown;

    /**
     * WebElement representing the Visa radio button on the order page.
     */
    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    /**
     * WebElement representing the MasterCard radio button on the order page.
     */
    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioButton;

    /**
     * WebElement representing the American Express radio button on the order page.
     */
    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioButton;
}
