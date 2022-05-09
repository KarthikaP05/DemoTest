package Maven.Karthi;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Sample_RetryCls {
	
	
	@Test
	private void UsernameValidation() {
		 Assert.assertEquals("Hello", "Hi");
	}
	
	@Test
	private void passwordValidation() {
		Assert.assertEquals("Karthi", "Sri");
	}
}
