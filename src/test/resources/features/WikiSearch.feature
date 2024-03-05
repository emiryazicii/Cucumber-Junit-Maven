@wiki
Feature: Wiki search features
  Description: This feature describes the functionality related to searching on Wikipedia.

  Scenario: Wikipedia Search Functionality Title Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    When user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    When user clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    When user clicks wiki search button
    Then user sees "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality with Scenario Outline
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    When user clicks wiki search button
    Then user sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header
    Then user sees "<expectedImageHeader>" is in the image header

    @ceos
    Examples: Search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Marry Barra     | Marry Barra     | Marry Barra        | Marry Barra         |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples:
      | Marie Curie     | Marie Curie     | Marie Curie     | Marie Curie     |
      | Albert Einstein | Albert Einstein | Albert Einstein | Albert Einstein |


