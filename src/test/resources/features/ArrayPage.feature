Feature: Array Page Feature

Background:
Given User is logged in to the application

@tag1
Scenario: Array Page Arrays in Python
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on "Arrays in Python" button
Then User should be redirected to "Arrays in Python" page

When User gets Array Section
|Arrays in Python|
|Arrays Using List|
|Basic Operations in Lists|
|Applications of Array|
|Practice Questions|
And Array Section count should be 5

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console


Scenario: Array Page Basic Operations in Lists page
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Basic Operations in Lists button
Then User should be redirected to Basic Operations in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console


Scenario: Array Page Applications of Array page
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Applications of Array button
Then User should be redirected to Applications of Array page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console


Scenario: Array Page Arrays Using List page
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Arrays Using List button
Then User should be redirected to Arrays Using List page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Array Page - Arrays In Python -  Practice Questions in Lists button - Search the array Link
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Practice Questions in Lists button
Then User should be redirected to Practice Questions in Lists page

When User clicks on Search the array Link
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And  Clicks on the Run button
Then Result is displayed on the console
And  Clicks on the submit button
Then error message is displayed on the console


Scenario: Array Page - Arrays In Python - Practice Questions in Lists button - Max Consecutive Ones Link
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Practice Questions in Lists button
Then User should be redirected to Practice Questions in Lists page

When User clicks on Max Consecutive Ones Link
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And  Clicks on the Run button
Then Result is displayed on the console
And User refresh the page
And User enters the text in the TextBox "print(Hello)"
And  Clicks on the submit button
Then error message is displayed on the console


Scenario: Array Page - Arrays In Python - Practice Questions in Lists button - Find Numbers with Even Number of Digits Link
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Practice Questions in Lists button
Then User should be redirected to Practice Questions in Lists page

When User clicks on Find Numbers with Even Number of Digits Link
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And  Clicks on the Run button
Then Result is displayed on the console
And  Clicks on the submit button
Then error message is displayed on the console


Scenario: Array Page - Arrays In Python - Practice Questions in Lists button - Squares of  a Sorted Array Link
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up

When User clicks on Practice Questions in Lists button
Then User should be redirected to Practice Questions in Lists page

When User clicks on Squares of  a Sorted Array Link
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And  Clicks on the Run button
Then Result is displayed on the console
And  Clicks on the submit button
Then error message is displayed on the console






