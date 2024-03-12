Feature: Google search functionality with Scenario Outline
  User Story: As a user, when I'm on the google page
  I should be able to search whatever I want and see relevant information.

  @scenarioOutline
  Scenario Outline: Google search testing with Scenario Outline
    Given user is on the Google search page
    When user searches for "<country>" capital
    Then user should see "<capital>" in the result

    Examples:
      | country  | capital |
      | Colombia | Bogotá  |
      | Turkey | Ankara  |
      | Ukraine | Kyiv  |
      | France | Paris  |
