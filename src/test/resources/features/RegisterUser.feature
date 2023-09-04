Feature: Register new user

  @Register @PositiveCase
  Scenario: User do register new account with valid  data
  Given   User already on demo web shop website
  When    User click register menu
  And     User click gender and input "Tigor" as Firstname, input "Thorir" as Lastname, input "tigorthorir@gmail.com" as email
  And     User input "tigor123" as password, and input "tigor123" as confirm password
  And     User click register button
  Then    User wil see registration completed