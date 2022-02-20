@login
Feature: Login Functionality


  Scenario: When user logs in with valid credentials, Main Page page should be displayed
    Given User is on login page
    And User logs in with username  and password
    Then Main Page page should be displayed