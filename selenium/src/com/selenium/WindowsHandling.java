package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
private static String data;

public static void main(String[] args) throws Throwable{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(2000);

WebElement Bestsellers = driver.findElement(By.linkText("Best Sellers"));
Thread.sleep(2000);

Actions ac = new Actions(driver);	//rightclick
ac.contextClick(Bestsellers).perform();

Robot r = new Robot();	//keyboard
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);

WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
ac.contextClick(Mobiles).perform();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);

WebElement Customerservice = driver.findElement(By.linkText("Customer Service"));
ac.contextClick(Customerservice).perform();
r.keyPress(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(2000);

String parentId = driver.getWindowHandle();	//parentid
System.out.println(parentId);

String parentTitle = driver.switchTo().window(parentId).getTitle();
System.out.println(parentTitle);

Set<String> Allid = driver.getWindowHandles();
for(String data : Allid) {
System.out.println(Allid);

String Alltitle = driver.switchTo().window(data).getTitle();
System.out.println(Alltitle);
}
}
}