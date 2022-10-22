package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class cart_page {

	public static int get_Number_Of_items() {
		List<WebElement> items = BaseClass.get_driver()
				.findElements(By.xpath("//*[@id=\"activeCartViewForm\"]/div[2]/div"));
		
		if(items.size()>0)
		return (items.size()-2);
		else
			return 0;
	}
}
