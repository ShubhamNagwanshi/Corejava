package in.com.threads;

public class ThreadMethods {
public static void main(String[] args) {
	
	System.out.println("Program Start");
	
	int x = 100+100;
	System.out.println("Sum is = "+ x);
	
	Thread t = Thread.currentThread();
	System.out.println(t.getName());
	
	t.setName("myThread");
	System.out.println(t.getName());
	
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		System.out.println(e);
	}
	System.out.println(t.getId());
	
	System.out.println("Program End");
}
}
