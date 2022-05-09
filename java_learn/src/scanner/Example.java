package scanner;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your address:");
	String address = s.nextLine();
	System.out.println("Your address: "+address);
	
	System.out.println("Enter Name:");
	String name = s.next();
	System.out.println("Your Name: "+name);
	
	System.out.println("Enter Department:");
	String dept = s.next();
	System.out.println("Your Department: "+dept);
	
	System.out.println("Enter Year of Studying:");
	int yos = s.nextInt();
	System.out.println("YOS: "+yos);
	
	}
}