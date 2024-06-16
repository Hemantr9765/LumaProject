Feature: Below test cases are for validate the Create account page.



#Scenario: Verify application behaviour when user enter correct email and password
#Given Chrome Broser open
#And  Browser should Maximize
#And  Application url should enter and application should open
#And  User should click on Create a sign in button
#When User files the entire information in Sign in page 
#And  Click on Sign in button
#And  User should wait for getting Screen shot
#Then Application should navigate to home page
#Then User should get Screen shot
#Then Broswser should closed

Scenario: Verify that the cart icon updates when user click on add to cart button with the item count.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in page 
And  Click on Sign in button
Then Application should navigate to home page
And  User should click on men category
And  User should click on Jacket category
And  User should click on product image
And  User should select size,colur and quntity
And  Click on Add to cart button on product page
Then User should get Screen shot
Then Broswser should closed



Scenario: Verify Error message when user not selected Size.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in page 
And  Click on Sign in button
Then Application should navigate to home page
And  User should click on men category
And  User should click on Jacket category
And  User should wait for getting Screen shot
#And  User should click on hidden button
And  User should click on product image
And  User should select colur and quntity but not select size
And  Click on Add to cart button on product page
Then User should get error message for size field
Then User should get Screen shot
Then Broswser should closed



Scenario: Verify Error message when user not selected Colour.
Given Chrome Broser open
And  Browser should Maximize
And  Application url should enter and application should open
And  User should click on Create a sign in button
When User files the entire information in Sign in page 
And  Click on Sign in button
Then Application should navigate to home page
And  User should click on men category
And  User should click on Jacket category
And  User should wait for getting Screen shot
#And  User should click on hidden button
And  User should click on product image
And  User should select size and quntity but not select colour
And  Click on Add to cart button on product page
Then User should get error message for colour field
Then User should get Screen shot
Then Broswser should closed
 
 