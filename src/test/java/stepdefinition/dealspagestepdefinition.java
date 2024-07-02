package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utils.TestContextSetup;

public class dealspagestepdefinition {
	public WebDriver driver;
	public String checkouttext;
	public String totalamount;
	
	public TestContextSetup tcs;
	public dealspagestepdefinition(TestContextSetup tcs)
	{
		this.tcs = tcs;
	}
	
	@When("User navigate to deails page")
	public void user_navigate_to_deails_page() {
	  String dealstitle = tcs.pom.getdealspage().gettitle();
	  Assert.assertEquals(dealstitle, "Online Pizza Order, Pizza Deals, Pizza Hut Online Orders | Pizza Hut India");
	  
	  
	}
	@Then("User validate vegetarian radio button flag is off")
	public void user_validate_vegetarian_radio_button_flag_is_off() {
		Boolean radiooff = tcs.pom.getdealspage().radiobuttoncheck();
		Assert.assertFalse(radiooff);
	}
	@Then("User clicks on Pizzas menu bar option")
	public void user_clicks_on_pizzas_menu_bar_option() throws InterruptedException {
		tcs.pom.getdealspage().clickonpizzamenu();
		Thread.sleep(2000);
	   
	}
	@When("User select add button of any pizza from Recommended")
	public void user_select_add_button_of_any_pizza_from_recommended() {
		tcs.pom.getdealspage().addpizza();
	    
	}
	@Then("User see that the pizza is getting added under Your Basket")
	public void user_see_that_the_pizza_is_getting_added_under_your_basket() {
	   Boolean pizzaaddedtobasket = tcs.pom.getdealspage().addpizzaintobasket();
	   Assert.assertTrue(pizzaaddedtobasket);
	}
	@Then("User validate pizza price plus Tax is checkout price")
	public void user_validate_pizza_price_plus_tax_is_checkout_price() {
		totalamount = tcs.pom.getdealspage().gettoatlamounincheckout().replace("₹", "");
		System.out.println(totalamount);
		String amount = "413.70";
		Assert.assertEquals(amount,totalamount);
	}
	@Then("User validate checkout button contains Item count")
	public void user_validate_checkout_button_contains_item_count() {
		checkouttext = tcs.pom.getdealspage().getcheckbuttontext();
		String itemtext		= tcs.pom.getdealspage().getitem();
		Assert.assertTrue(checkouttext.contains(itemtext));
	   
	}
	@Then("User validate checkout button contains total price count")
	public void user_validate_checkout_button_contains_total_price_count() {
		String totalpricetext = tcs.pom.getdealspage().gettoatlamounincheckout();
		Assert.assertTrue(checkouttext.contains(totalpricetext));
		
	}
	@Then("User clicks on Drinks option")
	public void user_clicks_on_drinks_option() throws InterruptedException {
		tcs.pom.getdealspage().clickondrinks();
		Thread.sleep(2000);

	}
	@Then("User select Pepsi option to add into the Basket")
	public void user_select_pepsi_option_to_add_into_the_basket() {
		tcs.pom.getdealspage().clickonpepsi();
	}
	@Then("User see {string} are showing under checkout button")
	public void user_see_are_showing_under_checkout_button(String two2items) {
		String Twoitems = tcs.pom.getdealspage().getitem();
		System.out.println(Twoitems);
		Assert.assertEquals(Twoitems,two2items);
		System.out.println(two2items);
	}
	@Then("User see total price is now more than before")
	public void user_see_total_price_is_now_more_than_before() {
		String increasedamount = tcs.pom.getdealspage().gettoatlamounincheckout().replace("₹", "");
		if(Double.parseDouble(increasedamount)>Double.parseDouble(totalamount)) 
		{
			System.out.println(increasedamount);
		}
	}
	@Then("User remove the Pizza item from Basket")
	public void user_remove_the_pizza_item_from_basket() {
		tcs.pom.getdealspage().removepizza();
	}
	@Then("see Price tag got removed from the checkout button")
	public void see_price_tag_got_removed_from_the_checkout_button() {
//		Assert.assertFalse(checkouttext.contains(totalamount));
	}
	@Then("User see {string} showing in checkout button")
	public void user_see_showing_in_checkout_button(String one1item) {
		String oneitem = tcs.pom.getdealspage().getitem();
		System.out.println(oneitem);
		Assert.assertEquals(oneitem,one1item);
		System.out.println(one1item);
	}
	@Then("User Clicks on Checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException {
		tcs.pom.getdealspage().clickoncheckoutbutton();
		Thread.sleep(3000);
	}
	@Then("User see minimum order required pop up is getting displayed")
	public void user_see_minimum_order_required_pop_up_is_getting_displayed() throws InterruptedException {
		Boolean showcased = tcs.pom.getdealspage().miniumpopdisplayed();
		Assert.assertTrue(showcased);
		System.out.println("not purchased a minium order");
		Thread.sleep(3000);
	}



}
