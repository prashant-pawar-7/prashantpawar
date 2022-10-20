package problem2;

public class ThMain {

	public static void main(String[] args) { //main method
		Activity ac=new Activity();   //activity instance
		Th1 th1=new Th1(ac);   //Th1 instance
		Th2 th2=new Th2(ac);   //Th2 instance
		th1.start();    //Th1 starts
		th2.start();    //Th2 starts
	}

}
