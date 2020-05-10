package com.testing.webdriver.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class PlayingWithModelWindowAndWaitsTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/notifications.html";

	@Test(expectedExceptions = ElementNotVisibleException.class)
	public void playingWithModelWindows_expectingAException() {
		driver.get(url);
		driver.findElement(By.id("modalButton")).click();
		driver.findElement(By.id("myModalCloseButton")).click();

	}

	@Test
	public void playingWithModelWindows_FixingWithSleep() {
		driver.get(url);
		driver.findElement(By.id("modalButton")).click();
		sleep(1);
		System.out.println(driver.findElement(By.id("myModalLabel")).getText());
		driver.findElement(By.id("myModalCloseButton")).click();

	}

	@Test
	@Ignore("Implicit wait fails on chrome")
	public void playingWithModelWindows_implicitWait() {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("modalButton")).click();
		System.out.println(driver.findElement(By.id("myModalLabel")).getText());
		driver.findElement(By.id("myModalCloseButton")).click();

	}

	@Test
	public void playingWithModelWindows_explicitWait() {
		driver.get(url);
		driver.findElement(By.id("modalButton")).click();

		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.withMessage("Waited for 10 seconds but still element is unavailable");

		WebElement modalLabel = webDriverWait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("myModalLabel"))));

		System.out.println(modalLabel.getText());
		driver.findElement(By.id("myModalCloseButton")).click();

	}
}
