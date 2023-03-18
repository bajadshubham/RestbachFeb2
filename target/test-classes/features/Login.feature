Feature: Application login

Scenario: Home page default login
Given user is on netbanking landing page
When User login into the application with valid username and password
And User click on submit button
Then Home page is populated
And cards are displayed