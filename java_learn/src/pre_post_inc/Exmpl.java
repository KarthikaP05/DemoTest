package pre_post_inc;

public class Exmpl {
public static void main(String[] args) {
	int n=100;
		System.out.println(n++);		//prints 100 stores incremented value 101
		System.out.println(n++);		//prints 101 stores incremented value 102
		System.out.println(++n);		//Pre-increments 1 to 102 so prints 103
		System.out.println(++n);		//Pre-increments 1 to 103 so prints 104
		System.out.println(n++);		//prints 104 stores incremented value 105
		System.out.println(n++);		//prints 105 stores incremented value 106
		System.out.println(++n);		//Pre-increments 1 to 106 so prints 107
		System.out.println(++n);		//Pre-increments 1 to 107 so prints 108
		System.out.println(n++);		//prints 108 stores incremented value 109
		System.out.println(++n);		//Pre-increments 1 to 109 so prints 110
		System.out.println(n++);		//prints 110 stores the incremented value 111
		System.out.println(n++);		//prints 111 stores the incremented value 112
		System.out.println(++n);		//Pre-increments 1 to 112 so prints 113
		System.out.println(++n);		//Pre-increments 1 to 113 so prints 114
		System.out.println(n++ + ++n);	//n++ stores incremented value 115; ++n stores the Pre-incremented value 115; now 115+115=230
}
}