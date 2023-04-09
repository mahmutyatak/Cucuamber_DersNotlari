package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/paralel-reports2.html",
                "json:target/json-reports/paralel-reports2.json",
                "junit:target/xml-report/paralel-reports2.xml"},
        features = "src/test/resources/features",
        glue ={"stepdefinitions","hooks"},
        tags = "@yusuf",

        dryRun = false
)
public class ParalelRunner2 {
}
