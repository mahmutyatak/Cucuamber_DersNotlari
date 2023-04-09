package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/paralel-reports1.html",
                "json:target/json-reports/paralel-reports1.json",
                "junit:target/xml-report/paralel-reports1.xml"},
        features = "src/test/resources/features",
        glue ="stepdefinitions",
        tags = "@pr2",

        dryRun = false
)
public class ParalelbRunner3 {
}
