

  Feature: Recently Visited Products

    //websitesinin hem manuelinde hem de otomotasyon testinde bazen son tıklanan ürünler çıkmıyor.

    Scenario: Recently Visited Products Categories

      Given user is at homepage
      Then user clicks to alle produkte
      When user clicks a product
      And user clicks to alle produkte
      And user sees at left-side products he-she clicked
      And user clicks to alle produkte
      And user close the driver