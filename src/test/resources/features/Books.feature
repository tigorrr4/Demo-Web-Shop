Feature: Login User

  @Books @PositiveCase
  Scenario: User want to add book to cart
    Given   User already login
    When    User click books on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price under 25
    And     User add fiction book to cart
    Then    User will see message The product has been added to your shopping cart


  @Books @PositiveCase
    #BUGS DONT HAVE ADD TO CART BUTTON
  Scenario: User want to add book to cart
    Given   User already login
    When    User click books on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price under 25
    And     User add Copy of Computing and Internet EX book to cart
    Then    User will see message The product has been added to your shopping cart
