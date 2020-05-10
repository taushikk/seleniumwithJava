package com.testing.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormElementTextTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/forms.html";
	@Test
	public void readFromATextElement() {
		driver.get(url);
		assertEquals(driver.findElement(By.id("textElement")).getAttribute("value"), "in28minutes");

	}

	@Test
	public void setASpecificValueIntoTextElement() {
		driver.get(url);
		WebElement textElement = driver.findElement(By.id("textElement"));
		textElement.clear();
		textElement.sendKeys("Hello");
		sleep(5);

	}

	@Test
	public void writeReadAValueFromTextArea() {
		driver.get(url);
		WebElement textArea = driver.findElement(By.id("textAreaElement"));
		assertEquals(textArea.getAttribute("value"), "");
		sleep(3);
		textArea.clear();
		textArea.sendKeys("First Line");
		textArea.sendKeys("\n");
		textArea.sendKeys("Second Line");
		sleep(3);
		assertEquals(textArea.getAttribute("value"), "First Line\nSecond Line");

	}
}
