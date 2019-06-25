package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions {

    private Calculator calculator;
    private Object result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
       calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer a, Integer b) {
        result = calculator.add(a, b);
    }

    @Then("I should get {int}")
    public void i_should_get(Integer expectedOutput) {
        assertThat(result).isEqualTo(expectedOutput);
    }

    @When("I subtract {int} and {int}")
    public void i_subtract_and(Integer int1, Integer int2) {
        result = calculator.subtract(int1, int2);
    }

    @When("I divide {int} and {int}")
    public void i_divide_and(Integer int1, Integer int2) {
        result = calculator.divide(int1, int2);
    }

    @Then("I should get {double}")
    public void i_should_get(Double expectedOutput) {
        assertThat(result).isEqualTo(expectedOutput);
    }

    @Then("I should get {string}")
    public void i_should_get(String expectedOutput) {
        assertThat(result).isEqualTo(expectedOutput);
    }
}
