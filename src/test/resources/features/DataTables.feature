Feature: Cucumber Data Tables implementation practices
  Description: This feature describes practices for implementing Cucumber Data Tables.

  #@dataTable
  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |


  Scenario: List of the animals we love
    Then user should see below list of animals
      | dog    |
      | cat    |
      | fox    |
      | racoon |
      | cow    |
      | wolf   |
      | eagle  |


  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane       |
      | surname | Doe        |
      | age     | 32         |
      | address | somewhere  |
      | state   | AZ         |
      | zipcode | 222222     |
      | phone   | 1234567898 |


  #@dataTable
  Scenario: User should be able to see all 12 months in months dropdown
    Given user is on the dropdowns page of practice tool
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

    @dataTable
  Scenario: Google search testing data table
    Then user should be able to search for following:

      | Java     |
      | Selenium |
      | Cucumber |
      | TestNG   |
      | Maven    |
