Feature: Below test cases are for validate the Create account page.


Scenario: Verify Error message when first name is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page but blank the first name field
And  Click on Create a account button
And  User should wait for getting Screen shot
Then User should get error message for first name field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message when last name is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page but blank the last name field
And  Click on Create a account button
And  User should wait for getting Screen shot
Then User should get error message for last name field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message when Email field is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page but blank the Email field
And  Click on Create a account button
And  User should wait for getting Screen shot
Then User should get error message for Email field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message when Password field is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page but blank the Password field
And  Click on Create a account button
And  User should wait for getting Screen shot
Then User should get error message for Password field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message when Confirm Password field is blank.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page but blank the Confirm Password field
And  Click on Create a account button
And  User should wait for getting Screen shot
Then User should get error message for Confirm Password field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify Error message if user enter password in password and confirm password is not same.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page but mismatch paswword in password and confirm password field
And  Click on Create a account button
And  User should wait for getting Screen shot
Then User should get error message for Confirm Password text field
Then User should get Screen shot
Then Broswser should closed


Scenario: Verify application behaviour when user enter all information in create account field.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a account button
When User files the entire information in Account create page application navigate in my account page
And  Click on Create a account button
And  User should wait for getting Screen shot
#Then User should get Successfull message when all fields are enters in create account page
Then User should get Screen shot
Then Broswser should closed
