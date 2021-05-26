Feature: Etsy search feature



  Scenario: Etsy default title verification
    Given user is on Etsy landing page
    Then user should see Etsy title as expected

   #expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


  Scenario: Etsy Search Functionality Title Verification
  Given user is on Etsy landing page
    When user types word in the search box
    And user click search button
    Then user seed word in the title

@1
  Scenario:  Etsy Search Functionality Title Verification with parameter
    Given user is on Etsy landing page
    When user types "Wooden spoon" in the search box
    And user click search button
    Then user seed "Wooden spoon" in the title
