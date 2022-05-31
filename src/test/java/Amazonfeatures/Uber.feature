Feature: Uber Booking Feature

Scenario: Booking Cab
Given User want to select a car type "sedan" from uber app
When User select a car "sedan" abd pickup point "Banglore" and drop location "Pune"
Then Driver start journy 
And Driver ends journy
Then User pay 100 USD