package Maven.Karthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	public static WebDriver driver;
	
	@BeforeSuite
	private void Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	}
	
	@BeforeTest
	private void Chrome() {
		driver = new ChromeDriver();
	}
	private void Website() {
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeClass
	private void login() {
		System.out.println("login");
	}
	
	@BeforeMethod
	private void Signin() throws Throwable {
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	private void Testcase() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nkarthikaprabhaharan@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	@AfterMethod
	private void Accert() {
		System.out.println("accert");
	}
	
	@AfterClass
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterTest
	private void Close() {
		driver.close();
	}
	
	@AfterSuite
	private void Cookies() {
		driver.manage().deleteAllCookies();
	}
	
}