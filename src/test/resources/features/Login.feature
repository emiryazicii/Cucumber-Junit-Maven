@regression
Feature: Library login feature

  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  Scenario: Login as librarian
    # Given step: Preconditions for the scenario
    Given user is on the login page of the application

    # When steps: Actions performed by the user
    When user enters librarian username
    And user enters librarian password

    # Then step: Expected outcome of the scenario
    Then user should see the dashboard

  Scenario: Login as student
    # Given step: Preconditions for the scenario
    Given user is on the login page of the application

    # When steps: Actions performed by the user
    When user enters student username
    And user enters student password

    # Then step: Expected outcome of the scenario
    Then user should see the dashboard

  Scenario: Login as admin
    # Given step: Preconditions for the scenario
    Given user is on the login page of the application

    # When steps: Actions performed by the user
    When user enters admin username
    And user enters admin password

    # Then step: Expected outcome of the scenario
    Then user should see the dashboard
