import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@combinedtag" }, 
plugin = { "pretty:pretty-report.log", 
		"html:target/html-report",
		"json:target/cucumber.json" ,
		"junit:target/cucumber.xml" ,
		//"progress",
	//	"usage",
		"rerun"
		}, 
glue= {"com.def.stepdefs.combined"},
monochrome = true
)
public class TestRunner {
}
