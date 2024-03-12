Feature: Some of the general functionality verifications

  Scenario: Dropdown options verification
    Given user is already logged in to the WebTable app
    When user is on the Orders page
    Then user sees below options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |