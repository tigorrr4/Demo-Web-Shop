Feature: Electronics

  @Electronics @PositiveCase
  Scenario: User want to add Cell phones to cart
    Given   User already login
    When    User click electronics on menu
    And     User click cell phones
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add Smartphone to cart
    Then    User will see message The product has been added to your shopping cart