Feature: purchase product from TestMeApp

@category
Scenario: search product by category
Given user login
When user selects product using category
Then verify the list of products And close application
@Sub-Category
Scenario: search product by sub-category
Given user login
When user selects product using sub-category
Then verify the list of products And close application

@Product-name
Scenario: search product by product name
Given user login
When user selects product using product name
Then verify the list of products And close application
