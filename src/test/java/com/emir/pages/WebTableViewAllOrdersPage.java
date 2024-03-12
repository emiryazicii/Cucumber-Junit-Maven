package com.emir.pages;

import com.emir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page class representing the All Orders page of the web application with a web table.
 */
public class WebTableViewAllOrdersPage {

    /**
     * Constructor to initialize the page elements using PageFactory.
     * It initializes the page elements using the driver instance.
     */
    public WebTableViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * WebElement representing the cell containing information about a new customer
     * in the first row of the table on the All Orders page.
     */
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;
}
