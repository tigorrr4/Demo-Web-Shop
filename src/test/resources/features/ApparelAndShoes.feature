Feature: Apparel And Shoes

  @ApparelAndShoes @PositiveCase @Practice
  Scenario: User want to add jeans to cart
    Given   User already login
    When    User click Apparel and Shoes on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add blue jeans to cart
    Then    User will see message The product has been added to your shopping cart

  @ApparelAndShoes @PositiveCase @Practice
  Scenario: User want to add belt to cart
    Given   User already login
    When    User click Apparel and Shoes on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add Casual Golf Belts to cart
    Then    User will see message The product has been added to your shopping cart

  @ApparelAndShoes @PositiveCase @Practice
  Scenario: User want to add 3 stuff to cart
    Given   User already login
    When    User click Apparel and Shoes on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add Leather Handbag,Men's Wrinkle Free Long Sleeve, and Blue and green Sneaker to cart
    Then    User will see message The product has been added to your shopping cart

  @ApparelAndShoes @PositiveCase @Practice
  Scenario: User want to add Blue and green Sneaker to cart
    Given   User already login
    When    User click Apparel and Shoes on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add Blue and green Sneaker to cart
    When    User choose green colour
    And     User click add to cart in Blue and green Sneaker page
    Then    User will see message The product has been added to your shopping cart

  @ApparelAndShoes @PositiveCase @Practice
  Scenario: User want to add 50's Rockabilly Polka Dot Top JR Plus Size to cart
    Given   User already login
    When    User click Apparel and Shoes on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add 50's Rockabilly Polka Dot Top JR Plus Size to cart
    And     User click add to cart in 50's Rockabilly Polka Dot Top JR Plus Size page
    Then    User will see message The product has been added to your shopping cart

