package stepdefinition;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumrawcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.className("icon-close--white")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter your location for delivery']")).sendKeys("LuLu Mall Hyderabad");
		Thread.sleep(2000);
		List<WebElement> locationoptions = driver.findElements(By.cssSelector("div.flex button"));
		for(int i=0; i<locationoptions.size();i++) 
		{
			String text = locationoptions.get(i).getText();
			if(text.contains("LuLu Mall Hyderabad"))
			{
				locationoptions.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		Boolean radiooff = driver.findElement(By.cssSelector("div[class='hidden 2xl:flex w-full'] span[class='py-4 px-5 border rounded-full flex items-center cursor-pointer bg-grey-light border-grey-light justify-start'")).isSelected();
		Assert.assertFalse(radiooff);
		System.out.println("vegetrain radion button by default off state");
		driver.findElement(By.linkText("Pizzas")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-synth=\"button--mazedar-makhni-paneer-recommended-pan-personal--one-tap\"]")).click();
		
		String totalamount = driver.findElement(By.cssSelector(".text-right")).getText().replace("₹", "");
		System.out.println(totalamount);
		String amount = "413.70";
		Assert.assertEquals(amount,totalamount);
		System.out.println("the total amount is correct");
		driver.findElement(By.linkText("Drinks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-synth='button--pepsi-600ml--one-tap']")).click();
		
		
		String Twoitems = driver.findElement(By.cssSelector(".bg-green-dark.pl-5.pr-5.rounded")).getText();
		System.out.println(Twoitems);
		String orignalnofitems ="2 items";
		Assert.assertEquals(Twoitems,orignalnofitems);
		System.out.println(orignalnofitems);
		
		String increasedamount = driver.findElement(By.cssSelector(".text-right")).getText().replace("₹", "");
		if(Double.parseDouble(increasedamount)>Double.parseDouble(totalamount)) 
		{
			System.out.println(increasedamount);
		}
		driver.findElement(By.cssSelector("button[data-synth='basket-item-remove--mazedar-makhni-paneer-recommended-pan-personal']")).click();
		
		String oneitem = driver.findElement(By.cssSelector(".bg-green-dark.pl-5.pr-5.rounded")).getText();
		System.out.println(oneitem);
		String orignalnofitem ="1 item";
		Assert.assertEquals(oneitem,orignalnofitem);
		System.out.println(orignalnofitem);
		
		driver.findElement(By.xpath("//button[@data-synth='link--checkout']")).click();
		Thread.sleep(1000);
		Boolean showcased = driver.findElement(By.xpath("//h3/span")).isDisplayed();
		Assert.assertTrue(showcased);
		System.out.println("not purchased a minium order");
		
	}
}


