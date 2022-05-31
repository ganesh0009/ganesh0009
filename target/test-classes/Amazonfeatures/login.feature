Feature: Login

Scenario: Successful Login with Valid Credatial
Given User Launch Chrome browser
When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then User enter Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then Page Tiltle Should be "Dashboard / nopCommerce administration"
When User Click on Log Out link
Then Page Should be "Admin area demo"
And Close The Browser

Scenario Outline: Login Data Driven
Given User Launch Chrome browser
When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then User enter Email as "<emails>" and Password as "<password>"
And Click on Login
Then Page Tiltle Should be "Dashboard / nopCommerce administration"
When User Click on Log Out link
Then Page Should be "Admin area demo"
And Close The Browser

 Examples:
 |emails | password|
 |admin@yourstore.com  | admin |
 |admin@yourstore.com  | admin123 | 