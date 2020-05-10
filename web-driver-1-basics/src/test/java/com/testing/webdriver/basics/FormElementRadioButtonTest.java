package com.testing.webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormElementRadioButtonTest extends AbstractChromeWebDriverTest {
	String url = "http://localhost:8081/pages/forms.html";
	@Test
	public void readFromARadioButton() {
		driver.get(url);
		List<WebElement> options = driver.findElements(By.name("optionsRadios"));
		for (WebElement option : options) {
			System.out.println(option.getAttribute("value") + " " + option.isSelected());
		}

	}

	@Test
	public void readFromARadioButtonWithAFrameworkMethod() {
		driver.get(url);
		System.out.println(getSelectedRadioButtonValue("optionsRadios"));
		System.out.println(getSelectedRadioButtonValue("optionsRadiosInline"));

	}

	@Test
	public void setValueForRadioButton() {
		driver.get(url);
		setRadioButtonToValue("optionsRadios", "option2");
		setRadioButtonToValue("optionsRadiosInline", "inline-option1");

	}

	private void setRadioButtonToValue(String radioButtonName, String valueToSelect) {
		List<WebElement> options = driver.findElements(By.name(radioButtonName));
		for (WebElement option : options) {
			if (option.getAttribute("value").equals(valueToSelect)) {
				option.click();
			}
		}
	}
	private String getSelectedRadioButtonValue(String name) {
		List<WebElement> options = driver.findElements(By.name(name));
		for (WebElement option : options) {
			if (option.isSelected()) {
				return option.getAttribute("value");
			}
		}
		return null;
	}


}
