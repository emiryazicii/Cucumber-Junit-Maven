Feature: Some of the general functionality verifications

  Scenario: Dropdown options verification
    Given user is already logged in to the WebTable app
    When user is on the Orders page
    Then user sees below options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Payment options verification
    Given user is already logged in to the WebTable app
    When user is on the Orders page
    Then user sees VISA as enabled payment option
    Then user sees MasterCard as enabled payment option
    Then user sees American Express as enabled payment option

  Scenario: Order placement scenario
    Given user is already logged in to the WebTable app
    When user is on the Orders page
    And user enters quantity "2"
    And user clicks to the calculate button
    And user enters customer name "Jane Doe"
    And user enters street "7th Street"
    And user enters city "New York City"
    And user enters state "New York"
    And user enters zip "99999"
    And user selects payment option "American Express"
    And user enters credit card number "1111222233334444"
    And user enters expiration date "12/25"
    And user clicks to process order button
    Then user should see "Jane Doe" in the first row of the web table