package com.emir.step_definitions;

import com.emir.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Step definitions class for the library application login feature.
 */
public class Library_StepDefinitions {

    /**
     * Step definition for navigating to the login page of the application.
     */
    @Given("user is on the login page of the application")
    public void user_is_on_the_login_page_of_the_application() {
        // Print message indicating that the user is on the login page
        System.out.println("User is on the login page of the application.");
    }

    /**
     * Step definition for entering librarian username.
     */
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Print message indicating that the user enters the librarian username
        System.out.println("User enters librarian username.");
    }

    /**
     * Step definition for entering librarian password.
     */
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        // Print message indicating that the user enters the librarian password
        System.out.println("User enters librarian password.");
    }

    /**
     * Step definition for verifying the dashboard after successful login.
     */
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Print message indicating that the user should see the dashboard
        System.out.println("User should see the dashboard.");
        // Close the driver instance
        Driver.closeDriver();
    }

    /**
     * Step definition for entering student username.
     */
    @When("user enters student username")
    public void userEntersStudentUsername() {
        // Print message indicating that the user enters the student username
        System.out.println("User enters student username.");
    }

    /**
     * Step definition for entering student password.
     */
    @And("user enters student password")
    public void userEntersStudentPassword() {
        // Print message indicating that the user enters the student password
        System.out.println("User enters student password.");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        // Print message indicating that the user enters the admin username
        System.out.println("User enters admin username.");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {

        // Print message indicating that the user enters the admin password
        System.out.println("User enters admin password.");
    }
}
