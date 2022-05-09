package exception_nd_handling;

import java.util.Scanner;

public class InputMisMatch_Exp {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Id:");
	int nextInt = s.nextInt();
	System.out.println(nextInt);		//if we give integers(i.e, numbers)the o/p will come but if we give other than integers no o/p
}
}
