package in.com.batch;

public class Palindrome {
	public static void main(String[] args) {
		
	
  int a = 151;
  int b = a;
  int c = 0;
  int d;
  
  
  while(b>0) {
	  
	  d=b%10;
	  c=c*10+d;
	  b=b/10;
  }
  if (a==c) {
	  System.out.println("Yes this is palidrome");
	  }
  else {
	  System.out.println("not this is not");
  }

}
}