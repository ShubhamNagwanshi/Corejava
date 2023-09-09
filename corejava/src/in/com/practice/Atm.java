package in.com.practice;

public class Atm {

	private int balance = 0;
	
	public void setBalance (int balance){
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void deposite (int atm) {
		int total = getBalance()+ atm;
		setBalance(total);
		System.out.println("Balance after deposite ="+ getBalance());
	}
	public void withdraw (int atm) {
		int total = getBalance() - atm;
		
		if(total<2000) {
			System.out.println("Insufficient Balance!!!!!!");
		}
		else {
			setBalance(total);
			System.out.println("Balance after withdraw = "+ getBalance());
		}
	}
	
}
