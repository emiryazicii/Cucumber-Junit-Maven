@justRunNow
Feature: Etsy Search functionality
  Agile Story: User should be able to type any keyword and see relevant information.

  Scenario: Etsy Title Verification
    Given user is on the Etsy homepage
    Then user should see title is as expected
    #expectedTitle= Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

Scenario: Etsy Search Functionality Title Verification (without parameterization)
  Given user is on the Etsy homepage
  When user types Wooden Spoon in the search box
  And user clicks to Etsy search button
  Then user sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user is on the Etsy homepage
    When user types "Wooden Spoon" in the search box
    And user clicks to Etsy search button
    Then user sees "Wooden spoon" is in the title