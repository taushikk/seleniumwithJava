package com.testing.webdriver.scenarios;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class CheckElementStylesTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/forms.html";

	@Test
	public void getCSSStylesForErrorElement() {
		driver.get(url);
		WebElement errorField = driver.findElement(By.id("inputError"));
		System.out.println(errorField.getCssValue("color"));
		System.out.println(errorField.getCssValue("display"));
		System.out.println(errorField.getCssValue("border-color"));
		System.out.println(errorField.getCssValue("height"));
		System.out.println(errorField.getCssValue("font-size"));
		System.out.println(errorField.getCssValue("background-color"));
		System.out.println(errorField.getCssValue("border"));
	}

	@Test
	public void getCSSStylesForSuccessElement() {
		driver.get(url);
		WebElement errorField = driver.findElement(By.id("inputSuccess"));
		System.out.println(errorField.getCssValue("color"));
		System.out.println(errorField.getCssValue("display"));
		System.out.println(errorField.getCssValue("border-color"));
		System.out.println(errorField.getCssValue("height"));
		System.out.println(errorField.getCssValue("font-size"));
		System.out.println(errorField.getCssValue("background-color"));
		System.out.println(errorField.getCssValue("border"));
	}

	@Test
	public void checkIfAnElementEnabled() {
		driver.get(url);
		WebElement errorField = driver.findElement(By.id("disabledInput"));
		assertFalse(errorField.isEnabled());
		System.out.println(errorField.isEnabled());
	}

	@Test
	public void exploreWebElementInterface() {
		driver.get(url);
		WebElement errorField = driver.findElement(By.id("disabledInput"));
		assertFalse(errorField.isEnabled());
		System.out.println(errorField.getAttribute("placeholder"));
		System.out.println(errorField.getLocation());
		System.out.println(errorField.getSize());

		WebElement textElement = driver.findElement(By.id("textElement"));
		System.out.println(textElement.getLocation());
		System.out.println(textElement.getSize());

		WebElement textAreaElement = driver.findElement(By.id("textAreaElement"));
		System.out.println(textAreaElement.getLocation());
		System.out.println(textAreaElement.getSize());

		WebElement inputWarning = driver.findElement(By.id("inputWarning"));
		System.out.println(inputWarning.getLocation());
		System.out.println(inputWarning.getSize());
	}
}
