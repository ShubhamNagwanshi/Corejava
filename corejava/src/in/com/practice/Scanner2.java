package in.com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scanner2 {
public static void main(String[] args) throws Exception {
	
	FileReader file = new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\Shubham.txt");
	
	Scanner sc = new Scanner(file);
	
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
}
}
