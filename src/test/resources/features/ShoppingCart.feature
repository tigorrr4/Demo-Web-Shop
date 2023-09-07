Feature: ShoppingCart

  @ShoppingCart @PositiveCase
  Scenario: User want to check out item
    Given   User add item in shopping cart
    When    User click shopping cart
    And     User click I agree with the terms of service and I adhere to them unconditionally
    And     User click check out button
    Then    User verify their billing address
    And     User click continue in billing address
    Then    User verify their shipping address
    And     User click continue in shipping address
    And     User click shipping method ground
    When    User click continue in shipping method
    And     User click payment method COD
    And     User click continue in payment method
    Then    User verify their payment information
    And     User click continue in payment information
    And     User verify confirm order
    And     User click continue in confirm order
    Then    User verify successfully order
