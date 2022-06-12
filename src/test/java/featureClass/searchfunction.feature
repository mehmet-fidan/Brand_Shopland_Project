

  Feature: search functionality

    Scenario: Search field control

      Given user is at homepage
      When user enters a text to the search field of header menu
      Then user verify the search result
      Then user enters a text to the search field of buttom leftside
      Then user verify the search result
      And user close the driver