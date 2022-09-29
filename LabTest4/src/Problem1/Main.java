package Problem1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bank A");
		Bank a = new BankA();
		System.out.println("Available Balance : "+a.getBalance());
		
		System.out.println("\nBank B");
		Bank b = new BankB();
		System.out.println("Available Balance : "+b.getBalance());
		
		System.out.println("\nBank C");
		Bank c = new BankC();
		System.out.println("Available Balance : "+c.getBalance());
	}

}
