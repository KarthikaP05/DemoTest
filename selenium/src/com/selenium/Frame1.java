package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement oneframe = driver.findElement(By.name("SingleFrame"));
	oneframe.click();
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	WebElement textbox1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	textbox1.sendKeys("SELENIUM");
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent(); //out
	
	WebElement twoframes = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	twoframes.click();
	
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	driver.switchTo().frame(outerframe);
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	driver.switchTo().frame(innerframe);
	
	WebElement textbox2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	textbox2.sendKeys("selenium");
}
}