package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] aegs) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("nkarthikaprabhaharan@gmail.com");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("123");
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
}
}
