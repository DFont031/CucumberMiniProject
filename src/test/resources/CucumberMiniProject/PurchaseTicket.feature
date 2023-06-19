Feature: Purchase Ticket Page Functionality

  Scenario Outline: Verify User able to Purchase Ticket
    Given User navigates to Register Page "https://blazedemo.com/purchase.php"
    When User enters First Name and Last Name "<firstLastName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User enters Zip Code "<zipCode>"
    And User selects Card Type "<cardType>"
    And User enters Credit Card Number "<creditCardNumber>"
    And User enters Card Expiration Month "<expMonth>"
    And enters Card Expiration Year "<expYear>"
    And User enters Name on Card "<nameOnCard>"
    And User selects Remember Me Checkbox "<rememberCheckBox>"
    And User clicks Purchase Flight button
    Then User Verifies Success Message "<message>"

    Examples: 
      | firstLastName | address    | city      | state       | zipCode | cardType | creditCardNumber | expMonth | expYear | nameOnCard    | message                            |
      | Dennisse Font | 123 Villas | Vega Baja | Puerto Rico |   00693 | Visa     |        123456789 |       11 |    2025 | Dennisse Font | Thank you for your purchase today! |
