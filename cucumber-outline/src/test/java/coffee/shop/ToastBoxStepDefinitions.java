package coffee.shop;

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

    @Given("^(.*) is a Morning Freshness Member$")
    public void michael_is_a_Morning_Freshness_Member(String name) {
        member = new ToastBoxMember(name, stampCard);
    }

    @When("^(.*) purchases (\\d+) (.*) drinks?")
    public void michael_purchases_drinks(String name,
                                         Integer amount,
                                         String drink) {
        member.orders(amount, drink);
    }

    @Then("he should earn {int} points")
    public void he_should_earn_points(Integer expectedPoints) {
        assertThat(member.getPoints()).isEqualTo(expectedPoints);
    }
}
