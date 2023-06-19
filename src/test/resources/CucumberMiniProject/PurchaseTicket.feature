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
      | firstLastName | address    | city       | state       | zipCode | cardType | creditCardNumber | expMonth | expYear | nameOnCard    | message                            |
      | Dennisse Font | 123 Villas | Vega Baja  | Puerto Rico |   00693 | Visa     |        123456789 |       11 |    2025 | Dennisse Font | Thank you for your purchase today! |
      | Gebriel Smith | 234 Villas | Vega Alta  | Argentina   |   11111 | Visa     |        223456999 |       12 |    2026 | Gebriel Smith | Thank you for your purchase today! |
      | Omar Vega     | 345 Villas | San Juan   | Guam        |   22222 | Visa     |        323456888 |       01 |    2027 | Omar Vega     | Thank you for your purchase today! |
      | John Figueroa | 456 Villas | Cabo Rojo  | Mexico      |   33333 | Visa     |        423456777 |       05 |    2028 | John Figueroa | Thank you for your purchase today! |
      | Abdul Ford    | 567 Villas | Isla Verde | Polonia     |   44444 | Visa     |        523456666 |       06 |    2029 | Abdul Ford    | Thank you for your purchase today! |
