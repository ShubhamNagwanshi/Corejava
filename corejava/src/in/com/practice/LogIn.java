package in.com.practice;

import in.com.interface1.LoginException;

public class LogIn extends RuntimeException {

	public LogIn() {
		
		super("invalid user");
	}
}
