package in.com.batch;

public class TestShape {
public static void main( String[]args) {
	Shape s = new Shape ();
//	System.out.println(s.getBorderWidth());
//	System.out.println(s.getColor());
//	
	s.setColor("Blue");
	s.setBorderWidth(100);
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
}
}
