package com.pluralsight.bdd.loyalty_cards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/stamps",
        glue = "com.pluralsight.bdd"
)
public class SuperSmoothieProgramTestSuite {
}
