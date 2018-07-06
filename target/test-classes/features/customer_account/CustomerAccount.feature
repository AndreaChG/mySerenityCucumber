Feature: In order to buy licenses
	As a customer
	I need to create an account

Scenario: Sign up as a new customer
Given the customer is in the nevada home page
When the customer clicks on sign up
And the customer validates his information
Then the customer should be able to fill his information
And the customer should be able to create a new account