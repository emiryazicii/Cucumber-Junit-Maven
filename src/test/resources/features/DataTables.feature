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