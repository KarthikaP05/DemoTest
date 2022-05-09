package variables_types;

public class Local_var {	//class
public void studid() {		//method
	int n = 8; 				//the variable inside the method is called local variable
	System.out.println(n);
}
public static  void main(String[] args) {	//main
	Local_var v = new Local_var();			//creating object to call method
	v.studid();								//calling method
}
}