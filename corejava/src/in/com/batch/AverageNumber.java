package in.com.batch;

public class AverageNumber {
public static void main(String[] args) {
	int n = 10;
	int sum = 0;
	int count = 0;
	int avg;
	for (int i = 1; i <=n; i++) {
	//Average of odd number
		if (i%2==1) {
			sum = sum+i;
			count++;
		}
	}
	avg = sum/count;
	System.out.println(avg);
}
}
