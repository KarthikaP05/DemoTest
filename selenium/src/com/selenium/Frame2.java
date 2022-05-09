package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	WebElement sdown = driver.findElement(By.xpath("//a[text()='Help']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", sdown);
	Thread.sleep(3000);
	
	WebElement oframe = driver.findElement(By.id("navFooter"));
	driver.switchTo().frame(oframe);
	
	WebElement iframe = driver.findElement(By.xpath("(//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine'])[1]"));
	driver.switchTo().frame(iframe);
	
	WebElement box = driver.findElement(By.xpath("//a[@class='icp-button']"));
	driver.switchTo().frame(box);
}
}