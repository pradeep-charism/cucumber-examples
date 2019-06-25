Feature: Calculator subtraction feature
    
    Scenario: Subtract two numbers
        Given I have a calculator
        When I subtract 1 and 2
        Then I should get -1
        When I subtract 1000 and 1000
        Then I should get 0
