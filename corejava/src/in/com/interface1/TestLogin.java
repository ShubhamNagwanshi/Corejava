package in.com.interface1;

public class TestLogin {
public static void main(String[] args) throws LoginException {
	
	String name = "rays";
	
	if (name.contentEquals("ray")) {
		System.out.println("valid user");
	}
	else {
		LoginException e = new LoginException();
		
		try {
			throw e;
		} catch (Exception e2) {
			System.out.println(e2);
			System.out.println(e2.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
}
