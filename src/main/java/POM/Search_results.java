package POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search_results {

	public static void Select_item(String item_number) {

		BaseClass.get_driver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String first_item = "div[data-index ='2']";
		WebElement card = BaseClass.get_driver().findElement(By.cssSelector(first_item));

//using try catch because the first item maybe not available to buy so i will not be able to add it to cart

		for (int i = 3; i < 10; i++) {

			try {
				card.findElement(By.cssSelector("span[class=\"a-price-whole\"]"));
				break;
			} catch (NoSuchElementException e) {
				first_item = "div[data-index ='" + i + "']";
				card = BaseClass.get_driver().findElement(By.cssSelector(first_item));
			}

		}
		card.click();
		
		

	}
}
