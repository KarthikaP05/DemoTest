package variables_types;

public class Dummy {
public static int b = 10;
public void studid() {
	int b = 11;
	System.out.println(b);
}
public static void main(String[] args) {
	Dummy d = new Dummy();
	System.out.println(b);
	d.studid();
}
}