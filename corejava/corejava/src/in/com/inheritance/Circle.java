package in.com.inheritance;

public class Circle extends Shape {

	private int radius = 0;
	private final double PI = 3.14;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area() {
	double cArea = PI * getRadius()*getRadius();
    return cArea;
	}
}
