package in.com.interface1;

public class Exception2 {
public static void main(String[] args) {
	
	String name = "Shubham";
	
	System.out.println(name.length());
	try {
	
		System.out.println(name.charAt(2));
	} catch (Exception e) {
		
		System.out.println(e);
	}
}
}
