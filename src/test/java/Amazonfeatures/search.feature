Feature:  Amazon Search

Scenario: Search a Product
Given I have search field on Amazon  Page
When   I Search Product with name "Apple pro" and price 100
Then  product with name "MacBook Apple pro" is display 

