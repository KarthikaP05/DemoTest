/*package stringmethods;

public class Immutable {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer ("Karthika");		
		StringBuffer  s1 = new StringBuffer  ("Karthika");
		StringBuffer  s2 = new StringBuffer ("Prabhaharan");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("********After Concatenate********");
		StringBuffer  s3 = s.append(s1);
		System.out.println(System.identityHashCode(s3));
	}
}*/

package stringmethods;

public class Mutable {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder ("Karthika");		
		StringBuilder  s1 = new StringBuilder  ("Karthika");
		StringBuilder  s2 = new StringBuilder ("Prabhaharan");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		System.out.println("********After Append********");
		
		StringBuilder  s3 = s.append(s1);
		System.out.println(System.identityHashCode(s3));
	}
}