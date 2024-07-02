package pageobjects;

import org.openqa.selenium.WebDriver;

public class pageobjectmanager 
{
	public WebDriver driver;
	public homepage hp;
	public dealspage dp;
	public pageobjectmanager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public homepage gethomepage() 
	{
		hp = new homepage(driver);
		return hp;
	}
	
	public dealspage getdealspage() 
	{
		dp = new dealspage(driver);
		return dp;
	}
	

}
