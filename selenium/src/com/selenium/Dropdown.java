package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		Thread.sleep(2000);
		s.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		Thread.sleep(2000);
		s1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		Thread.sleep(2000);
		s2.selectByValue("1999");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
		gender.click();
		
	}
}