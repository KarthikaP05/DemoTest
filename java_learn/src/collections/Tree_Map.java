package collections;

import java.util.TreeMap;
import java.util.Map;

public class Tree_Map {
	public static void main(String[] args) {
		
		Map<Integer,Object> m =new TreeMap<>();
		
		m.put(1, 10);
		m.put(3, "hi");
		m.put(4,null);
		m.put(2,null);
		m.put(5, 'k');
		System.out.println(m);
}
}