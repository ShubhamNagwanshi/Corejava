package in.com.batch;

public class Amstrong {
public static void main(String[] args) {
	
	int a = 371;
	int b = 0;
	int c;
	int d = a;
	
	while(d>0) {
		c = d%10;
		b = b+ (c*c*c);
		d = d/10;
		
	}
	if(b==a) {
		System.out.println("This is an Armstrong Number");
	}
	else {
		System.out.println("This is not an Armstrong Number");
	}
}
}
