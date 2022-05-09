package keyword;

public class Current extends Parent {
	int i = 8;		//current class level reference 
public void studid() {
	int j =20;
	System.out.println("loc var="+j);
	System.out.println("Current class="+this.i);
	System.out.println("Parent class="+super.n);
}
public static void main(String[] args) {
	Current c = new Current();
	c.studid();
}
}