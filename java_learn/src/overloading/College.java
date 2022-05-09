package overloading;

public class College {
	public void student(String name) {
		System.out.println("Student name:"+name);
	}
	public void student(char initial) {
		System.out.println("Student Initial:"+initial);
	}
	public void student(int id) {
		System.out.println("Student id:"+id);
	}
	public void student(int id,String name,int idd) {
		System.out.println("Student Rollno:" +id+","+name+","+idd);
	}
	public void student(int id , float num ) {
		System.out.println("Student mark:"+ id+ "," +num);
	}
	public static void main(String []args) {
		College c = new College();
		c.student("Karthika");
		c.student('P');
		c.student(8);
		c.student(17,"BIT",108);
		c.student(17,99.8f);
		}
}
