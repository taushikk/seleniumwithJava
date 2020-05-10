package com.testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumHubTest {

	@Test(threadPoolSize = 2, invocationCount = 4)
	public void hub_chrome() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		// capabilities.setPlatform(Platform.WIN10.WINDOWS);

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

	@Test(threadPoolSize = 2, invocationCount = 4)
	public void hub_firefox() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");

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
