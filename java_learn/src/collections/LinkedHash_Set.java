package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash_Set {		//prints in insertion order
public static void main(String[] args) {
	Set<Object> s = new LinkedHashSet<>();
	s.add(14);
	s.add(14);		//not aloows duplicate
	s.add("prabha");
	s.add(16);
	s.add(null);
	s.add(null);		//allows single null
	System.out.println(s);
}
}
