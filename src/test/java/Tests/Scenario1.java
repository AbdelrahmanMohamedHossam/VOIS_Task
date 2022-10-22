package Tests;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import POM.BaseClass;
import POM.Homepage;
import POM.Search_results;
import POM.cart_page;
import POM.product_page;

public class Scenario1 extends BaseClass {

	public static int old_number_cart_items;
	@Test(priority = 1)
	public void Select_item() throws InvocationTargetException {
		
		Homepage.open_cart();
		old_number_cart_items = cart_page.get_Number_Of_items();
		
		Homepage.Search("car accessories");
// first item data index starts from 2		
		Search_results.Select_item("2");

	}

	@Test(priority = 2)
	public void Add_to_cart() {

		product_page.add_to_cart();

	}

	@Test(priority = 3)
	public void verify_item() {
		Homepage.open_cart();
		int number_cart_items = cart_page.get_Number_Of_items();
		assertNotEquals(old_number_cart_items, number_cart_items);
	}
}
