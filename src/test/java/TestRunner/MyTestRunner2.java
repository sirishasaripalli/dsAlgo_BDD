package TestRunner;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/ArrayPage.feature"},
		glue = {"StepDefinitions", "AppHooks"},
		//tags ="@Smoke",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"html:target/MyReports/report.html",
				"junit:target/MyReports/report.junit",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",	
				"timeline:test-output-thread/"
				}
				)

public class MyTestRunner2 extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
					
			}
