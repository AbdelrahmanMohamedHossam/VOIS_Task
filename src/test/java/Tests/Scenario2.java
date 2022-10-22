package Tests;

import org.testng.annotations.Test;

import POM.BaseClass;
import POM.Homepage;
import POM.todays_deals_page;

public class Scenario2 extends BaseClass {
	@Test(priority = 1)
	public void open_tab()
	{
		Homepage.tabs("Today's Deals");
		
	}
	@Test(priority = 2)
	public void select_department() throws InterruptedException
	{
		todays_deals_page.select_department("Headphones");
		todays_deals_page.select_department("Grocery");		
		todays_deals_page.select_discount("10% off or more");
		todays_deals_page.pagination("3");
		todays_deals_page.pagination("4");
		todays_deals_page.select_first_item();

	}
	
}
