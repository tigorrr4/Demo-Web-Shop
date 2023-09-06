Feature: Digital Download

  @DigitalDownloads @PositiveCase
  Scenario: User want to add 3rd Album to cart
    Given   User already login
    When    User click digital downloads on menu
    And     User sort by "Created on"
    And     User sort display "12" perpage
    And     User add 3rd Album to cart
    Then    User will see message The product has been added to your shopping cart