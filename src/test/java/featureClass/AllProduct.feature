Feature: All Products

  Scenario: All products pictures and pirces

    Given user is at homepage
    When user clicks to alle produkte
    Then user checks pictures and prices
    Then user clicks left kategorie
    Then user clicks rightside order option
    And user close the driver