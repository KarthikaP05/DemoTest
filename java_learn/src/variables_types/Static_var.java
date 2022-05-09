package variables_types;

public class Static_var {
static int b=11;		//static variable
public void studid() {
	int b=13;			//local variable
	System.out.println(b);
}
public static void main(String[] args) {
	Static_var v = new Static_var();
	v.studid();
	System.out.println(b);	//static variable can be called without object inside the class
}
}