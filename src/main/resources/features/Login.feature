@login
Feature: Login Functionality

  @smoke
  Scenario: When user logs in with valid credentials, Main Page page should be displayed
    Given user is on login page
    And user logs in with username "admin@example.com" and password "BuffsciTest123"
    Then "Main Page" page should be displayed