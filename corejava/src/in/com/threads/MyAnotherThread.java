package in.com.threads;

public class MyAnotherThread extends Thread{


		public void run() {
			
			for (int i = 10; i >=0; i--) {
				System.out.println("MyAnotherThread ="+ i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				
			}
		}
		}

}