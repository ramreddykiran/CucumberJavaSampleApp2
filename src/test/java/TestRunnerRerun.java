import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt" , 
plugin = { "pretty:pretty-report.log", 
		"html:target1/html-report",
		"json:target1/cucumber.json" ,
		"junit:target1/cucumber.xml" 
		//"progress",
	//	"usage",
		}, 
glue= {"com.def.stepdefs.combined"},
monochrome = true
)
public class TestRunnerRerun {
}
