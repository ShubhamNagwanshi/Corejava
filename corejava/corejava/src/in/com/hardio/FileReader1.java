package in.com.hardio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
public static void main(String[] args) throws IOException {
	
	FileReader reader = new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\CONTENT\\Shubham.txt");
	
	int ch = reader.read();
	while(ch != -1) {
		System.out.print((char)ch);
		ch = reader.read();
	}
	reader.close();

}
}
