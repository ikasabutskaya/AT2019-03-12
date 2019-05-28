package by.it.romanova.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/by/it/romanova/cucumber",
        glue = "by.it.romanova.cucumber")
public class BddAviaTest extends AbstractTestNGCucumberTests {
}
