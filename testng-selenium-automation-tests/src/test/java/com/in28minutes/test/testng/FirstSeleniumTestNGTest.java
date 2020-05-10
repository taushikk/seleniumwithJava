package com.in28minutes.test.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTestNGTest {

	WebDriver webDriver;

	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		webDriver = new ChromeDriver();
	}

	@Test
	public void testGoogleDotCom() {
		// WebDriverManager.chromedriver().setup();

		// WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com/");
		System.out.println(webDriver.getCurrentUrl());
		// System.out.println(webDriver.getPageSource());
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "Google";
		assertEquals(expectedTitle, actualTitle);
		// webDriver.quit();

	}

	@Test
	// @Ignore
	public void testFacebookDotCom() {
		// WebDriverManager.chromedriver().setup();

		// WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.facebook.com/");
		System.out.println(webDriver.getCurrentUrl());
		// System.out.println(webDriver.getPageSource());
		String actualTitle = webDriver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		assertEquals(expectedTitle, actualTitle);
		// webDriver.quit();

	}

	@AfterTest
	public void after() {
		System.out.println("I am executed");
		webDriver.quit();
	}
}
