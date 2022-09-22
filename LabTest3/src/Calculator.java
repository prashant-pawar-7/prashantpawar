
public class Calculator {
	public int addition(int... n1) {
		System.out.println("Addition of Integer : ");
		int sum=0;
		for (int i = 0; i < n1.length; i++) {
			sum +=n1[i];
		}
		return sum;
		
	}
	public double addition(double... n1) {
		System.out.println("Addition of Double : ");
		double sum=0;
		for (int i = 0; i < n1.length; i++) {
			sum +=n1[i];
		}
		return sum;
	}
	public int subtraction(int first,int... n1) {
		System.out.println("Subtraction of Integer : ");
		int diff=first;
		for (int i = 0; i < n1.length; i++) {
			diff -=n1[i];
		}
		return diff;
		
	}
	public double subtraction(double first,double... n1) {
		System.out.println("Subtraction of Double : ");
		double diff=first;
		for (int i = 0; i < n1.length; i++) {
			diff -=n1[i];
		}
		return diff;
	}
	public int multiplication(int... n1) {
		System.out.println("Multiplication of Integer : ");
		int mul=1;
		for (int i = 0; i < n1.length; i++) {
			mul *=n1[i];
		}
		return mul;
		
	}
	public double multiplication(double... n1) {
		System.out.println("Multiplication of Double : ");
		double mul=1;
		for (int i = 0; i < n1.length; i++) {
			mul *=n1[i];
		}
		return mul;
	}
	public int division(int first,int... n1) {
		System.out.println("Division of Integer : ");
		int div=first;
		for (int i = 0; i < n1.length; i++) {
			div /=n1[i];
		}
		return div;
		
	}
	public double division(double first,double... n1) {
		System.out.println("Division of Double : ");
		double div=first;
		for (int i = 0; i < n1.length; i++) {
			div /=n1[i];
		}
		return div;
	}
	public static void main(String[] args) {
     Calculator cal=new Calculator();
     
     System.out.println(cal.addition(1,2,3,4,5));
     System.out.println(cal.addition(6.0,7,8.0,9,10.0));
     
     System.out.println(cal.subtraction(20,2,4,5,3,1));
     System.out.println(cal.subtraction(100.0,15,20,30.0,10));
     
     System.out.println(cal.multiplication(8,2,3,4,5));
     System.out.println(cal.multiplication(6.0,7,8.5,9,10.0));
     
     System.out.println(cal.division(500,2,5,10));
     System.out.println(cal.division(700,2.0,7,15.15));
	}

}
