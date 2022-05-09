package Maven.Karthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupTest {
public static WebDriver driver;
	
	@Test(groups = "Shopping")
	private void Flipkart() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	}
	
	@Test(groups = "Social")
	private void Facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	
	@Test(groups = "Shopping")
	private void amazon() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}
	
	@Test(groups = "Social")
	private void Instagram() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	}
}
