package string_prgrm;

import java.util.LinkedHashMap;
import java.util.Map;

public class String_1 {
public static void main(String[] args) {
	String s ="For the people by the people of the people";
	String[] splt = s.split(" ");
	Map<String,Integer> m = new LinkedHashMap<>();
	for(String st:splt) {
		m.put(st, 1);
	}
	System.out.println(m);
}
}
