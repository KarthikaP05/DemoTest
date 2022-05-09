package type_cast;

public class narr_wide {
public static void main(String[] args) {
	byte a = 35;
	float b = a;
	System.out.println("Widening:"+b);
	
	byte c = (byte)b;
	System.out.println("Narrowing:"+c);
}
}
