package in.com.batch;

public class PrimeNumber2 {
//	public static void main(String[]args) {
//		int num = 29;
//		int count = 0;
//		for (int i = 1; i<num; i++) {
//			if (num%2==0) {
//				count++;
//				
//			}
//		}
//		if (count==0) {
//			System.out.println("Prime number");
//		}
//		else
//			
//			System.out.println("Not Prime number");
//}
//}
	 public static void main(String[] args) {
	        int number = 8; // Replace this with the number you want to check

	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}
