Feature: Login User

  @Login @PositiveCase @Practice
  Scenario: User login with valid data
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "tigorthorir@gmail.com" as email and user input "tigor123" as password
    And     User click login button
    Then    User wil see their email on the page

  @Login @NegativeCase @Practice
  Scenario: User login with invalid data
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "tigorthorirgmail.com" as email and user input "tigor123" as password
    And     User click login button
    Then    User wil see error message Please enter a valid email address

  @Login @NegativeCase @Practice
  Scenario: User login with invalid data using unregistered account
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "tigorsumarja@gmail.com" as email and user input "tigor123" as password
    And     User click login button
    Then    User wil see error message Login was unsuccessful Please correct the errors and try again

  @Login @NegativeCase @Practice
  Scenario: User login with empty email
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "" as email and user input "tigor123" as password
    And     User click login button
    Then    User wil see error message Login was unsuccessful Please correct the errors and try again

  @Login @NegativeCase @Practice
  Scenario: User login with empty password
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "tigorthorir@gmail.com" as email and user input "" as password
    And     User click login button
    Then    User wil see error message Login was unsuccessful Please correct the errors and try again

  @Login @NegativeCase @Practice
  Scenario: User login with empty email and empty password
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "" as email and user input "" as password
    And     User click login button
    Then    User wil see error message Login was unsuccessful Please correct the errors and try again

  @Login @PositiveCase @Practice
  Scenario: User login with valid data and click remember me
    Given   User already on demo web shop website
    When    User click log in menu
    And     User input input "tigorthorir@gmail.com" as email and user input "tigor123" as password
    And     User click remember me button
    And     User click login button
    Then    User wil see their email on the page