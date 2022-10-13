package problem1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {    //main method
		Scanner s1=new Scanner(System.in);
		String string=s1.next();           //taking String input from user
		validateEmail_id(string);     //method call
		s1.close();    //closing scanner
		}
	// method to validate email-id
	public static void validateEmail_id(String s) {
		// regex for matching pattern
		boolean b=Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.(com|in)", s);
		try {
			//condition to throw exception
			if (b==false) {
				throw new InvalidMailIdException();
			}
			System.out.println("Email-Id : "+s);
		} 
		//catch block to catch exception
		catch (InvalidMailIdException ie) {
			System.out.println("Invalid email-id!");
		}finally {
	        System.out.println("Thank You!");
		}
		
		
	}

}
