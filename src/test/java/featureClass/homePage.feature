
Feature: homepage

  Scenario: go to homepage and login

    Given user is at homepage
    When does all products have picture


    Scenario: Login with Valid Information

      Given user is at homepage
      When user clicks login section
      Then user enters username and password
      And user confirms entering account

