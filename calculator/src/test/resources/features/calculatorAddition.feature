Feature: Calculator addition feature
    
    Scenario: Add two numbers
        Given I have a calculator
        When I add 1 and 2
        Then I should get 3
        When I add 1000 and -1000
        Then I should get 0
