Feature: Wiki search features
  Description: This feature describes the functionality related to searching on Wikipedia.

  Scenario: Wikipedia Search Functionality Title Verification
    # Given steps: Preconditions for the scenario
    Given user is on Wikipedia home page
    # This step ensures that the user is on the Wikipedia home page before proceeding.

    # When steps: Actions performed by the user
    When user types "Steve Jobs" in the wiki search box
    # This step describes the action of the user typing "Steve Jobs" in the Wikipedia search box.
    When user clicks wiki search button
    # This step describes the action of the user clicking the Wikipedia search button.

    # Then step: Expected outcome of the scenario
    Then user sees "Steve Jobs" is in the wiki title
    # This step verifies that the title of the Wikipedia search results page contains the term "Steve Jobs".

  Scenario: Wikipedia Search Functionality Header Verification
    # Given steps: Preconditions for the scenario
    Given user is on Wikipedia home page
    # This step ensures that the user is on the Wikipedia home page before proceeding.

    # When steps: Actions performed by the user
    When user types "Steve Jobs" in the wiki search box
    # This step describes the action of the user typing "Steve Jobs" in the Wikipedia search box.
    When user clicks wiki search button
    # This step describes the action of the user clicking the Wikipedia search button.

    # Then step: Expected outcome of the scenario
    Then User sees "Steve Jobs" is in the main header
    # This step verifies that the term "Steve Jobs" is present in the main header of the Wikipedia search results page.

  Scenario: Wikipedia Search Functionality Image Header Verification
     # Given steps: Preconditions for the scenario
    Given user is on Wikipedia home page
    # This step ensures that the user is on the Wikipedia home page before proceeding.

    # When steps: Actions performed by the user
    When user types "Steve Jobs" in the wiki search box
    # This step describes the action of the user typing "Steve Jobs" in the Wikipedia search box.
    When user clicks wiki search button
    # This step describes the action of the user clicking the Wikipedia search button.
    Then user sees "Steve Jobs" is in the image header