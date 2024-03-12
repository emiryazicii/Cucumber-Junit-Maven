package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    /**
     * WebElement representing the input field for quantity.
     */
    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    /**
     * WebElement representing the button to calculate the order.
     */
    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    /**
     * WebElement representing the input field for customer name.
     */
    @FindBy(name = "name")
    public WebElement customerNameBox;

    /**
     * WebElement representing the input field for street address.
     */
    @FindBy(name = "street")
    public WebElement streetBox;

    /**
     * WebElement representing the input field for city.
     */
    @FindBy(name = "city")
    public WebElement cityBox;

    /**
     * WebElement representing the input field for state.
     */
    @FindBy(name = "state")
    public WebElement stateBox;

    /**
     * WebElement representing the input field for zip code.
     */
    @FindBy(name = "zip")
    public WebElement zipBox;

    /**
     * WebElement representing the input field for card number.
     */
    @FindBy(name = "cardNo")
    public WebElement cardNoBox;

    /**
     * WebElement representing the input field for card expiry date.
     */
    @FindBy(name = "cardExp")
    public WebElement expiryDateBox;

    /**
     * WebElement representing the button to process the order.
     */
    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    /**
     * List of WebElements representing the card types on the order page.
     */
    @FindBy(name = "card")
    public List<WebElement> cardTypes;

}
