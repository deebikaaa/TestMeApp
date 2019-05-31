Feature: The user one who wnats to select product and proceed with checkout

Scenario: Select product and checkout

Given user login in to TestMeApp
When user selects product as "laptop"
When user clicks on add to cart
When User clicks on cart link
When user provides quantity as 1
When user proceed checkout
Then verify the review and payment page
 
