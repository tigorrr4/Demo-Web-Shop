Feature: Register new user

  @Register @PositiveCase @Practice
  Scenario: User do register new account with valid data
  Given   User already on demo web shop website
  When    User click register menu
  And     User click male gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "tigorthorir@gmail.com" as email
  And     User input "tigor123" as password, and input "tigor123" as confirm password
  And     User click register button
  Then    User wil see registration completed

  @Register @NegativeCase @Practice
  Scenario: User do register new account with email has been registered
  Given   User already on demo web shop website
  When    User click register menu
  And     User click male gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "tigorthorir@gmail.com" as email
  And     User input "tigor123" as password, and input "tigor123" as confirm password
  And     User click register button
  Then    User wil see message the specified email already exists

  @Register @NegativeCase @Practice
  Scenario: User do register new account with invalid data
    Given   User already on demo web shop website
    When    User click register menu
    And     User click male gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "tigorthorir$%#gmail.com" as email
    And     User input "tigor123" as password, and input "tigor123" as confirm password
    And     User click register button
    Then    User wil see error message
    And     User will stay at register page

  @Register @NegativeCase @Practice
  Scenario: User do register new account with empty firstname data
    Given   User already on demo web shop website
    When    User click register menu
    And     User click male gender and input "" as Firstname, input "Thorir" as Lastname, input "tigorthorir@gmail.com" as email
    And     User input "tigor123" as password, and input "tigor123" as confirm password
    And     User click register button
    Then    User wil see error message First name is required
    And     User will stay at register page

  @Register @NegativeCase @Practice
  Scenario: User do register new account with empty Lastname data
    Given   User already on demo web shop website
    When    User click register menu
    And     User click male gender and input "Tigor" as Firstname, input "" as Lastname, input "tigorthorir@gmail.com" as email
    And     User input "tigor123" as password, and input "tigor123" as confirm password
    And     User click register button
    Then    User wil see error message Last name is required
    And     User will stay at register page

  @Register @NegativeCase @Practice
  Scenario: User do register new account with empty Lastname data
    Given   User already on demo web shop website
    When    User click register menu
    And     User click male gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "" as email
    And     User input "tigor123" as password, and input "tigor123" as confirm password
    And     User click register button
    Then    User wil see error message Email is required
    And     User will stay at register page

  @Register @NegativeCase @Practice
  Scenario Outline: User do register new account with incomplete password
    Given   User already on demo web shop website
    When    User click register menu
    And     User click male gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "tigorthorir@gmail.com" as email
    And     User input "<Password>" as password, and input "<ConfirmPassword>" as confirm password
    And     User click register button
    Then    User wil see error message Password is required
    And     User will stay at register page
    Examples:
      | Password | ConfirmPassword |
      | tigor123 |                 |
      |          | tigor123        |

  @Register @NegativeCase @Practice
  Scenario Outline: User do register new account with below minimum password
    Given   User already on demo web shop website
    When    User click register menu
    And     User click male gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "tigorthorir@gmail.com" as email
    And     User input "<Password>" as password, and input "<ConfirmPassword>" as confirm password
    And     User click register button
    Then    User wil see error message The password should have at least 6 characters.
    And     User will stay at register page
    Examples:
      | Password | ConfirmPassword |
      | tigor    |                 |

