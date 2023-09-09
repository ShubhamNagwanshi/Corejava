package in.com.interface1;

public class TestException {
public static void main(String[] args) {
	
	int a = 10;
	int b = 0;
	
	System.out.println("Main method start");
	
	try {
		int c = a/b;
		
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
	
	System.out.println("Main method close");
}
}
