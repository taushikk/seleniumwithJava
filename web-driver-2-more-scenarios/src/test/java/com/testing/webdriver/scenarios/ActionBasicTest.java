package com.testing.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class ActionBasicTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/forms.html";
	@Test
	public void testBasicAction() {
		driver.get(url);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("textElement"));
		WebElement tableLink = driver.findElement(By.linkText("Tables"));
		element.clear();
		Actions actions = new Actions(driver);
		actions.sendKeys(element, "Test Data").perform();
		sleep(2);
		actions.click(tableLink);

	}

	@Test
	public void testBasicAction_Combine() {
		driver.get(url);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("textElement"));
		WebElement tableLink = driver.findElement(By.linkText("Tables"));
		element.clear();
		Actions actions = new Actions(driver);
		actions.sendKeys(element, "Test Data").click(tableLink).perform();
		sleep(3);

	}

	@Test
	public void testBasicDragAndDrop() {
		driver.get("http://localhost:8081/pages/sortable.html");
		driver.manage().window().maximize();
		WebElement htmlRlement = driver.findElement(By.id("html"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(htmlRlement, 50, 200).perform();
		sleep(3);

	}

	@Test
	public void testBasicDragAndDrop_Complicated() {
		driver.get("http://localhost:8081/pages/sortable.html");
		driver.manage().window().maximize();
		WebElement htmlRlement = driver.findElement(By.id("html"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(htmlRlement).moveByOffset(50, 200).release().perform();
		sleep(3);

	}
}

