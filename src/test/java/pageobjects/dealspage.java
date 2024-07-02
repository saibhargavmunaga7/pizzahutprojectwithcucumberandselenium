package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dealspage {
	public WebDriver driver;
	 
	public dealspage(WebDriver driver)
	{
		this.driver=driver;
	}
	By radiobuttonlocator =By.cssSelector("div[class='hidden 2xl:flex w-full'] span[class='py-4 px-5 border rounded-full flex items-center cursor-pointer bg-grey-light border-grey-light justify-start'");
	By pizzalocator = By.linkText("Pizzas");
	By addpizzalocator  =By.xpath("//*[@data-synth=\"button--mazedar-makhni-paneer-recommended-pan-personal--one-tap\"]");
	By basketpizzalocator = By.cssSelector("a[title='Click to make changes']");
	By totalpricelocator = By.cssSelector(".text-right");
	By checoutkbuttontextloctor = By.xpath("//a[@href=\"/order/checkout/\"]");
	By textitemlocator  = By.cssSelector(".bg-green-dark.pl-5.pr-5.rounded");
	By  drinkslocator    = By.linkText("Drinks");
	By pepsilocator = By.cssSelector("button[data-synth='button--pepsi-600ml--one-tap']");
	By removepizzalocator =By.cssSelector("button[data-synth='basket-item-remove--mazedar-makhni-paneer-recommended-pan-personal']");
	By clickoncheckoutbutton = By.xpath("//button[@data-synth='link--checkout']");
	By minpoplocator = By.xpath("//h3/span");
		public String gettitle()
		{
			return driver.getTitle();
		}
		public boolean radiobuttoncheck() 
		{
			return driver.findElement(radiobuttonlocator).isSelected();
		}
		
		public void clickonpizzamenu()
		{
			driver.findElement(pizzalocator).click();
		}
		
		public void addpizza() 
		{
			driver.findElement(addpizzalocator).click();
		    
		}
		
		public boolean addpizzaintobasket()
		{
			return driver.findElement(basketpizzalocator).isDisplayed();
		}
		
		public String  gettoatlamounincheckout() 
		{
			return driver.findElement(totalpricelocator).getText();
			
		}
		public String getcheckbuttontext()
		{
			return driver.findElement(checoutkbuttontextloctor).getText();

		}
		
		public String getitem() 
		{
			
			return driver.findElement(textitemlocator).getText();
		
		}
		public void clickondrinks()
		{
			driver.findElement(drinkslocator).click();
		}
		
		public void clickonpepsi()
		{
			driver.findElement(pepsilocator).click();
		}
		
		public void removepizza()
		{
			driver.findElement(removepizzalocator).click();
		}
		public void clickoncheckoutbutton()
		{
			driver.findElement(clickoncheckoutbutton).click();
		}
		
		public boolean miniumpopdisplayed()
		{
			return driver.findElement(minpoplocator).isDisplayed();
		}
		
}
