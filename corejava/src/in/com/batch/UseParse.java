package in.com.batch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseParse {

public static void main(String[]args) throws ParseException {
	
	String str = "12/11/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date = sdf.parse(str);
	System.out.println(date);
}
}
