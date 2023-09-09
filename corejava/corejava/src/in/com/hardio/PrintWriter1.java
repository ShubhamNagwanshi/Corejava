package in.com.hardio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
public static void main(String[] args) throws Exception {
	
	FileWriter file = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\kk.txt");
	
	PrintWriter out = new PrintWriter(file);
	
	out.println("Second line filewriter");
	out.println("Use PrintWriter");
	out.println("simple");
	
	file.close();
	out.close();
}
}
