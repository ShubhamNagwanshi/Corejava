package in.com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
public static void main(String[] args) {
	List list= new ArrayList();
	
	list.add("Michael Jaykishan");
	list.add(7);
	list.add(10);
	list.add('b');
	list.add("one");
	list.add(5,"Naman");
	
	System.out.println(list.get(4));
	System.out.println(list);
	
	List list1 = new ArrayList();
	list1.add(list);
	
	System.out.println(list1);
	
	List l3 = new ArrayList();
	
	l3.add(15);
	l3.add("Shubham");
	l3.add("AB");
	l3.add("One");
	
//	l3.remove(2);
//	System.out.println(l3);
	
//	l3.set(2, "AA");
//	System.out.println(l3);
	
	//System.out.println(l3.subList(1, 3));
	//System.out.println(l3.indexOf("Shubham"));
	System.out.println(l3.lastIndexOf("AB"));
	
}
}
