package keyword;

public class Static_kw {
static{		//static block
	System.out.println("Karthi");
}
static int n = 10;	//static variable
public static void stuname() {	//static method
	System.out.println("Karthika");
}
public static void main(String[] args) {
	System.out.println("Hi");
	System.out.println(n);
	stuname();
}
}