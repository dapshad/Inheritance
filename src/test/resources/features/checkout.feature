@Checkout
Feature: Login with credentials

  Background: Logging In of User
    Given user is on the the url "https://www.bbc.co.uk/"
    When user click on loginIn
    And user enters email "michmagconsult@gmail.com"
    And user enters password "Fiyin@2021"
    And user clicks on SignIn button


  Scenario Outline: User can get an actual location
    Given user navigates to weather
    When user searches "<location>"
    And user click on search


    Examples:
      | location |
      | London   |

  Scenario: User can add my location
    Given user is logged in
    When user have navigated to weather
    And user have searched for weather "London"
    And user clicked on search
    And user selects preferred location
    And user can adds weather to locations
