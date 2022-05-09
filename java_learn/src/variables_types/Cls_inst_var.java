/*package variables_types;

public class Cls_inst_var {
int b = 12;
public void studid() {}
public static void main(String[] args) {
	Cls_inst_var v = new Cls_inst_var();
	System.out.println(v.b);
	v.studid();
}
}*/


package variables_types;

public class Cls_inst_var {
int b ;					//there is no mandatory to assign value to class variable
public void studid() {
	//int b=13;
	//System.out.println(b);
}
public static void main(String[] args) {
	Cls_inst_var v = new Cls_inst_var();
	System.out.println(v.b);
	//v.studid(); 	//we call the class variable directly without this method line
}
}