package selection_stmnts;
import java.util.Scanner;

public class If_else_ex {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	int n = s.nextInt();
	
	
	if(n<=10) {
		System.out.println("Correct value");
	}
	else {
		System.out.println("Give the valid input");
	}
}
}