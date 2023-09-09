package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
public static void main (String[]args) throws ParseException {
	String str = "17/08/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Person p = new Person();
	
	p.setName("Shubham");
	p.setId(10);
	p.setDob(sdf.parse(str));
	
	System.out.println(p.getDob());
	System.out.println(p.getName());
	System.out.println(p.getId());
	
	
}
}
