package Maven.Karthi;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test
	private void add() {
		System.out.println(10+10);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
		System.out.println(10/0);
	}
}