Feature: Customers

Scenario: Add a new Customer
Given User Launch Chrome browser
When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then User enter Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then User can View Dashboard
When User click customer menue
And Click customer menue item
And Click on Add new button
Then User can view add new customer page
When User enter customer info
And Click on save button
Then User can view conformation message "The new customer has been added successfully"
And Close The Browser

Scenario: Search Customer By Emailid
Given User Launch Chrome browser
When User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then User enter Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then User can View Dashboard
When User click customer menue
And Click customer menue item
And Enter customer Email
When lick on Search button
Then User found email in search table
And Close The Browser


