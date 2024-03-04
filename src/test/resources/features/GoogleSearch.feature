Feature: Google search functionality
  Agile story: As a user, when I'm on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
  # When steps: Actions performed by the user
    When user is on the Google search page

  # Then step: Expected outcome of the scenario
    Then user should see title is Google

    @wip_emir
  Scenario: Search result title verification
    # Given steps: Preconditions for the scenario
    Given user is on the Google search page
    # When steps: Actions performed by the user
    When user searches for apple
    # Then step: Expected outcome of the scenario
    Then user should see apple in the title