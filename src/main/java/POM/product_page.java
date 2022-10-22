package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class product_page {

	public static void add_to_cart()
	{
		BaseClass.get_driver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement add_to_cart_btn = BaseClass.get_driver().findElement(By.id("add-to-cart-button"));
		add_to_cart_btn.click();
		
	//BaseClass.get_driver().findElement(By.id("a-autoid-1")).click();
	}
}
