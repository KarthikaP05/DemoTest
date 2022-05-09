package it_dept;

public class Stdnt_det {
	public void name() {
		System.out.println("Name of the Student : Sri");	
		}
    public void id() {
    	System.out.println("Student Id : 08");
    }
    public void contact() {
    	System.out.println("Ph.no : 9876543210");
    }
public static void main(String[] args){
	//classname obj=new classname
	Stdnt_det sd = new Stdnt_det();
	sd.name();
	sd.id();
	sd.contact();
}
}