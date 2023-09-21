package in.com.lists;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	
	ArrayList<Employee> e1 = new ArrayList<Employee>();
	
	e1.add(new Employee(1,"Harsh","676767"));
	e1.add(new Employee(10, "Shubham", "787878"));
	e1.add(new Employee(2, "Prachi", "67678"));
	e1.add(new Employee(4, "Nikhil", "89890"));
	e1.add(new Employee(0, "Gopal", "787890"));
	
	System.out.println(e1);
	
	Collections.sort(e1);
	System.out.println(e1);
	
	}
}
