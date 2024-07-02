package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue="stepdefinition",monochrome=true,tags="@Smoke",
				plugin= {"pretty","html:target/reports.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class JunitTestRunner 
{
	

}
