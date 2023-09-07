Feature: Jewelry

  @Jewelry @PositiveCase @Practice
  Scenario: User want to add Black & White Diamond Heart
    Given   User already login
    When    User click jewelry on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price under "0-500"
    And     User add Black & White Diamond Heart to cart
    Then    User will see message The product has been added to your shopping cart





