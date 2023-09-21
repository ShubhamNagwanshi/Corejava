package in.com.threads;

public class TestMyThreads {
public static void main(String[] args) {
	
    MyThread t1 = new MyThread();
	
	Thread tr = new Thread(t1);
	
	MyAnotherThread m1 = new MyAnotherThread();
	
	tr.start();
	m1.start();
}
}
