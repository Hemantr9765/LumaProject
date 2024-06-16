Feature: Below test cases are for validate the Sign in page.


Scenario: Verify Error message when email field is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in page but blank the email field
And  Click on Sign in button
And  User should wait for getting Screen shot
Then User should get error message for email field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message when password field is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in  page but blank the password field
And  Click on Sign in button
And  User should wait for getting Screen shot
Then User should get error message for password field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message when email & password field is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in page but blank the email & password field
And  Click on Sign in button
And  User should wait for getting Screen shot
Then User should get error message for email & password field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify application behaviour when user enter correct email and password
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in page 
And  Click on Sign in button
And  User should wait for getting Screen shot
Then Application should navigate to home page
Then User should get Screen shot
Then Broswser should closed


