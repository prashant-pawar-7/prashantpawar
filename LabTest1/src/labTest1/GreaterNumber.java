package labTest1;

public class GreaterNumber {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=10;
		if (a>b) {
			if (a>c) {
				System.out.println("a is greater :"+a);
			} else {
                  System.out.println("c is greater :"+c);
			}
		} else {
            if (b>c) {
            	System.out.println("b is greater :"+b);
			} else {
				System.out.println("c is greater :"+c);
			}
		}

	}

}
