package abstraction;

public class Full implements FullAbstract {
	public void stuid() {
		System.out.println("Student Name: Sri10");
	}

	public void stufee() {
		System.out.println("Student Fee:25000");
	}

	public static void main(String[] args) {
		Full f = new Full();
		f.stuid();
		f.stufee();
	}
}

/*package abstraction;

public class Full implements FullAbstract {
	public void stuid(String name,int id) {
		System.out.println("Student Name: "+id+","+name);
	}

	public void stufee(int fee) {
		System.out.println("Student Fee:"+fee);
	}

	public static void main(String[] args) {
		Full f = new Full();
		f.stuid("Sri",10);
		f.stufee(30000);
	}
}*/