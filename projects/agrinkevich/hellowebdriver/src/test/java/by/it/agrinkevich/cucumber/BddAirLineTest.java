package by.it.agrinkevich.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/java/by/it/agrinkevich/cucumber",
        glue = "by.it.agrinkevich.cucumber",
        snippets = SnippetType.CAMELCASE
)

@Test
public class BddAirLineTest extends AbstractTestNGCucumberTests {
}


