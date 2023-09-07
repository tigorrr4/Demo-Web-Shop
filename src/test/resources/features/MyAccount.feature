Feature: My Account

  @MyAccount @PositiveCase @Practice
  Scenario: User want to edit their info
    Given   User already login
    When    User click their email at menu page
    And     User click customer info
    And     User Update first name and input "Tigor"
    And     User Update last name and input "Thorir"
    When    User click save button
    Then    User account will update

    @MyAccount @PositiveCase @Practice
  Scenario: User want to edit their password
    Given   User already login
    When    User click their email at menu page
    And     User click change password
    And     User Update old password and input "tigor123"
    And     User Update new password and input "tigor123"
    And     User Update confirm password and input "tigor123"
    When    User click change password button
    Then    User account will update

  @MyAccount @PositiveCase @Practice
  Scenario: User want to update their profile
    Given   User already login
    When    User click their email at menu page
    And     User click edit
    And     User click Addresses
    And     User input "Tigor" as first name, input "Thorir" as last name, input "tigorthorir@gmail.com" as email, input "Tigor Company" as company, input "Bogor" as city, input "Jl.Lawak" as address, input "16666" as zip code, and input "0812121212" as phone number
    When    User click save Button
    Then    User account will update