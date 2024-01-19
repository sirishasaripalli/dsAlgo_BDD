Feature: linked list feature

  Background: 
    Given User is logged in to the application


  Scenario: Linked list page
    Given user is on home page
    When user clicks on the get started button Linkedlist section
    Then linked list opens up
   
    Given User is on linklistPage
    When User clicks on "Introduction" button
    Then User should be redircted to "Introduction" page
    When User gets linked list Section
      | Introduction         |
      | Creating linked list |
      | Types of Linked list |
      | Implementation       |
      | Traversal            |
      | Insertion            |
      | Deletion             |
      | practice question    |
    And linked list section count should be 8
    When User clicks on Try Here button
    Then User should be redirected to next page
    When User enters the text in the TextBox "print(Hello)"
    And Clicks on the Run button
    Then Result is displayed on the console

    
    Scenario: Linked list pages Creating linked lis
Given user is on home page
When user clicks on the get started button Linkedlist section
Then linked list opens up

When Users clicks on Creating linked list in Lists button
Then Users should be redirected to Creating linked list in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Linked list pages TYpes of linked list
Given user is on home page
When user clicks on the get started button Linkedlist section
Then linked list opens up

When Users clicks on Types of linked  list in Lists button
Then Users should be redirected to TYpes of linked list in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Linked list pages Implementation in Lists
Given user is on home page
When user clicks on the get started button Linkedlist section
Then linked list opens up

When Users clicks on Implementation in Lists button
Then Users should be redirected to Implementation in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Linked list pages Traversal in Lists 
Given user is on home page
When user clicks on the get started button Linkedlist section
Then linked list opens up

When Users clicks on Traversal in Lists button
Then Users should be redirected to Traversal in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Linked list pages Insertion in Lists
Given user is on home page
When user clicks on the get started button Linkedlist section
Then linked list opens up

When Users clicks on Insertion in Lists button
Then Users should be redirected to Insertion in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console

Scenario: Linked list pages Deletion in Lists
Given user is on home page
When user clicks on the get started button Linkedlist section
Then linked list opens up

When Users clicks on Deletion in Lists button
Then Users should be redirected to Deletion in Lists page

When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console
