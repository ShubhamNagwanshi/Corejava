package in.com.practice;

import in.com.interface1.LoginException;

public class TestLogIn {
public static void main(String[] args)throws LoginException {
	
	String name = "Rays";
	
	if(name.contentEquals("Rays")) {
		System.out.println("Valid user");
	}
	else {
		LoginException e = new LoginException();
		
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e2);
			System.out.println(e2.getMessage());
			e.printStackTrace();
		}
	}
}
}
