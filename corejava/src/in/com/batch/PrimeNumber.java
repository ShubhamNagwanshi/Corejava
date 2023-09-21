package in.com.batch;

public class PrimeNumber {
//public static void main(String[]args) {
//	int num = 20;
//	int count = 0;
//	for (int i = 2; i<num; i++) {
//		if (num%2==num) {
//			count++;
//			
//		}
//	}
//	if (count==0) {
//		System.out.println("Prime number");
//	}
//	else
//		
//		System.out.println("Not Prime number");
//}
//
//}
	 public static void main(String[] args) {
	        int number = 23; // Replace this with the number you want to check

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }

	        // Check from 2 to the square root of num
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}
	




