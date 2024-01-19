Feature: DataStructure Page Feature


Background:
Given User is logged in to the application


Scenario: DataStructure Page
  Given User is on Home Page
  When user clicks on datatructure  get started
  Then it should go to data structure home page 
  
  When user click Time Complexity button 
  Then it should go to data structure time-complexity page
  
  When User clicks on Try Here button
  Then User should be redirected to next page

  When User enters the text in the TextBox "print(Hello)"
  And Clicks on the Run button
  Then Result is displayed on the console
