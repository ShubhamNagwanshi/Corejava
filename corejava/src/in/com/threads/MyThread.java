package in.com.threads;

public class MyThread implements Runnable {

	@Override
	public void run() {
	
		for (int i = 0; i < 11; i++) {
			System.out.println("MyThread value = "+i);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
