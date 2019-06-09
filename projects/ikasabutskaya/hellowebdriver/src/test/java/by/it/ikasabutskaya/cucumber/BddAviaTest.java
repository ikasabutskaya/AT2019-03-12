package by.it.ikasabutskaya.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/by/it/ikasabutskaya/cucumber/",
        //glue = "by.it.ikasabutskaya.cucumber",
        snippets = SnippetType.CAMELCASE
                )



public class BddAviaTest extends AbstractTestNGCucumberTests {
}
