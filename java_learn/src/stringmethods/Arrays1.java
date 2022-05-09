package stringmethods;

public class Arrays1 {
	public static void main(String[] args) {
		/*int n[] = new int[5];
		n[0]=10;
		n[1]=20;
		n[2]=30;
		n[2]=35;	//duplicate index but over rides the value
		n[3]=40;
		n[4]=50;*/
		//System.out.println(n[2]);
		//System.out.println(n[4]);
		int n [] = {10,20,30,40,50};
		String s[]=new String[3];
		s[0]="hi";
		s[1]="90";
		System.out.println(s[0]);
		System.out.println(s[1]);
		for (int i=0; i< n.length;i++) {
			System.out.println(n[i]);
		}
}
}