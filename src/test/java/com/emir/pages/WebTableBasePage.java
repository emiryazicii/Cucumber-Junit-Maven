package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Base page class for the web application with a web table.
 * Contains common elements and functionalities shared across multiple pages.
 */
public class WebTableBasePage {

    /**
     * Constructor to initialize the page elements using PageFactory.
     * It initializes the page elements using the driver instance.
     */
    public WebTableBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * WebElement representing the "View all orders" link.
     */
    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrdersLink;

    /**
     * WebElement representing the "View all products" link.
     */
    @FindBy(xpath = "//button[.='View all products']")
    public WebElement viewAllProductsLink;

    /**
     * WebElement representing the "Order" link.
     */
    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderLink;

    /**
     * WebElement representing the "Logout" link.
     */
    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutLink;
}
