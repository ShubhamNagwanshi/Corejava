package in.com.interface1;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("invalid user");
	}
}
