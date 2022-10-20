package problem3;

public class ShopMain {

	public static void main(String[] args) {
		Producer p1=new Producer();  //producer instance
		Demand d1=new Demand(p1);   //demand thread instance
		Supply s1=new Supply(p1);    //supply thread instance
		d1.start();   //Starting demand thread
		s1.start();   //starting supply thread
	}

}
