package com.testing.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class WebDriverBasicLocatorWithCSSSelectorTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/tables.html";

	@Test
	public void testCssSelectorForTableTd() {
		driver.get(url);
		WebElement browserRow1 = driver
				.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
		assertEquals(browserRow1.getText(), "Firefox 1.0");
	}

	@Test
	public void testCssSelectorForSortingAndCheckingFirstRow() {
		driver.get(url);
		WebElement headerBrowser = driver
				.findElement(By.cssSelector("#dataTables-example > thead > tr > th:nth-child(2)"));
		headerBrowser.click();

		WebElement element = driver
				.findElement(By.cssSelector("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1"));

		assertEquals(element.getText(), "All others");
	}

}
