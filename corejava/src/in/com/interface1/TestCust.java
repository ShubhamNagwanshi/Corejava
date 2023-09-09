package in.com.interface1;

public class TestCust {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Customer c1 = new Customer("Shubham");
	Customer c2 = (Customer) c1.clone();
	
	c2.name = "Hardeep";
	c2.a.balance = 150750;
	
	System.out.println("Original");
	System.out.println("Name ="+ c1.name);
	System.out.println("Balance ="+ c1.a.balance);
	
	
	System.out.println("Duplicate Cloneable");
	System.out.println("Name = "+ c2.name);
	System.out.println("Balance="+ c2.a.balance);
	
	
}
}
