package pojo_class;

public class Pojo_Child {

	public static void main(String[] args) {
		
		Pojo_Main pm = new  Pojo_Main();	//child class
		pm.setS("Hello..!");
		System.out.println(pm.getS());
	}
}
