Feature: My Account

#  @MyAccount @PositiveCase
#  Scenario: User want to edit their info
#    Given   User already login
#    When    User click their email at menu page
#    And     User click customer info
#    And     User Update first name and input "Tigor"
#    And     User Update last name and input "Thorir"
#    When    User click save button
#    Then    User account will update

  @MyAccount @PositiveCase
  Scenario: User want to update their password
    Given   User already login
    When    User click their email at menu page
    And     User click change password
    And     User Update old password and input "tigor123"
    And     User Update new password and input "tigor123"
    And     User Update confirm password and input "tigor123"
    When    User click change password button
    Then    User account will update