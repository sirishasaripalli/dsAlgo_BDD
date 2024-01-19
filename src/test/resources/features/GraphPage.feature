Feature: Graph Page Feature

Background:
Given User is logged in to the application


Scenario: Graph Page
Given User is on Home Page
When User Clicks on the Get Started button under Graph Section
Then Graph Page opens up

When User clicks on Graph in Graph page
Then User should be redirected to Graph in Graph page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Graph Page  Graph Representations in Graph page
Given User is on Home Page
When User Clicks on the Get Started button under Graph Section
Then Graph Page opens up

When User clicks on Graph Representations in Graph page
Then User should be redirected to Graph Representations in Graph page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console