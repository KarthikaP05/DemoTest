package Maven.Karthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Parameters({"data1","data2"})
	@Test
	private void facebook(String data1,String data2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("data1");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("data2");
	}
}