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

  #@orderPlacement
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

    @orderPlacement
  Scenario Outline: Order placement scenario
    Given user is already logged in to the WebTable app
    When user is on the Orders page
    And user enters quantity "<quantity>"
    And user clicks to the calculate button
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user selects payment option "<paymentType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples:

      | quantity | customerName   | street | city          | state | zip   | paymentType      | cardNumber       | expDate | expectedName   |
      | 3        | John Doe       | 7th st | New York City | NY    | 99999 | VISA             | 1111222233334444 | 12/25   | John Doe       |
      | 5        | Mike Parker    | 6th st | Pittsburgh    | PA    | 88888 | American Express | 2222333344445555 | 8/24    | Mike Parker    |
      | 4        | Tony Harper    | 5th st | Phoenix       | AZ    | 77777 | Master Card      | 3333444455556666 | 6/26    | Tony Harper    |
      | 1        | Alison McKenny | 4th st | San Diego     | CA    | 66666 | VISA             | 4444555566667777 | 3/28    | Alison McKenny |
      | 2        | Gina Morgan    | 3rd st | Seattle       | WA    | 55555 | American Express | 5555666677778888 | 2/27    | Gina Morgan    |