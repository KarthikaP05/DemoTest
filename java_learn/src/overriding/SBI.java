package overriding;

public class SBI extends IDBI{
	public void loan() {
		super.loan();
		System.out.println("Loan:300000");
	}
	public void intrest() {
		super.intrest();
		System.out.println("Intrest:3%");
	}
public static void main(String[] args) {
	SBI b = new IOB();
	b.loan();
	b.intrest();
	}
}