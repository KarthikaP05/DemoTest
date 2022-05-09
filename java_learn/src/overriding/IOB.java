package overriding;

public class IOB extends SBI {
	public void loan() {
		super.loan();
		System.out.println("Loan:200000");
	}
	public void intrest() {
		super.intrest();
		System.out.println("Intrest:1.5%");
	}
public static void main(String[] args) {
	IOB b = new IOB();
	b.loan();
	b.intrest();
	}
}