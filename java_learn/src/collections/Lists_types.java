package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lists_types {
public static void main(String[] args) {
	List<Object> l = new Vector<>();
	
	//converts all datatypes into class objects
	l.add("Karthi");
	l.add(23);
	l.add(99.9f);
	l.add('#');
	l.add(null);
	l.add("Prabha");
	System.out.println(l);
	
	List<Object> l2 = new ArrayList<>();
	l2.add(23);
	l2.add("Sri");
	l2.add(23);
	System.out.println(l2);
	
	//List Methods
	boolean contains = l.contains(23);
	System.out.println(contains);
	
	Object get = l.get(3);	//in get we've to give index values
	System.out.println(get);
	
	int indexOf = l2.indexOf(23);
	System.out.println(indexOf);
	
	l2.set(0, 5);
	System.out.println(l2);
	
	int size = l.size();
	System.out.println(size);
	
	l.remove(2);
	System.out.println(l);
	
	//l.removeAll(l2);
	//System.out.println(l);
	
	l.retainAll(l2);
	System.out.println(l);
	
	l.addAll(l2);
	System.out.println(l);
	
	l2.clear();
	System.out.println(l2);
	
	
}
}
