package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement hello = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions ac = new Actions(driver);
	ac.moveToElement(hello).perform();
	
	WebElement signin = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
	ac.moveToElement(signin).perform();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", signin);
}
}