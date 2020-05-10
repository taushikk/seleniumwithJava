package com.testing.webdriver.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class TakeScreenshotTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/frames-example.html";
	@Test
	public void testFrames() throws IOException {
		driver.get(url);

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// FileUtils.copyFile(screenshot, new File("./target/" + driver +
		// "-screenshot.png"));
		FileUtils.copyFile(screenshot, new File("./target/screenshot.png/"));

	}

}
