Feature: login
  Scenario: validate the login
    Given I open the browser and eter url
    When  I enter username and password
    And  I click o the sigin
    Then  I should be able to see homepage

