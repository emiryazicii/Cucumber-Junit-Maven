Feature: Wiki search features

  Scenario: Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    When user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title