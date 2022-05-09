package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	simplealert.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	WebElement okorcancel = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	okorcancel.click();
	Thread.sleep(2000);
	
	WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirmalert.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	WebElement textalert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	textalert.click();
	Thread.sleep(2000);
	
	WebElement prompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	prompt.click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().sendKeys("Have a nice day!");
	driver.switchTo().alert().accept();
	}
}