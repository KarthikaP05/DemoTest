package collections;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
	public static void main(String[] args) {
		
		Map<Integer,Object> m =new HashMap<>();
		
		m.put(1, 10);
		m.put(2, "hi");
		m.put(3,null);
		m.put(4,null);
		m.put(5, 'k');
		m.put(null,3);
		m.put(null,7);
		System.out.println(m);
}
}