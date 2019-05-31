Feature: Login for POM framework

Background: Display welcome message
Given: TestMeApp displays a welcome message

Scenario: Login page
Given user navigate to testmeapp
When  user enter username and password
Then perform login