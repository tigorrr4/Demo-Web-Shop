Feature: Wishlist

  @Wishlist @PositiveCase @Practice
  Scenario: User want to add item to wishlist
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add $100 Physical Gift Card to cart
    And     User input Recipient's Name "Ando"
    When    User click add to wishlist button
    And     User click wishlist button
    Then    User will see their item in wishlist page

  @Wishlist @PositiveCase @Practice
  Scenario: User want remove their wishlist
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add $100 Physical Gift Card to cart
    And     User input Recipient's Name "Ando"
    When    User click add to wishlist button
    And     User click wishlist button
    Then    User will see their item in wishlist page
    And     User click remove on item want their remove
    And     User click update wishlist
    And     User will see their item got remove

  @Wishlist @PositiveCase @Practice
  Scenario: User want too add item from wishlist to cart
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add $100 Physical Gift Card to cart
    And     User input Recipient's Name "Ando"
    When    User click add to wishlist button
    And     User click wishlist button
    Then    User will see their item in wishlist page
    And     User click add to cart on item want their add
    And     User click add to cart on wishlist

  @Wishlist @PositiveCase @Practice
  Scenario: User want send email from wish list
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add $100 Physical Gift Card to cart
    And     User input Recipient's Name "Ando"
    When    User click add to wishlist button
    And     User click wishlist button
    Then    User will see their item in wishlist page
    And     User click add to cart on item want their add
    And     User click email a friend button
    When    User will input friens email with "rolando@gmail.com"
    And     User click send email




