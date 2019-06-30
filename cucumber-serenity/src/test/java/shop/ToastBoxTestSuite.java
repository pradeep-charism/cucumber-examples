package shop;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/stamps",
        glue = "coffee.shop"
)
public class ToastBoxTestSuite {
}
