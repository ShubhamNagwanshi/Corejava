package in.com.batch;

public class TypeCast {
public static void main(String[]args) {
//	byte b = 100;
//	short s = b;
//	int i = s;
//	long l = i;
//	float f = l;
//	double d = f;
//	System.out.println(s);
//	System.out.println(i);
//	System.out.println(l);
//	System.out.println(f);
//	System.out.println(d); // implicit type cast
	
	double d  = 100.0;
	short s = (short) d;
	System.out.println(s);
	
}
}
