package com.testing.pageobjects.updatetodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListTodopage {

	private WebDriver driver;

	public ListTodopage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// get description for a id

	public String getDescription(String id) {
		return driver.findElement(By.id("desc-" + id)).getText();
	}
	// get target date for a id
	public String getTargetDate(String id) {
		return driver.findElement(By.id("targetdate-" + id)).getText();
	}
	// click update for a id
	public void clickUpdateFor(String id) {
		driver.findElement(By.id("update-" + id)).click();
	}
	// delete a id
	public void clickDeleteFor(String id) {
		driver.findElement(By.id("delete-" + id)).click();
	}

}
