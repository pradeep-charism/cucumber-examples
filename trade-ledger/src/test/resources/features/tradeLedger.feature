Feature: Trade ledger

  Scenario Outline: Buy a trade
    Given "User" starts with his wallet amount of $5000
    When He buys a <Quantity> units of <Instrument> each costing $<Unit Price>
    Then It costs the him $<Total Price>
    Then The balance in his wallet is $<Wallet Remaining>
    Examples:
      | Instrument | Unit Price | Quantity | Total Price | Wallet Remaining |
      | SINGTEL    | 20         | 50       | 1000        | 4000             |
      | STARHUB    | 10         | 50       | 500         | 3500             |