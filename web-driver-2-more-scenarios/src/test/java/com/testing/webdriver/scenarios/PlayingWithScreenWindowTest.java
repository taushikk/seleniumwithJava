package com.testing.webdriver.scenarios;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.testing.webdriver.more.AbstractChromeWebDriverTest;

public class PlayingWithScreenWindowTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/forms.html";
	@Test
	public void playingWithWindoes() {
		driver.get(url);
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		sleep(3);
		driver.manage().window().setPosition(new Point(200, 200));
		sleep(3);
		driver.manage().window().setSize(new Dimension(200, 500));
		sleep(3);
		driver.manage().window().maximize();
		sleep(3);
		driver.manage().window().fullscreen();
		sleep(3);

	}
}
