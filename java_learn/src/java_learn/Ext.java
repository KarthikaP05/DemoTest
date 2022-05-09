package java_learn;

public class Ext extends Learn {
public void mark1() {
	System.out.println("Mark 1:90");
}
public static void mains(String[] args) {
	Ext e = new Ext();
	e.mark1();
	e.name();
}
}