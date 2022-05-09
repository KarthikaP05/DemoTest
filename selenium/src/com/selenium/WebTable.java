package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		System.out.println("**********Data**********");
		List<WebElement> fulldata = driver.findElements(By.xpath("//table[@id='customers']"));
		for(WebElement data : fulldata) {
			System.out.println(data.getText());
		}
		System.out.println("**********Data Line by Line**********");
		List<WebElement> datalbl = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for(WebElement data : datalbl) {
			System.out.println(data.getText());
		}
		System.out.println("**********Coloumn**********");
		List<WebElement> coloumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for(WebElement data : coloumn) {
			System.out.println(data.getText());
		}
		System.out.println("**********Row**********");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
		for(WebElement data : row) {
			System.out.println(data.getText());
		}
		System.out.println("*********Particular Data**********");
		List<WebElement> singledata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
		for(WebElement data : singledata) {
			System.out.println(data.getText());
		}
		System.out.println("**********Particular Heading**********");
		List<WebElement> singlehead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th[3]"));
		for(WebElement data : singlehead) {
			System.out.println(data.getText());
		}
}
}