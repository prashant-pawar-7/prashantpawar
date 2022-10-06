package labtest;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {   // main method
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();          //String input
		isPalindrome(string);              //method call
		scanner.close();
	}

	 static void isPalindrome(String s) {       //method for checking palindrome
		s=s.toLowerCase();               //converting String to lowercase
		String ss="";
		for (int i=s.length(); i>0; i--) {
			ss +=s.charAt(i-1);          //concating letters in reverse
			}
		if (s.equals(ss)) {              //checking if both string's content is same
			System.out.println('"'+s+'"'+" is Palindrome String");
		} else {
          System.out.println('"'+s+'"'+" is not Palindrome String");
		}
	}

}
