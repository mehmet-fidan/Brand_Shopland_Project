Feature: filter options


  Scenario: Filtering products
    Given user is at homepage
    When user clicks to alle produkte
    Then user clicks filter button
    And user enter price option
    Then user enter product options
    And user close the driver