package ifelse_and_or_not;

public class Or_ex {
	public static void main(String[] args) {
		int n = 10;
		if(n<=10 || n==15) {				//  a  b  ans 
			System.out.println("True");		//	0  0  0
		}									//	0  1  1
		else {
			System.out.println("False");
		}
	}	
}