package ledger.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ledger.TradeLedger;

public class TradeLedgerSteps {

    private TradeLedger ledger;

    @Given("{string} starts with his wallet amount of ${int}")
    public void starts_with_his_wallet_amount_of_$(String name, Integer amount) {
        ledger.setUserName(name);
        ledger.setWalletAmount(Double.valueOf(amount));
    }

    @When("He buys a {int} units of SINGTEL each costing ${int}")
    public void he_buys_a_units_of_SINGTEL_each_costing_$(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("It costs the him ${int}")
    public void it_costs_the_him_$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("The balance in his wallet is ${int}")
    public void the_balance_in_his_wallet_is_$(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("He buys a {int} units of STARHUB each costing ${int}")
    public void he_buys_a_units_of_STARHUB_each_costing_$(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
