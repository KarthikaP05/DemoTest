package keyword;

public final class Final_Method_Var {	//final class
public final void studname() {			//final method
	final String s = "Sri";				//final variable
	System.out.println(s);
}
public static void main(String[] args) {
	Final_Method_Var v = new Final_Method_Var();
	v.studname();
}
}