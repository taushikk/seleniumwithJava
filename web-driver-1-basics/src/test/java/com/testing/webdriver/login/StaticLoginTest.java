package com.testing.webdriver.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testing.webdriver.basics.AbstractChromeWebDriverTest;

public class StaticLoginTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/login";

	@Test
	public void login() {
		driver.get(url);
		assertEquals("First Web Application", driver.getTitle());
		WebElement nameElement= driver.findElement(By.name("name"));
		nameElement.sendKeys("in28minutes");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("dummy");
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		sleep(2);
		WebElement welcomeMessageElement = driver.findElement(By.id("welcome-message"));
		System.out.println(welcomeMessageElement.getText());
		WebElement homeElement = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		String actualResult = homeElement.getText();
		assertEquals("Home", actualResult);
	}
}
