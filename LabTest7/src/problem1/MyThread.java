package problem1;

public class MyThread extends Thread {        //class MyThread and extending it with thread class
	
	//string array which contain 10 friends names
	String[] s= {"Prashant","Sagar","Pradip","Vipul","Gaurav","Kunal","Bhavesh","Darshana","Kaveri","Pranav"};

	public void run() {       //Overrided run method 
	
	//for loop to print names	
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
	}
}
}
