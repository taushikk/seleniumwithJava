package com.testing.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class NewWindowTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/notifications.html";
	@Test
	public void testForWindows() {
		driver.get(url);
		driver.findElement(By.id("newPageButton")).click();
		sleep(3);
		// 1 - CDwindow-FAA9EB550A03A88220124D2AC9C939B6
		// 2 - [CDwindow-FAA9EB550A03A88220124D2AC9C939B6,
		// CDwindow-B9C0B3754F1302242C989ABC0DFB76C9]
		System.out.println("1 - " + driver.getWindowHandle());
		System.out.println("2 - " + driver.getWindowHandles());

	}

	@Test
	public void findWindowHandleOfSecondWindow() {
		driver.get(url);

		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		driver.findElement(By.id("newPageButton")).click();
		sleep(3);

		String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);

		System.out.println(secondWindowHandle);

	}

	private String findSecondWindowHandle(String firstWindowHandle) {
		for (String handle : driver.getWindowHandles()) {
			if (!firstWindowHandle.equals(handle)) {
				return handle;
			}
		}
		return null;
	}

	@Test
	public void switchToSecondWindow() {
		driver.get(url);

		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		driver.findElement(By.id("newPageButton")).click();
		sleep(3);

		String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);

		System.out.println(secondWindowHandle);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(secondWindowHandle);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(firstWindowHandle);
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.getCurrentUrl());

	}

}

