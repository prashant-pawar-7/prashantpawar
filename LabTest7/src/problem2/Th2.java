package problem2;

public class Th2 extends Thread{ //Th2 thread
	private Activity ac;
	public Th2() {
		super();
		
	}
	public Th2(String name) {
		super(name);
		
	}
	public Th2(Activity ac) {  //Th2 parameterized constructor setting object of activity
		super();
		this.ac = ac;
	}
	
  public void run() {  //run method
  ac.reverseNos();   //calling reverse no
    }
public Activity getAc() {
	return ac;
}
public void setAc(Activity ac) {
	this.ac = ac;
}
}
