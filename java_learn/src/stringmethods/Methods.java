package stringmethods;

public class Methods {
public static void main(String[] args) {
	String s ="Welcome To Java Class";
	int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals("Welcome to Java Class");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to java class");
	System.out.println(equalsIgnoreCase);
	
	char charAt = s.charAt(5);
	System.out.println(charAt);
	
	int indexOf = s.indexOf('o');
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf('c');
	System.out.println(lastIndexOf);
	
	boolean contains = s.contains("Java");
	System.out.println(contains);
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);

	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	boolean startsWith = s.startsWith("W");
	System.out.println(startsWith);
	
	boolean endsWith = s.endsWith("v");
	System.out.println(endsWith);
	
	String replace = s.replace('W', 'c');
	System.out.println(replace);
	
	String replace2 = s.replace("Java", "Python");
	System.out.println(replace2);
	
	String substring = s.substring(7);
	System.out.println(substring);
	
	String substring2 = s.substring(3,11);
	System.out.println(substring2);
}
}