package stringmethods;

public class Immutable {
public static void main(String[] args) {
	String s = "Karthika";
	String s1 = "Karthika";
	String s2 = "Prabhaharan";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	
	System.out.println("********After Concatenation********");
	String s3 = s.concat(s1);
	System.out.println(System.identityHashCode(s3));
}
}