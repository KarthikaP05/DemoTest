package Maven.Karthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test(dataProvider = "credentials")
	private void Facebook(String data1,String data2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("data1");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("data2");
	}
	
	@DataProvider(name = "credentials")
	private String[][] login() {
		return data;
	}
	
	String[][]data= {
			{"Invalidusername","Invalidpassword"},
			{"Validusername","Invalidpassword"},
			{"Invalidusername","Validpassword"},
			{"Validusername","Validpassword"}
	};
}
