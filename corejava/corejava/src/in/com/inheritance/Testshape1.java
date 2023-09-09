package in.com.inheritance;

public class Testshape1 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		r1.setLength(12);
		r1.setWidth(17);
		r1.setBorderWidth(15);
		r1.setColor("jamuni");
		r1.area();
		
		
		System.out.println(r1.getBorderWidth());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
}
}
