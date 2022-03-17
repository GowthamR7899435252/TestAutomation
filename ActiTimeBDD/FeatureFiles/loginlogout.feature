# Author :
# TestCase ID:
# Reviewer
# Date Created:
# Purpose:
# Description

Feature: Login and Logout functioanlity
Description Validate the login and logout functioanlity by using valid user name and password

Scenario: Login with valid credentials
Given I launch the chrome browser
And I navigate the url of the Application
When I enter the valid username
And I enter the valid password
And I click on Login button
Then I found a Home Page

Scenario: Logout from the Application
When I minimize the flyoutwindow
When I found a Logout link
And I click on Logout link
Then I find the login page
And I close the application