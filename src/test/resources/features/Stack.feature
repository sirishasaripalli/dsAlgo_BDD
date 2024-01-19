Feature: Stack Page Feature

Background:
Given User is logged in to the application


Scenario: Stack Page
Given User is on Home Page
When User Clicks on the Get Started button under Stack Section
Then Stack Page opens up

When User clicks on Operations in Stack button
Then User should be redirected to Operations in Stack page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Stack Page
Given User is on Home Page
When User Clicks on the Get Started button under Stack Section
Then Stack Page opens up

When User clicks on Implementation button
Then User should be redirected to Implementation page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Stack Page
Given User is on Home Page
When User Clicks on the Get Started button under Stack Section
Then Stack Page opens up

When User clicks on Applications button
Then User should be redirected to Applications page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

