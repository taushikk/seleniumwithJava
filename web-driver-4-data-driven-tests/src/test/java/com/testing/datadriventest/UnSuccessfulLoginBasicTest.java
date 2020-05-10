package com.testing.datadriventest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnSuccessfulLoginBasicTest {
	String url = "http://localhost:8081/login";

	@Test
	public void testUnSuccessfulLoginWithIn28minutes() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("name")).sendKeys("in28minutes");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("submit")).click();

		String errorMessageText = driver.findElement(By.id("error-message")).getText();
		System.out.println(errorMessageText);
		assertEquals(errorMessageText, "Invalid Credentials");
		driver.quit();

	}
}
