package in.com.lists;

import java.util.ArrayList;
import java.util.Collections;



public class Marks {
public static void main(String[] args) {
	
	ArrayList <Integer>marks = new ArrayList();
	marks.add(100);
	marks.add(99);
	marks.add(59);
	marks.add(23);
	marks.add(55);
	marks.add(56);
	
	System.out.println(marks);
	
	Collections.sort(marks);
	System.out.println(marks);
}
}
