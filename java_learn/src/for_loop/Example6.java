package for_loop;

import java.util.Scanner;

public class Example6 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Number:");
	int n = s.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	}
}