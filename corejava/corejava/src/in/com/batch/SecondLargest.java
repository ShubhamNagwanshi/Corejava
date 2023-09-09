package in.com.batch;

public class SecondLargest {
public static void main(String[]args) {
	int [] arr = {100, 200, 300, 400, 500};
	int a = 0;
	int b = 0;
	for (int i =0; i<arr.length; i++) {
		if (arr[i]>b) {
			a=b;
			b=arr[i];
		}
		
	}
	System.out.println(a);
}
}
