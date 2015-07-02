Feature: Say hello to the world

  Scenario: I've just opened the browser and see the calculator
    Given I open a browser and a go to the "http://localhost:8080"
    When I see the webpage
    Then I can read "Hello world"
