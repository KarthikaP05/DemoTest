package it_dept;

public class Intmarks1 extends Stdnt_det{
	public void sub1() {
		System.out.println("Python : 80");
	}
	public void sub2() {
		System.out.println("Java : 83");
	}
	public void sub3() {
		System.out.println("PHP : 60");
	}
public static void main(String[] args) {
	Intmarks1 o = new Intmarks1();
	o.sub1();
	o.sub2();
	o.sub3();
	o.name();
	o.id();
	o.contact();
}
}