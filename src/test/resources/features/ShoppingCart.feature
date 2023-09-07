Feature: ShoppingCart

  @ShoppingCart @PositiveCase @Practice
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

  @ShoppingCart @PositiveCase @Practice
  Scenario: User want to check out item with next day shipping method and payment method using check
    Given   User add item in shopping cart
    When    User click shopping cart
    And     User click I agree with the terms of service and I adhere to them unconditionally
    And     User click check out button
    Then    User verify their billing address
    And     User click continue in billing address
    Then    User verify their shipping address
    And     User click continue in shipping address
    And     User click shipping method next day
    When    User click continue in shipping method
    And     User click payment method using check
    And     User click continue in payment method
    Then    User verify their payment information
    And     User click continue in payment information
    And     User verify confirm order
    And     User click continue in confirm order
    Then    User verify successfully order

  @ShoppingCart @PositiveCase @Practice
  Scenario: User want to check out item with next 2nd day shipping method and payment method using credit
    Given   User add item in shopping cart
    When    User click shopping cart
    And     User click I agree with the terms of service and I adhere to them unconditionally
    And     User click check out button
    Then    User verify their billing address
    And     User click continue in billing address
    Then    User verify their shipping address
    And     User click continue in shipping address
    And     User click shipping method 2nd next day
    When    User click continue in shipping method
    And     User click payment method using credit
    And     User click continue in payment method
    And     User select "Visa" as credit card and input "Tigor" as cardholder name, and input "374245455400126" as card number and select "05" as exp month, and select "2025" as exp year, and input "4521" as card code
    Then    User verify their payment information
    And     User click continue in payment information
    And     User verify confirm order
    And     User click continue in confirm order
    Then    User verify successfully order
