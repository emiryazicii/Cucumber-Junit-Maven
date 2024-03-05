Feature: Cucumber Data Tables implementation practices
  Description: This feature describes practices for implementing Cucumber Data Tables.

  @dataTable
  Scenario: List of fruits and vegetables I like
    # Then step: Expected outcome of the scenario
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |
    # This step verifies that the user should see the provided list of fruits and vegetables.

  Scenario: List of the animals we love
    # Then step: Expected outcome of the scenario
    Then user should see below list of animals
      | dog    |
      | cat    |
      | fox    |
      | racoon |
      | cow    |
      | wolf   |
      | eagle  |
    # This step verifies that the user should see the provided list of animals.

  Scenario: Officer reads data about driver
    # Then step: Expected outcome of the scenario
    Then officer is able to see any data he wants
      | name    | Jane       |
      | surname | Doe        |
      | age     | 32         |
      | address | somewhere  |
      | state   | AZ         |
      | zipcode | 222222     |
      | phone   | 1234567898 |
   #Verifying that the officer can see the provided data about the driver.

  Scenario: User should be able to see all 12 months in months dropdown
    # Given step: Preconditions for the scenario
    Given user is on the dropdowns page of practice tool
    # Then step: Expected outcome of the scenario
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
    # This step verifies that the user should be able to see all 12 months in the month dropdown.

