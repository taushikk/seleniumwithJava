package com.testing.webdriver.basics;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormElementCheckBoxTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/forms.html";
	@Test
	public void readFromACheckBox() {
		driver.get(url);
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
		System.out.println(checkboxElement1.isSelected());
		assertFalse(checkboxElement1.isSelected());

		WebElement checkboxElement2 = driver.findElement(By.name("checkboxElement2"));
		System.out.println(checkboxElement2.isSelected());
		assertTrue(checkboxElement2.isSelected());

		WebElement checkboxElement3 = driver.findElement(By.name("checkboxElement3"));
		System.out.println(checkboxElement3.isSelected());
		assertTrue(checkboxElement3.isSelected());

	}

	@Test
	public void setAValueIntoCheckBoxElement1() {
		driver.get(url);
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
		sleep(4);
		checkboxElement1.click();
		WebElement checkboxElement2 = driver.findElement(By.name("checkboxElement2"));
		sleep(4);
		checkboxElement2.click();

		WebElement checkboxElement3 = driver.findElement(By.name("checkboxElement3"));
		sleep(4);
		checkboxElement3.click();

	}

	@Test
	public void checkACheckBox() {
		driver.get(url);
		checkACheckBox("checkboxElement1");
		sleep(2);
		checkACheckBox("checkboxElement2");
		sleep(2);
		checkACheckBox("checkboxElement3");
		sleep(2);

	}

	@Test
	public void unCheckACheckBox() {
		driver.get(url);
		unCheckACheckBox("checkboxElement1");
		sleep(2);
		unCheckACheckBox("checkboxElement2");
		sleep(2);
		unCheckACheckBox("checkboxElement3");
		sleep(2);

	}
	private void checkACheckBox(String checkboxName) {
		WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));
		boolean currentValue = checkboxElement1.isSelected();

		if (currentValue == false) {
			checkboxElement1.click();
		}
	}

	private void unCheckACheckBox(String checkboxName) {
		WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));
		boolean currentValue = checkboxElement1.isSelected();

		if (currentValue == true) {
			checkboxElement1.click();
		}
	}

}
