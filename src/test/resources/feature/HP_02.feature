Feature: As a user I should go to career and cannot apply jobs without loading CV

  @career
  Scenario: Go to career page and apply a specific job
    Given user goes to "Northvolt Page"
    And user clicks on career
    And user clicks on Joining Us button
    Then user verifies "Find your challenge" is visible
    And user clicks on Find your challenge button
    And user verifies "Available roles" text visible
    And user clicks on Software & IT and Skellefteå checkboxes
    And user writes Software Engineer in Search inbox
    And user applies first job
    And user sees I'm interested text
    And user clicks on I'm interested button
    And user enters "<firstName>" "<lastName>" "<email>" "<phone>"

      | firstName | lastName | email                       | phone     |
      | Neva      | Kayabasi | nevasevgikayabasi@gmail.com | 729364851 |

    And user chooses an open to relocate radio button
    And user writes in the Currently based inbox
    And user clicks on any Have you ever worked in an Industrial Environment with Software? buttons
    And user writes anything in Which detail made you the most excited about the job ad? inbox
    And user chooses an How did you hear about Northvolt? option
    And user chooses a gender
    And user clicks on confirm checkbox
    Then user clicks on submit button




