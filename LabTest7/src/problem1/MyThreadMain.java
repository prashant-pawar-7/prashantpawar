package problem1;

public class MyThreadMain {  //main class

	public static void main(String[] args) {   ///main method
		MyThread th1=new MyThread();  //instance 1 of MyThread
		MyThread th2=new MyThread();  //instance 2 of MyThread
		MyThread th3=new MyThread();  //instance 3 of MyThread
		th1.start();      //Starting instance 1
		th2.start();      //Starting instance 2
		th3.start();      //Starting instance 3
	}

}
