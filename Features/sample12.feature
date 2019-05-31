Feature: Login Test
-Description(optional): Registered user can login into TestMeApp using proper credentials
-Pre-Requsite: Registration module should be completed
Example Mapping:

Business Rule1: Signin link
Acceptance Criteria: Register user should be logged in sucess to TestMeApp for search
Example: john wish to purchase an item from TestMeApp

Scenario: Login with valid credentials
Given user launch chrome browser And enter TestMeApp URL
When user enter username in username field
When user enter password in password field
When user clicks on OK button
Then verify result

