Feature: Toast box stamp collection program
  The more drinks you buy, the more stamps you can earn, and can redeem free drinks with it.

  Background:
    Given the following drink categories in the shop:
      | Drink         | Category | Points |
      | Black Coffee  | Coffee   | 15     |
      | Apple Juice   | Juice    | 20     |
      | Milk Tea      | Tea      | 10     |
      | Peanut butter | Toast    | 25     |
      | Chicken Rice  | Rice     | 35     |

  Scenario Outline: Earning points when purchasing drinks
    Given Pradeep is a Toast Box Member
    When Pradeep purchases <Quantity> <Drink> drinks
    Then he should earn <Points> points
    Examples:
      | Drink        | Quantity | Points |
      | Apple Juice  | 2        | 40     |
      | Milk Tea     | 1        | 10     |
      | Chicken Rice | 3        | 105     |