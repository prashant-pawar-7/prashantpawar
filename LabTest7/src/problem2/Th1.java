package problem2;

public class Th1 extends Thread{  //Th1 thread
	private Activity ac;
	public Th1() {
		super();
	}
	public Th1(String name) {
		super(name);
		
	}
	public Th1(Activity ac) { //Th1 parameterized constructor setting object of activity
		super();
		this.ac = ac;
	}
	
     public void run() { //run method
	 ac.fibonacci(); //calling fibonacci method from activity class
     }
 }
