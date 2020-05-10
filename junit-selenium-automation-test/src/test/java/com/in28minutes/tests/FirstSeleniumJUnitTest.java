package com.in28minutes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumJUnitTest {

	WebDriver webDriver;

	@Before
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
	@Ignore
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

	@After
	public void after() {
		webDriver.quit();
	}
}
