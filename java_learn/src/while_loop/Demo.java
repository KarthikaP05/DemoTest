package while_loop;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	int n = s.nextInt();
	while(n<=10) {
		System.out.println(n);
		n++;
	}
}
}
