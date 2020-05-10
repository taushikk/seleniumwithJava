package com.testing.webdriver.scenarios;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class RunJavaScriptTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/tables.html";
	@Test
	public void testRunningOfJavaScript() throws IOException {
		driver.get(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String) js.executeScript("return document.title;");
		System.out.println(title);
		sleep(3);
		js.executeScript("window.scrollBy(0,200)");
		sleep(3);
		js.executeScript("window.scrollBy(0,400)");
		sleep(3);
		js.executeScript("window.scrollBy(0,100)");

	}

}
