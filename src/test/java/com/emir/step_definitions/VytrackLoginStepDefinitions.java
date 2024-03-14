package com.emir.step_definitions;

import com.emir.pages.VytrackDashboardPage;
import com.emir.pages.VytrackLoginPage;
import com.emir.utilities.ConfigurationReader;
import com.emir.utilities.Driver;
import com.emir.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Step definitions class for Vytrack login feature.
 */
public class VytrackLoginStepDefinitions {

    /** Page object for Vytrack Dashboard page. */
    VytrackDashboardPage dashboardPage = new VytrackDashboardPage();

    /** Page object for Vytrack Login page. */
    VytrackLoginPage loginPage = new VytrackLoginPage();

    /** User name retrieved from the Excel file. */
    String userName;

    /** Password retrieved from the Excel file. */
    String password;

    /** First name retrieved from the Excel file. */
    String firstName;

    /** Last name retrieved from the Excel file. */
    String lastName;

    /**
     * Step to navigate to the login page of Vytrack application.
     */
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env.vytrack"));
    }

    /**
     * Step to login to Vytrack application with given credentials.
     * @param sheetName Name of the Excel sheet
     * @param rowNumber Row number from which data needs to be retrieved
     */
    @When("the user login with given credentials from {string} and {int}")
    public void the_user_login_with_given_credentials_from_and(String sheetName, Integer rowNumber) {
        ExcelUtil excelUtil = new ExcelUtil("VyTrackQa2Users.xlsx", sheetName);
        userName = excelUtil.getCellData(rowNumber, 0);
        password = excelUtil.getCellData(rowNumber, 1);
        firstName = excelUtil.getCellData(rowNumber, 2);
        lastName = excelUtil.getCellData(rowNumber, 3);
        loginPage.login(userName, password);
    }

    /**
     * Step to verify that the user is able to log in and see their name on the dashboard.
     */
    @Then("the user should be able to log in and see their name")
    public void the_user_should_be_able_to_log_in_and_see_their_name() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.fullName));
        String actualFullName = dashboardPage.fullName.getText();
        Assert.assertTrue(actualFullName.contains(firstName) && actualFullName.contains(lastName));
    }
}
