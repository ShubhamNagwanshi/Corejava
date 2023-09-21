package in.com.lists;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v = new Vector();
	
	v.add("one");
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add("five");
	
	System.out.println(v);
	
	Enumeration e = v.elements()	;
	v.add("Hardeep");
	v.add("Shubham");
	v.add("three");
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
