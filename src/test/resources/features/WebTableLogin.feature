Feature: Web table app login functionality
  Agile story: User should be able to login with correct credentials

  Scenario: Positive login scenario
    Given user is on the WebTable app login page
    When user enters correct username
    And user enters correct password
    And user clicks to login button
    Then user should see orders word in the URL

  Scenario: Positive login scenario
    Given user is on the WebTable app login page
    When user enters "Test" username
    And user enters "Tester" password
    And user clicks to login button
    Then user should see orders word in the URL

  Scenario: Positive login scenario
    Given user is on the WebTable app login page
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    And user clicks to login button
    Then user should see orders word in the URL
