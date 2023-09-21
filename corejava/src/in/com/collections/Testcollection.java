package in.com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Testcollection {
public static void main(String[] args) {
	
	Collection c1 = new ArrayList();
	
	c1.add("Hardeep");
	c1.add(9);
	c1.add(78.9);
	c1.add('a');
	c1.add("sir");
	c1.add('b');
	
	//System.out.println(c1);
	
	Collection c2 = new ArrayList();
	
	c2.add("Shubham");
	c2.add(11);
	c2.add(79.8);
	c2.add('b');
	c2.add("Student");
	c2.add('c');
	
	//System.out.println(c2);
	
	//c1.addAll(c2);
	//System.out.println(c1);
	
	//c1.clear();
	//System.out.println(c1);
	//System.out.println(c1.containsAll(c2));
	
	
	//System.out.println(c1.isEmpty());
	//c1.iterator();
	//System.out.println(c1);
	
	//System.out.println(c1.iterator());
	
	//c1.remove(9);
	
	//System.out.println(c1);
//	c1.removeAll(c1);
//	System.out.println(c1);
	
//	c1.retainAll(c1);
//	System.out.println(c1);
	
	System.out.println(c1.size());
}
}
