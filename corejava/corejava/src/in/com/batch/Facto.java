package in.com.batch;

public class Facto {
public static void main(String[] args) {
	int a = 1;
	int b = 1;
	
	while(a<=5) {
		b = b*a;
		a++;
	}
	System.out.println(b);
}
}
