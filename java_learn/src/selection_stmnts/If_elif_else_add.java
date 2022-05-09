package selection_stmnts;

public class If_elif_else_add {
public static void main(String[] args) {
	int i= 10;
	int j=20;
	if(i+j>30) {
		System.out.println("Odd months");
	}
	else if(i+j==30) {
		System.out.println("Even months");
	}
	else {
		System.out.println("February");
	}
}
}