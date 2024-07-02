package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.pageobjectmanager;

public class TestContextSetup {
	public WebDriver driver;
	public basetest bt;
	public pageobjectmanager pom;
	public TestContextSetup() throws IOException 
	{
	  bt = new basetest();
	  pom = new pageobjectmanager(bt.webdrivermanager());
	}

}
