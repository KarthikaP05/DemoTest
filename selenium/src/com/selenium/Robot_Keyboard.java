package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Keyboard {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
	Actions ac = new Actions(driver);
	ac.contextClick(images).perform();	//rightclick in keyboard
	Thread.sleep(2000);
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);	
}}