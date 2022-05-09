package collections;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {		//prints in ascending order
public static void main(String[] args) {
Set <Object> s = new TreeSet<>();
s.add(14);
s.add(14);	//not allows duplicate				//it allows only integer values i.e numbers
s.add(5);
s.add(23);
s.add(16);
s.add(27);
System.out.println(s);
}
}