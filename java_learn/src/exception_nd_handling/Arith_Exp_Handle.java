package exception_nd_handling;

public class Arith_Exp_Handle {
	public static void main(String[] args) throws Throwable {
		System.out.println("Hii");
		Thread.sleep(1000);
		try {
			System.out.println(10/0);		//prgm doesnot wrok after exception so we've to use try catch
		} catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(1000);
		}finally {
		System.out.println("Hello");
	} 
}
}