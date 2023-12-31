Feature: Gift Cards

  @GiftCards @PositiveCase @Practice
  Scenario: User want to add $100 Physical Gift Cards to cart
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add $100 Physical Gift Card to cart
    When    User input Recipient's Name "Ando"
    And     User click add to cart
    Then    User will see message The product has been added to your shopping cart

  @GiftCards @PositiveCase @Practice
  Scenario: User want to add $50 Physical Gift Cards to cart
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add $50 Physicall Gift Card to cart
    When    User input Recipient's Name "Ando"
    And     User click add to cart
    Then    User will see message The product has been added to your shopping cart

  @GiftCards @PositiveCase @Practice
  Scenario: User want to add $50 Physical Gift Cards to cart
    Given   User already login
    When    User click gift cards on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User addd $25 Physical Gift Card to cart
    When    User input Recipient's Name "Ando"
    And     User click add to cart
    Then    User will see message The product has been added to your shopping cart