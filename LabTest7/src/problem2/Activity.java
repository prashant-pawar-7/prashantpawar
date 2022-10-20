package problem2;

public class Activity {
	 synchronized public void fibonacci() { // method to print first 10 terms of fibonacci series
    	 int a=0,b=1;
   	  System.out.print("First 10 terms of Fibonacci series are : "+a+" "+b);
   	  for (int i =2; i <10; i++) {
   		int c=a+b;
   		System.out.print(" "+c);
   		a=b;
   		b=c;
   	}
   	  System.out.println();
	}
	 synchronized public void reverseNos() {  //method to reversenos from 1 to 10
		  System.out.println("Numbers from 1 to 10 in reverse order : ");
		   for (int i = 10; i >0; i--) {
			System.out.print(i+" ");
		}
	 }

}
