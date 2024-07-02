package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	public WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By blackpopuplocator = By.className("icon-close--white");
	By locationofdelivery =By.cssSelector("input[placeholder='Enter your location for delivery']");
	By handledrpdown = By.cssSelector("div.flex button");
	
	public WebElement blackpopupscreen() 
	{
		return driver.findElement(blackpopuplocator);
	}
	
	public void userclosepopscreen()
	{
		blackpopupscreen().click();
	}
	
	public WebElement getlocationofdelivery() 
	{
		return driver.findElement(locationofdelivery);
	}
	
	public void typeadress(String location) 
	{
		 getlocationofdelivery().sendKeys(location);
	}
	
	public void getdropdown()
	{
		List<WebElement> locationoptions = driver.findElements(handledrpdown);
		for(int i=0; i<locationoptions.size();i++) 
		{
			String text = locationoptions.get(i).getText();
			if(text.contains("LuLu Mall Hyderabad"))
			{
				locationoptions.get(i).click();
				break;
			}
		}
	}
	
	

}
