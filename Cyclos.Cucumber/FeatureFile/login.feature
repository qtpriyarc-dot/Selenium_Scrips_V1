@smoke
Feature: Testing Cyclos login funcitonality 
@sample
Scenario: Verify the user is able to login 
Given the user is on login page
When click on the loginlink
And the user enters a valid username and password
And click on submit button
Then verify the logout link