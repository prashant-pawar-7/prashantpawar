package problem3;

public class Demand extends Thread{//demand thread
private Producer p1;//producer object
public Demand(Producer p1) { // Constructor setting producer value
		super();
		this.p1 = p1;
	}

public Demand() {   //parent class constructor
		super();
		}

public Demand(String name) {   //parent class constructor
		super(name);
	}
public void run(){   //run method
	p1.demand(500);  //calling producer demand method
}

}
