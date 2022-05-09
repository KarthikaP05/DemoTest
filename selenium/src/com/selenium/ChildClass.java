package com.selenium;

import org.openqa.selenium.By;

public class ChildClass extends BaseClass {
	public static void main(String[] args) throws Throwable {
		getBrowser("chrome");
		geturl("https://www.flipkart.com/");
		sendKey(driver.findElement(By.xpath("(//input[@type='text'])[2]")),"9944543706");
		sendKey(driver.findElement(By.xpath("//input[@type='password']")),"pooky235");
		conceptClick(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
		navigateTo("https://www.flipkart.com/");
		navigateForward();
		navigateBack();
		//Displayed(driver.findElement(null));
		currentUrl();
		screenShot();
	}
}