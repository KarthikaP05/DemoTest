package exception_nd_handling;

import java.util.ArrayList;
import java.util.List;

public class Ind_OutBond_Exp {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<>();
	l.add(10);
	l.add(20);
	
	Integer i = l.get(2);		//get(1)
	System.out.println(i);
}
}
