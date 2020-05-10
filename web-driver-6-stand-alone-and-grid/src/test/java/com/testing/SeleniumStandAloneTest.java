package com.testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumStandAloneTest {
	@Test
	public void basic() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8081/pages/index.html");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@Test
	public void standalone() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		WebDriver remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		// RemoteWebDriver
		// Location of StandAloneserver
		// Which browser? which OS?

		// Nodes should register to http://192.168.0.109:4444/grid/register/
		// Clients should connect to http://192.168.0.109:4444/wd/hub
		//selenium-standalone start -- -role hub
		// selenium-standalone start -- -role node -hub
		// http://192.168.0.109:4444/grid/register/
		// http://192.168.0.109:4444/grid/register/
		// selenium-standalone start -- -role node -port 556 -hub
		// http://192.168.0.109:4444/grid/register/

		remoteDriver.get("http://localhost:8081/pages/index.html");
		System.out.println(remoteDriver.getCurrentUrl());
		System.out.println(remoteDriver.getTitle());
		Thread.sleep(15000);
		remoteDriver.quit();

	}

	@Test(threadPoolSize = 2, invocationCount = 4)
	public void hub() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		WebDriver remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		// RemoteWebDriver
		// Location of StandAloneserver
		// Which browser? which OS?

		remoteDriver.get("http://localhost:8081/pages/index.html");
		System.out.println(remoteDriver.getCurrentUrl());
		System.out.println(remoteDriver.getTitle());
		Thread.sleep(15000);
		remoteDriver.quit();

	}
}
