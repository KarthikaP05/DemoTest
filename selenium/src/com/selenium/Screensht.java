package com.selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensht {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.linkedin.com/login");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	File deskFile = new File("C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Screenshot\\linkedin.png");
	FileUtils.copyFile(srcFile, deskFile);
}
}