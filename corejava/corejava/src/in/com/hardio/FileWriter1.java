package in.com.hardio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
public static void main(String[] args) throws Exception {
	
	FileWriter writer = new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\NK.txt");
	
	writer.write("Hello world");
	writer.write("There is nothing worth");
	writer.close();
	
	System.out.println("Data write successfully");
	
}
}
