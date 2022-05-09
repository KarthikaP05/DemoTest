package overriding;

public class IDBI {
	public void loan() {
		System.out.println("Loan:200000");
	}
	public void intrest() {
		System.out.println("Intrest:2%");
	}
public static void main(String[] args) {
	IDBI s = new SBI();
	s.loan();
	s.intrest();
	}
}