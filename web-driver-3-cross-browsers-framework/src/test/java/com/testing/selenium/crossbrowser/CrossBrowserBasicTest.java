package com.testing.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserBasicTest {
	@Test
	public void chromeBrowser() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8081/pages/tables.html");
		sleep(4);
		driver.quit();

	}

	@Test
	public void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("http://localhost:8081/pages/tables.html");
		sleep(4);
		driver.quit();

	}

	@Test
	public void ieBrowser() {
		WebDriverManager.iedriver().setup();

		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://localhost:8081/pages/tables.html");
		sleep(4);
		driver.quit();

	}

	@Test
	public void edgeBrowser() {
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("http://localhost:8081/pages/tables.html");
		sleep(4);
		driver.quit();

	}

	private void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
