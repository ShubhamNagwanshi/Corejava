package in.com.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter2 {
public static void main(String[] args) throws Exception {
	
	FileWriter file = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\nn.txt");
  
	PrintWriter out = new PrintWriter(file);
	
	out.println("Write something");
	out.println("Nothing to write");
	out.println("Just write something");
	
	file.close();
	out.close();
	
	System.out.println("Data enter successfully");
	
}
}
