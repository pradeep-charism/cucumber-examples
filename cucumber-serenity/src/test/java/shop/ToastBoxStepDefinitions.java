package shop;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ToastBoxStepDefinitions {

    private DrinkCatalog drinkCatalog = new DrinkCatalog();
    private StampCard stampCard = new StampCard(drinkCatalog);
    private ToastBoxMember member;

    @Given("the following drink categories in the shop:")
    public void the_following_drink_categories_in_the_shop(List<Map<String,String>> drinkCategories) {
        drinkCategories.stream().forEach(
                drinkCategory -> {
                    String drink = drinkCategory.get("Drink");
                    String category = drinkCategory.get("Category");
                    Integer points = Integer.parseInt(drinkCategory.get("Points"));

                    drinkCatalog.addDrink(drink, category);
                    stampCard.setPointsPerCategory(category, points);

                }
        );
    }

    @Given("^(.*) is a Toast Box Member$")
    public void user_is_a_Toast_Box_Member(String name) {
        member = new ToastBoxMember(name, stampCard);
    }

    @When("^(.*) purchases (\\d+) (.*) drinks?")
    public void user_purchases_drinks(String name,
                                         Integer amount,
                                         String drink) {
        member.orders(amount, drink);
    }

    @Then("he should earn {int} points")
    public void he_should_earn_points(Integer expectedPoints) {
        assertThat(member.getPoints()).isEqualTo(expectedPoints);
    }


    @Given("{word} has opted for the diet-friendly plan with a maximum flame count of {int}")
    public void has_opted_for_the_diet_friendly_plan_with_a_maximum_flame_count_of(String member, Integer maxFlames) {
        // TODO
    }

    @Given("the following drinks are available:")
    public void the_following_drinks_are_available(io.cucumber.datatable.DataTable dataTable) {
        // TODO
    }

    @When("^s?he views the drink catalog$")
    public void she_views_the_drink_catalog() {
        // TODO
    }

    @Then("^s?he should be shown the following drinks:")
    public void she_should_be_shown_the_following_drinks(io.cucumber.datatable.DataTable dataTable) {
        // TODO
    }

    @When("^an? (.*) drink contains (.*) calories$")
    public void a_drink_contains(String drink, Integer calories) {
        // TODO
    }

    @Then("it should be classed as a {int} flame drink in the {word} range")
    public void it_should_be_classed_as_a_flame_drink(Integer flames, String range) {
        // TODO
    }
}
