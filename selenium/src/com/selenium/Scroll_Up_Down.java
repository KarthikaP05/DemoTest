package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement sdown = driver.findElement(By.xpath("//a[text()='Shipping']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", sdown);
	Thread.sleep(3000);
	
	WebElement sup = driver.findElement(By.xpath("//span[text()='Top Stories']"));
	js.executeScript("arguments[0].scrollIntoView();", sup);	
	
	//using pixel
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,6000)");
	
	Thread.sleep(3000);
	js.executeScript("window.ScrollBy(0,-4000)");
}
}
