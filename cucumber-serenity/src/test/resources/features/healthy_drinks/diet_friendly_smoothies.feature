Feature: Diet-friendly Drinks

  Toast Box wants to attract health-conscious customers by proposing options to help drink buyers
  know if a drink is in line with their diet plans.

  Scenario Outline: Drinks are organised into categories based on their number of calories

  Each category is represented by a number of "stars" - the more "stars" the drink has,
  the more calories it contains.

    When a <Drink> drink contains <Calories> calories
    Then it should be classed as a <Stars> star drink in the <Range> range

    Examples: Healthy drink options
    Smoothies under 300 calories are classed as 'Healthy'

      | Category  | Drink             | Calories | Stars | Range   |
      | Under 200 | Apple and Kale    | 160      | 1     | Healthy |
      | Under 300 | Orange and Yogurt | 240      | 2     | Healthy |

    Examples: Indulgent drink options
    Smoothies with 300 or more calories are classed as 'Indulgent'

      | Category    | Drink              | Calories | Stars | Range     |
      | Under 400   | Triple Berry Blend | 380      | 3     | Indulgent |
      | 400 or more | Strawberry Special | 490      | 4     | Indulgent |

  Scenario: Dieting members are shown which smoothies fit their diet requirements
    Given Diana has opted for the diet-friendly plan with a maximum star count of 2
    And the following smoothies are available:
      | Drink              | Calories | Flame Count |
      | Green Goodness     | 140      | 1           |
      | Orange and Yogurt  | 240      | 2           |
      | Triple Berry Blend | 380      | 3           |
      | Strawberry Special | 490      | 4           |
    When she views the drink catalog
    Then she should be shown the following smoothies:
      | Drink              | Flame Count | Diet-friendly |
      | Green Goodness     | 1           | Yes           |
      | Orange and Yogurt  | 2           | Yes           |
      | Triple Berry Blend | 3           | No            |
      | Strawberry Special | 4           | No            |

  Scenario: Dieting members should be proposed healthy alternatives
  Healthy options with the same flavor are proposed whenever a participating member selects a drink with 3 or 4 flames.

    Given Doug has opted for the diet-friendly plan
    And the following smoothies are available:
      | Drink              | Flavors       | Calories | Flame Count |
      | Green Goodness     | Green         | 140      | 1           |
      | Apple and Kale     | Sweet, Fruity | 160      | 1           |
      | Orange and Yogurt  | Fruity        | 240      | 2           |
      | Triple Berry Blend | Fruity        | 380      | 3           |
      | Strawberry Special | Sweet, Fruity | 490      | 4           |
    When Doug views the description of the "Strawberry Special"
    Then he should be shown the following "Healthy Option" smoothies:
      | Apple and Kale    |
      | Orange and Yogurt |

  @manual
  Scenario: Dieting members should be encouraged when they select a healthy option
    Given Doug has opted for the diet-friendly plan
    And the following smoothies are available:
      | Drink              | Calories | Flame Count |
      | Apple and Kale     | 160      | 1           |
      | Orange and Yogurt  | 240      | 2           |
      | Triple Berry Blend | 380      | 3           |
      | Strawberry Special | 490      | 4           |
    When Doug views the description of the "Orange and Yogurt"
    Then he should be shown that this is a "Healthy Option" drink

