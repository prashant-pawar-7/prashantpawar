package labTest1;

public class Operation {

	public static void main(String[] args) {
		int i=20;
		int j=10;
		char c='%';
switch (c) {
case '+':
	System.out.println("addition of "+i+" & "+j+"="+(i+j));
	break;
case '-':
	System.out.println("subtraction of "+i+" & "+j+"="+(i-j));
	break;
case '*':
	System.out.println("multiplication of "+i+" & "+j+"="+(i*j));
	break;
case '/':
	System.out.println("division of" +i+" & "+j+"="+(i/j));
	break;
case '%':
	System.out.println("modulus of "+i+" & "+j+"="+(i%j));
	break;

default:
	System.out.println("invalid operation");
	break;
}
	}

}
