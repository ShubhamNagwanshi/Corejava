
package in.com.inheritance;

public class TestShape {
public static void main (String[]args) {
	Shape[] s = new Shape [3];
	
	s[0] = new Rectangle();
	s[1] = new Circle();
	s[2] = new Triangle();
	
	Rectangle r = (Rectangle) s[0];
	r.setLength(10);
	r.setWidth(10);
	
	Circle c = (Circle) s[1];
	c.setRadius(6);
	
	Triangle t = (Triangle) s[2];
	t.setHeight(20);
	t.setBase(15);
	
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i].area());
	}
}
}

