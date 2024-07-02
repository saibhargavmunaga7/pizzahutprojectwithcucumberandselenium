package stepdefinition;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class hooks {
	public TestContextSetup tcs;
	
	public hooks(TestContextSetup tcs)
	{
		this.tcs = tcs;
	}
	
	@After
	public void afterscenario_closing_browser() throws IOException {
		tcs.bt.webdrivermanager().quit();
		
	}

}
