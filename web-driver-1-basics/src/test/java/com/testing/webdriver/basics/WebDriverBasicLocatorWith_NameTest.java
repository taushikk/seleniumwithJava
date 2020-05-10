package com.testing.webdriver.basics;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class WebDriverBasicLocatorWith_NameTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/login.html";

	@Test
	public void testTitle() {
		driver.get(url);
		assertEquals("SB Admin 2 - Bootstrap Admin Theme", driver.getTitle());
	}

	@Test
	public void testGetInformationAboutEmail() {
		driver.get(url);
		WebElement nameElement = driver.findElement(By.name("email"));
		System.out.println(nameElement.getTagName());
		System.out.println(nameElement.getAttribute("type"));
		System.out.println(nameElement.getAttribute("value"));

	}

	@Test
	public void testGetInformationAboutPassword() {
		driver.get(url);
		WebElement nameElement = driver.findElement(By.name("password"));
		System.out.println(nameElement.getTagName());
		System.out.println(nameElement.getAttribute("class"));
		System.out.println(nameElement.getAttribute("value"));
		System.out.println(nameElement.getAttribute("placeholder"));

	}

	@Test
	public void testGetInformationAboutCheckbox() {
		driver.get(url);
		WebElement nameElement = driver.findElement(By.name("remember"));
		System.out.println(nameElement.getTagName());
		System.out.println(nameElement.getAttribute("class"));
		System.out.println(nameElement.getAttribute("value"));
		System.out.println(nameElement.getAttribute("placeholder"));
		System.out.println(nameElement.getAttribute("type"));

	}

	@Test
	public void testGetInformationAboutLoginButton() {
		driver.get(url);
		WebElement nameElement = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		System.out.println(nameElement.getTagName());
		System.out.println(nameElement.getAttribute("type"));
		System.out.println(nameElement.getAttribute("value"));

	}
}
