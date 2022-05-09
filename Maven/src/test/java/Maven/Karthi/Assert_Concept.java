package Maven.Karthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	
	@Test
	private void assertConc() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\Karthi\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		
		String expectedResult = "http://www.amazon.in/";
		System.out.println(expectedResult);
		
		Assert.assertEquals(actualResult,expectedResult);
	}
}

/* Two types of Assert:
 		     Hard Assert -- When Assertion fails it will terminate the execution
 		     
 		     Soft Assert -- Even though the assertion fails it will continue execution      */