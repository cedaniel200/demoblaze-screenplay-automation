Feature: Purchase
  As a registered user
  I want to add products
  To make a purchase

  Scenario: Purchase products from the shopping cart successfully
    Given Juan is authenticated
    And add from Laptops a MacBook air
    And add from Monitors an Apple monitor 24
    When Juan makes the purchase
    Then should see the message Thank you for your purchase