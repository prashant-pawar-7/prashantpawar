package problem3;

public class Producer {
 private int availableProduct=70;
 synchronized public void demand(int d) {  //demand method
	if (availableProduct<d) {
		System.out.println("Available products are "+availableProduct);
		System.out.println("Your demand is : "+d+"\nSo wait for some time!");
		try {
			wait();  //wait until other thread executes
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	availableProduct-=d;
	System.out.println("Your order has been placed!");
}
 synchronized public void supply(int s) {   //supply method
		availableProduct+=s;
		System.out.println("Now available products are : "+availableProduct);
		notify();  //notify first thread
}
}
