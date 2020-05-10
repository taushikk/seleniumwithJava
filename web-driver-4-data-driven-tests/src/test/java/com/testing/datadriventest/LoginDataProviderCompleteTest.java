package com.testing.datadriventest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteTest {
	String url = "http://localhost:8081/login";

	// Create the Data Provider and give the data provider a name
	@DataProvider(name = "user-ids-password-data-provider")
	public Object[][] userIdsAndPasswordDataProvider() {
		return new Object[][] { { "in28minutes", "dummy", true }, { "eve", "eve", false }, { "eve", "eve@123", true },
			{ "adam", "adam", false }, { "adam", "adam@123", true } };

	}
	// Use the data provider
	@Test(dataProvider = "user-ids-password-data-provider")
	public void testLoginForAllScenarios(String userId, String password, boolean isLoginExpectedToBeSuccessful) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("name")).sendKeys(userId);
		// driver.findElement(By.id("name")).sendKeys("in28minutes");
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		if (isLoginExpectedToBeSuccessful) {
			String welcomeMessagetext = driver.findElement(By.id("welcome-message")).getText();
			assertTrue(welcomeMessagetext.contains("Welcome " + userId));
		} else {
			String errorMessageText = driver.findElement(By.id("error-message")).getText();
			System.out.println(errorMessageText);
			assertEquals(errorMessageText, "Invalid Credentials");
		}
		driver.quit();

	}
}
