package in.com.hardio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\MM.text");
	
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e = (Employee) in.readObject();
		
		System.out.println("EmpId = "+ e.empId);
		System.out.println("Name = "+e.name);
		System.out.println("Salary = "+e.salary	);
		System.out.println("Bonus = "+e.bonus);
		System.out.println("Total = "+e.total);
		
		file.close();
		in.close();
	}

}
