package in.com.hardio;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader1 {
public static void main(String[] args)throws Exception {
	
	FileReader file  = new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\Shubham.txt");
	
	BufferedReader reader = new BufferedReader(file);
	
	String line = reader.readLine();
	
	while(line != null) {
		System.out.println(line);
		line = reader.readLine();
	}
	reader.close();
	file.close();
}
}

