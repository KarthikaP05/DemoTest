package com.selenium;

import org.openqa.selenium.	WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.navigate().to("http://gmail.com/");
	
	Thread.sleep(2000);
	driver.navigate().to("http://www.flipkart.com/");
	
	Thread.sleep(2000);
	driver.navigate().to("http://www.greenstechnologys.com/");
	
	Thread.sleep(2000);
	driver.navigate().back();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	Thread.sleep(2000);
	driver.navigate().forward();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
	
	driver.quit();
	
}
}
