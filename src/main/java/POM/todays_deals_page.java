package POM;

//import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class todays_deals_page {

	public static void select_department(String dep) {
		List<WebElement> departments = BaseClass.get_driver()
				.findElements(By.xpath("/html/body/div[1]/div[21]/div/div/div/div[2]/div[2]/span[3]/span/ul/li"));

		for (WebElement item : departments) {
			if (item.getText().equals(dep))
				item.click();
		}
	}

	public static void select_discount(String dis) {
		List<WebElement> discounts = BaseClass.get_driver()
				.findElements(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/span/ul/li"));
		for (WebElement item : discounts) {
			if (item.getText().equals(dis))
				item.click();
		}

	}

	public static void pagination(String page_number) throws InterruptedException {
		BaseClass.get_driver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> pages = BaseClass.get_driver()
				.findElements(By.xpath("//*[@id=\"slot-15\"]/div/div/div[3]/div/ul/li"));
		Thread.sleep(5000);
		for (WebElement item : pages) {
			if (item.getText().equals(page_number))
				item.click();
		}

		/*
		 * for (WebElement item : pages) { if (item.getText().equals(page_number))
		 * item.click(); if (item.getText().equals("3")) item.click();
		 * 
		 * }
		 */

	}

	public static void select_first_item() {
		WebDriverWait wait = new WebDriverWait(BaseClass.get_driver(), 15);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]")));
		WebElement item = BaseClass.get_driver()
				.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]"));
		item.click();
	}
}
