Feature: Computers

  @Computers @PositiveCase @Practice
  Scenario: User want to add laptop to cart
    Given   User already login
    When    User click Electronics on menu
    And     User click notebooks
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add 14 inch Laptop to cart
    Then    User will see message The product has been added to your shopping cart

  @Computers @PositiveCase @Practice
  Scenario: User want to add Accessories to cart
    Given   User already login
    When    User click Electronics on menu
    And     User click Accessories
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add TCP Self-Paced Training additional month and TCP Instructor Led Training to cart
    Then    User will see message The product has been added to your shopping cart

  @Computers @PositiveCase @Practice
  Scenario: User want to add Desktops to cart
    Given   User already login
    When    User click Electronics on menu
    And     User click Desktops
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User click filter by price over 1200
    And     User add Build your own expensive computer cart
    When    User input their spec computer
    And     User click add to cart
    Then    User will see message The product has been added to your shopping cart

