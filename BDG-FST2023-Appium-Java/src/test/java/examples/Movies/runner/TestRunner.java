package examples.Movies.runner;

import examples.Movies.tests.TestsBase;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/examples/Movies/features",
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        stepNotifications = true,

        plugin = {
                "pretty",
                "html:src/reports/HTML_REPORT.html"
        },
        publish = false
)


//@CucumberOptions(features = "src/test/java/examples/Movies/features", glue = {"steps"}, plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class TestRunner extends TestsBase {
}

