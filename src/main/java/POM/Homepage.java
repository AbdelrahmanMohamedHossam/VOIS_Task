package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage {

	public static void Search(String thing) {

		BaseClass.get_driver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement Search_field = BaseClass.get_driver().findElement(By.id("twotabsearchtextbox"));
		Search_field.sendKeys(thing);

		WebElement Search_btn = BaseClass.get_driver().findElement(By.id("nav-search-submit-button"));
		Search_btn.click();
	}

	public static void open_cart() {
		BaseClass.get_driver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement cart = BaseClass.get_driver().findElement(By.id("nav-cart"));
		cart.click();
	}

	public static void tabs(String tab_name)
	{
		BaseClass.get_driver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement logo=BaseClass.get_driver().findElement(By.id("nav-logo"));
		logo.click();
		BaseClass.get_driver().findElement(By.linkText(tab_name)).click();
		//tab.click();
		
	}
}
