Feature: Bing search functionality
  Agile story: As a user , when I'm on the Bing search page
  I should be able to search anything and see relevant results.

  #@wip_emir
  Scenario: Search result title verification
    Given user is on the Bing search page
    When user searches for orange in Bing search box
    Then user should see orange in title

  @wip_emir
  Scenario: Search result title verification
    Given user is on the Bing search page
    When user searches for "orange" in Bing search box
    Then user should see "orange - Search" in title
