package in.com.batch;

public class TestAtm {
	public static void main(String[]args) {
Atm a = new Atm();
a.setBalance(10000);
a.deposite(1500);
a.withdraw(6000);
}
}