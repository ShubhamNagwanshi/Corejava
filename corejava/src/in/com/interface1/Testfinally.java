package in.com.interface1;

public class Testfinally {
public static void main(String[] args) {
	
	int a = 10;
	int b = 0;
	
	try {
		int c = a/b;
		System.out.println("Division"+ c);
	} catch (Exception e) {
		System.out.println(e);
		System.out.println();
	}
	finally {
		System.out.println("Finally Block");
	}
}
}
