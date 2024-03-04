@regression
Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: For all scenarios user is on the login page of the library application

    # Given step: Preconditions for the scenario
    Given user is on the login page of the application

  @librarian @smoke
  Scenario: Login as librarian

    # When steps: Actions performed by the user
    When user enters librarian username
    And user enters librarian password

    # Then step: Expected outcome of the scenario
    Then user should see the dashboard

  @student @smoke
  Scenario: Login as student

    # When steps: Actions performed by the user
    When user enters student username
    And user enters student password

    # Then step: Expected outcome of the scenario
    Then user should see the dashboard

  @admin @smoke
  Scenario: Login as admin

    # When steps: Actions performed by the user
    When user enters admin username
    And user enters admin password

    # Then step: Expected outcome of the scenario
    Then user should see the dashboard
