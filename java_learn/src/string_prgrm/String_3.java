package string_prgrm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_3 {
public static void main(String[] args) {
	String s ="For the people by the people of the people";
	String[] splt = s.split(" ");
	Map<String,Integer> m = new LinkedHashMap<>();
	for(String st:splt) {
		if(m.containsKey(st)) {
			Integer i = m.get(st);
			m.put(st, i+1);
		}else {
			m.put(st, 1);
		}	
	}
	Set<Entry<String,Integer>> entrySet = m.entrySet();
	for(Entry<String,Integer>entry:entrySet) {
		System.out.println(entry);
	}
	//System.out.println(m);
}
}