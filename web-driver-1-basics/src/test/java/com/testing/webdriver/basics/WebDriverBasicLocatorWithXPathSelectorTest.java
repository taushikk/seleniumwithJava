package com.testing.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class WebDriverBasicLocatorWithXPathSelectorTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/tables.html";

	@Test
	public void testXpathSelectorForTableTd() {
		driver.get(url);
		WebElement browserRow1 = driver
				.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
		assertEquals(browserRow1.getText(), "Firefox 1.0");
	}

	@Test
	public void testXpathSelectorForSortingAndCheckingFirstRow() {
		driver.get(url);
		WebElement headerBrowser = driver
				.findElement(By.xpath("//*[@id='dataTables-example']/thead/tr/th[2]"));
		headerBrowser.click();

		WebElement element = driver
				.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));

		assertEquals(element.getText(), "All others");
	}

}
