Feature: Calculator division feature

    Background:
        Given I have a calculator

    Scenario: Divide two numbers
        When I divide 1 and 2
        Then I should get 0.5
        When I divide 1000 and -1000
        Then I should get -1.0

    Scenario: Divide by zero
        When I divide 1 and 0
        Then I should get 'Divide by zero exception'