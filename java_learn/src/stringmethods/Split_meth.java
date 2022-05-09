package stringmethods;

public class Split_meth {
public static void main(String[] args) {
	String s = "For the people by the people of the people";
	
	String[] splt = s.split(" ");
	for (String st:splt) {
		System.out.println(st);
	}
}
}