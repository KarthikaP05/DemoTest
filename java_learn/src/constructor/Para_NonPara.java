package constructor;

public class Para_NonPara {
	public Para_NonPara() {									//Nonparameterised
		System.out.println("Employee Name: Karthika");	
	}
	public Para_NonPara(char var,int id) {					//Parameterised
		System.out.println("Employee Id: "+var+","+id);
	}
	public static void main(String[] args) {
		Para_NonPara p = new Para_NonPara();
		Para_NonPara p1 = new Para_NonPara('E',21);
	}
}