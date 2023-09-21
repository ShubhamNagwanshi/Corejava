package in.com.threads;

public class TestThr {
public static void main(String[] args) {
	
	MyThread t1 = new MyThread();
	
	Thread tr = new Thread(t1);
	
	tr.start();
}
}
