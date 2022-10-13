package problem2;

import java.util.Scanner;

public class Main {            //main class
   public static void main(String[] args) {          //main method
	   
	   Scanner s1=new Scanner(System.in);    
		String string=s1.next();          //taking String input from user
		
		//calling method in a try catch block as it throws exception
		
		try {
			countVowels(string);    //method call
		} catch (Exception e) {   
			//exception message
			System.out.println("String should not contain letter 'X'");
		}
		
		s1.close();    //closing scanner
   }
   //end of main method
   // method to count vowel number and checks if string contains x or not
   
   public static void countVowels(String s) throws Exception {
	 
	   s=s.toLowerCase();    //convert string to lowercase
	 char c[]=s.toCharArray();   //converting string to character array
	 int count =0;     
	
	 for (int i = 0; i < c.length; i++) {
		//condition to check vowel
		if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
			count++;
		}
	}
	
	 System.out.println("No. of vowels in a string : "+count);  
	
	for (char d : c) {
		//condition to check if string contains x or not
			if (d=='x')
				throw new Exception();
		}
		
    }
   //end of countVovwel method
}
