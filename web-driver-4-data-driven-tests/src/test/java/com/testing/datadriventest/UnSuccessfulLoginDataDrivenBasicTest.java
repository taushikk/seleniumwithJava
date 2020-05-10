package com.testing.datadriventest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnSuccessfulLoginDataDrivenBasicTest {
	String url = "http://localhost:8081/login";

	// Create the Data Provider and give the data provider a name
	@DataProvider(name = "user-ids-data-provider")
	public String[] userIdsDataProvider() {
		return new String[] { "in28minutes", "eve", "adam" };
	}
	// Use the data provider
	@Test(dataProvider = "user-ids-data-provider")
	public void testUnSuccessfulLoginWithIn28minutes(String userId) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("name")).sendKeys(userId);
		// driver.findElement(By.id("name")).sendKeys("in28minutes");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("submit")).click();

		String errorMessageText = driver.findElement(By.id("error-message")).getText();
		System.out.println(errorMessageText);
		assertEquals(errorMessageText, "Invalid Credentials");
		driver.quit();

	}
}
