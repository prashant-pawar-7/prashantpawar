package problem3;

public class Supply extends Thread{ //Supply thread
	private Producer p1;     //producer object
	public Supply(Producer p1) {  // Constructor setting producer value
			super();
			this.p1 = p1;
		}

	public Supply() {  //parent class constructor
			super();
			}

	public Supply(String name) {    //parent class constructor
			super(name);
		}
	public void run(){    //run method
		p1.supply(700);  //calling producer supply method
  }
}
