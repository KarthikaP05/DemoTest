package Maven.Karthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	public static WebDriver driver;
	
	@Test()
	private void Facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}	
	
	@Test()
	private void Amazon() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}
}