package exception_nd_handling;

public class ArrInd_OutBond_Exp {
public static void main(String[] args) {
	int i[] = new int[2];
	i[0]=1;
	i[1]=2;
	System.out.println(i[2]); 		//i[1]
}
}