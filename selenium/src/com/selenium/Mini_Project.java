package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
	login.click();
	
	WebElement mail = driver.findElement(By.id("email"));
	mail.sendKeys("nkarthikaprabhakar235@gmail.com");
	
	WebElement password = driver.findElement(By.id("passwd"));
	password.sendKeys("Sri#2705");
	
	WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	signin.click();
	
	WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
	women.click();
	
	WebElement dress = driver.findElement(By.linkText("Dresses"));
	dress.click();
	
	WebElement casdress = driver.findElement(By.linkText("Casual Dresses"));
	casdress.click();
	
	WebElement catalog = driver.findElement(By.xpath("//p[text()='Catalog']"));
	catalog.click();
	
	WebElement size = driver.findElement(By.xpath("//span[text()='Size']"));
	size.click();
	
	WebElement medium = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	medium.click();
	
	WebElement color = driver.findElement(By.xpath("//span[text()='Color']"));
	color.click();

	WebElement orange = driver.findElement(By.xpath("//input[@type='button']"));
	orange.click();
	
	WebElement chosendress = driver.findElement(By.xpath("//img[@itemprop='image']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(chosendress).perform();
	
	WebElement cart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
	ac.moveToElement(cart).perform();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", cart);
	Thread.sleep(2000);
	
	WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	proceed.click();
	
	WebElement scrolldown = driver.findElement(By.xpath("//a[text()='My account']"));
	js.executeScript("arguments[0].scrollIntoView();", scrolldown);
	
	WebElement proceedone = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	proceedone.click();
	
	WebElement address = driver.findElement(By.name("processAddress"));
	address.click();
	
	WebElement finalproceed = driver.findElement(By.id("cgv"));
	finalproceed.click();
	
	WebElement carrier = driver.findElement(By.name("processCarrier"));
	carrier.click();
	
	WebElement paycheck = driver.findElement(By.xpath("//a[@class='cheque']"));
	paycheck.click();

	WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	confirm.click();
}
}