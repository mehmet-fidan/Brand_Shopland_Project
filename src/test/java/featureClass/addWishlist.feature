
Feature: Wishlist

  Scenario: Add product to wishlist

    Given user is at homepage
    When user clicks login section
    Then user enters username and password
    Then user clicks to alle produkte
    Then user adds products to wish list
    Then user clicks to wunschlist button
    Then user checks products name
    Then user deletes added products from wishlist and verify it
   # And user close the driver



