Feature: Login User

  @Books @PositiveCase @Practice
  Scenario: User want to add book to cart
    Given   User already login
    When    User click books on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price under 25
    And     User add fiction book to cart
    Then    User will see message The product has been added to your shopping cart

  @Books @PositiveCase @Practice
  Scenario: User want to add book to cart
    Given   User already login
    When    User click books on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price under 25
    And     User add Health Book to cart
    Then    User will see message The product has been added to your shopping cart

  @Books @PositiveCase @Practice
  Scenario: User want to add book to cart
    Given   User already login
    When    User click books on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price under 25
    And     User add Computing and Internet to cart
    Then    User will see message The product has been added to your shopping cart


