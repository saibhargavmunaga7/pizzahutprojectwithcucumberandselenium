package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basetest {
	public WebDriver driver;
	public WebDriver webdrivermanager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);	
		if(driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
		}
		return driver;
		
	}

}
