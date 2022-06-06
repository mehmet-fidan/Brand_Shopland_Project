
Feature: homepage


  Scenario: Login with Valid Information

    Given user is at homepage
    When user clicks login section
    Then user enters username and password
    And user confirms entering account
    And user goes back homepage



