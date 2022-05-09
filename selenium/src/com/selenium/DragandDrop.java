package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/drop.html");
	driver.manage().window().maximize();
	
	WebElement from = driver.findElement(By.id("draggable"));
	WebElement to = driver.findElement(By.id("droppable"));
	Thread.sleep(2000);
	Actions a = new Actions(driver);
	a.dragAndDrop(from, to).perform();
}
}