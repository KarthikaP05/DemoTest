package Maven.Karthi;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft {
	
	@Test
	private void asse_soft() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthika\\eclipse-workspace\\Karthi\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		
		String expectedResult = "http://www.amazon.in/";
		System.out.println(expectedResult);
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualResult, expectedResult);
		s.assertAll();   // --> Only in soft assert
		
		//assertEquals(actualResult, expectedResult);
	}
}