package exception_nd_handling;

public class StrInd_OutBnd_Exp {
public static void main(String[] args) {
	String s = "Karthika";
	char charAt = s.charAt(8);		//(7)
	System.out.println(charAt);
}
}
