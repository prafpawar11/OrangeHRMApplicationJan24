Feature: Test the Sauce Demo application

  Scenario: validate the Login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button
    
    Scenario: validate home page Functionality
    When user validate home page url
    And user validate home page title
    And user validate home page logo
    
    Scenario: validate PIM page
    When user click on pim link
    And user validate pim page url