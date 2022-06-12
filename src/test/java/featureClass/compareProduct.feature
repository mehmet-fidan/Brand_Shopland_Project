

 Feature: Compare Products

   Scenario: user compares prodcuts

     Given user is at homepage
     Then user clicks to alle produkte
     When user selects first product
     Then user selects second product
     And user checks the products from comparisonlist
     Then user close the driver