Feature: How the calculator should say hello to the world

  Scenario: I've just opened the browser and I want to see the calculator
    Given I open a browser and a go to the "http://localhost:8080"
    When I see the web page with title "calculator"
    Then I can read "first number" with an empty box named "first_number"
    Then I can read "second number" with an empty box named "second_number"
    Then I can read "result" followed by a number "0"
