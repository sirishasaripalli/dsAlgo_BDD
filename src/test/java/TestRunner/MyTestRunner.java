package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/GraphPage.feature"},
		glue = {"StepDefinitions", "AppHooks"},
		//tags ="@tag1",
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	
				"timeline:test-output-thread/"
		}		
				)

public class MyTestRunner{
	
					
			}
			
			
	


