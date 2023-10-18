
Feature: As a user I should be able to access the home page


  Scenario: US_01 The user is on the Home page
    Given the user goes to the Northvolt Page
    Then the user verifies that the url is "https://northvolt.com/"
    Then the user verifies the title "Why Northvolt"
