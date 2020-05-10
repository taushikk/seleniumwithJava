package com.testing.selenium.crossbrowser.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserFrameworkTest {
	WebDriver driver = null;

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(@Optional("chrome") String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Does not support browser + " + browser);
		}

	}

	@Test
	public void lunchTablesPage() {

		driver.get("http://localhost:8081/pages/tables.html");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
