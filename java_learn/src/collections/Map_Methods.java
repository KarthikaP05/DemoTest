package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;

public class Map_Methods {
public static void main(String[] args) {
	
	Map<Integer,Object> m =new LinkedHashMap<>();
	
	m.put(1, 10);
	m.put(2, "hi");
	m.put(3,null);
	m.put(null,3);
	m.put(null,7);
	
	Object object = m.get(2);
	System.out.println(object);
	
	boolean containsKey = m.containsKey(2);
	System.out.println(containsKey);
	
	boolean containsValue = m.containsValue(3);
	System.out.println(containsValue);
	
	int s = m.size();
	System.out.println(s);
	
	Set<Integer> n = m.keySet();
	System.out.println(n);
	
	Collection<Object> c = m.values();
	System.out.println(c);
	
	Set<Entry<Integer, Object>> entrySet = m.entrySet();
	System.out.println(entrySet);
	
	Set<Entry<Integer, Object>> es = m.entrySet();
	for(Entry<Integer,Object> entry: es) {
		System.out.println(entry);
	}
}
}