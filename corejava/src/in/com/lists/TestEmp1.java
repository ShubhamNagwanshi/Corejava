package in.com.lists;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp1 {
public static void main(String[] args) {
	
	ArrayList<Employee1> emp = new ArrayList();
	
	emp.add(new Employee1(5,"Deepesh","123456"));
	emp.add(new Employee1(10,"Aman","123451"));
	emp.add(new Employee1(1,"Shubham","123450"));
	emp.add(new Employee1(6,"Gopal","123458"));
	emp.add(new Employee1(12,"Nikhi", "123459"));
	
	//System.out.println(emp);
	
	Collections.sort(emp,new ComparatorById());
	System.out.println(emp);
	
	ArrayList<Employee1> emp1 = new ArrayList(emp);
	
	Collections.sort(emp1,new ComparatorByName());
	
	System.out.println(emp1);
}

}
