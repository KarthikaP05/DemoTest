package abstraction;

public class PA_Details extends Partial_Abstract {
	public void emppass() {
		System.out.println("Employee Password: ********");
	}
	public static void main(String[] args) {
		PA_Details p = new PA_Details();
		p.empname();
		p.empid();
		p.emplogin();
		p.emppass();
	}
}