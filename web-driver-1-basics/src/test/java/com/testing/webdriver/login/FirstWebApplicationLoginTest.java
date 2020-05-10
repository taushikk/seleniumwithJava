package com.testing.webdriver.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testing.webdriver.basics.AbstractChromeWebDriverTest;

public class FirstWebApplicationLoginTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/login.html";

	@Test
	public void login() {
		driver.get(url);
		assertEquals("SB Admin 2 - Bootstrap Admin Theme", driver.getTitle());
		WebElement nameElement = driver.findElement(By.name("email"));
		nameElement.clear();
		nameElement.sendKeys("in28minutes@gmail.com");
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.clear();
		passwordElement.sendKeys("dummy");
		WebElement loginElement = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginElement.click();
		sleep(2);
		System.out.println(driver.getCurrentUrl());

	}
}
