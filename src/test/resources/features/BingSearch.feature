# This feature describes the behavior of the Bing search functionality.
Feature: Bing search functionality
  Agile story: As a user , when I'm on the Bing search page
  I should be able to search anything and see relevant results.

  #@wip_emir
  Scenario: Search result title verification
    # Given steps: Preconditions for the scenario
    Given user is on the Bing search page
    # This step ensures that the user is on the Bing search page before proceeding.

    # When steps: Actions performed by the user
    When user searches for orange in Bing search box
    # This step describes the action of the user searching for the term "orange" in the Bing search box.

    # Then steps: Expected outcome of the scenario
    Then user should see orange in title
    # This step verifies that the title of the search results page contains the term "orange".

  @wip_emir
  Scenario: Search result title verification
    # Given steps: Preconditions for the scenario
    Given user is on the Bing search page
    # This step ensures that the user is on the Bing search page before proceeding.

    # When steps: Actions performed by the user
    When user searches for "orange" in Bing search box
    # This step describes the action of the user searching for the term "orange" in the Bing search box.

    # Then steps: Expected outcome of the scenario
    Then user should see "orange" in title
    # This step verifies that the title of the search results page contains the term "orange".