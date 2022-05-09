package Maven.Karthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testcases_InnCount {
	public static WebDriver driver;
	
	@Test
	private void Flipkart() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	}
	
	@Test(priority = -1, invocationCount = 2)
	private void Facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	private void amazon() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}
	
	@Ignore
	@Test()
	private void Google() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
	}
	
}