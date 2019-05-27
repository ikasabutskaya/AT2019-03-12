package by.it.udalyou.сucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "C:/AT2019-03-12/projects/udalyou/hellowebdriver/src/test/java/by/it/udalyou/сucumber",
        glue = "by.it.udalyou.cucumber",
        snippets = SnippetType.CAMELCASE
)
public class BddAiaLineTest extends AbstractTestNGCucumberTests {
}
