package collections;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {			//prints in random order
public static void main(String[] args) {
	Set<Object> s = new HashSet<>();
	s.add(14);
	s.add(23);
	s.add("prabha");
	s.add(16);
	s.add(27);
	s.add(27);				//don't accept duplicate value
	s.add(null);
	s.add(null);			//allows single null
	System.out.println(s);
}
}