package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver; 
	
	public static void getBrowser(String browsername) {
	try {
		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
			driver = new ChromeDriver();
			}
		
		else if(browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
			driver = new EdgeDriver();
			}
		
		} catch (Exception e) {
				e.printStackTrace();
		       }
		driver.manage().window().maximize();
	    }
			
	    	public static void geturl(String url) {
				try {
					driver.get(url);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	    	
			public static void sendKey(WebElement elements,String value) {
				try {
					elements.sendKeys(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void navigateTo(String navigate) {
				try {
					driver.navigate().to(navigate);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			public static void navigateForward() {
				try {
					driver.navigate().forward();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void navigateBack() {
				try {
					driver.navigate().back();
				} catch (Exception e) {
					e.printStackTrace();
					}
			}
			
			public static void navigateRefresh() {
				try {
					driver.navigate().refresh();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void conceptClick(WebElement element) {
				element.click();
			}
			
			public static void currentUrl() {
				driver.getCurrentUrl();
			}
			
			public static void getTitle() {
				driver.getTitle();
			}
			
			public static void mouseOver(WebElement element) {
				try {
					Actions ac = new Actions(driver);
					ac.moveToElement(element).perform();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void mouseClick(WebElement element) {
				try {
					Actions ac = new Actions(driver);
					ac.contextClick(element).perform();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void mouseDrag(WebElement element) {
				try {
					Actions ac =new Actions(driver);
					ac.dragAndDrop(element, element).perform();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public static void screenShot() throws Throwable {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File srcFile = ts.getScreenshotAs(OutputType.FILE);
				File desFile = new File("C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Screenshot");
				FileUtils.copyFile(srcFile, desFile);
			}
			
			public static void robClass() throws Throwable {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
			}
			
			public static void selectValue(WebElement element,String value) {
				Select sc = new Select(element);
				sc.selectByValue(value);
			}
			
			public static void selectText(WebElement element,String value) {
				Select sc = new Select(element);
				sc.selectByVisibleText(value);
			}
			
			public static void frameConcept(WebElement element) {
				driver.switchTo().frame(0);
			}
			
			public static void alertBox(WebElement element) {
				element.click();
				driver.switchTo().alert().accept();
			}
			
			public static void alertWithCancel(WebElement element) {
				element.click();
			}
			
			public static void confirmAlert(WebElement element) {
				element.click();
				driver.switchTo().alert().accept();
			}
			
			public static void remove(WebElement element) {
				element.click();
			}
			
			public static void quitWindow() {
				driver.quit();
			} 
			
			public static void 	closebrowser() {
				driver.close();
			}
}			