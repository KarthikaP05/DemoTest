package it_dept;

public class Intmarks2 extends Intmarks1 {
	public void sub4() {
		System.out.println("Mob Comp : 90");
	}
	public void sub5() {
		System.out.println("Soft Tes : 73");
	}
	public void sub6() {
		System.out.println("Web Tech : 67");
	}
public static void main(String[] args) {
	Intmarks2 t = new Intmarks2();
	t.sub4();
	t.sub5();
	t.sub6();
	t.sub1();
	t.name();
}
}