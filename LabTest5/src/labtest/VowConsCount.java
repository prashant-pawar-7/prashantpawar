package labtest;
import java.util.Scanner;

public class VowConsCount {

	public static void main(String[] args) {      //main method
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();          //taking input from user
		count(str);
		sc.close();
	}
	static void count(String s) {          //count method
		s=s.toLowerCase();           //converting String to lowercase
		int count=0,count1=0;
		for (int i = 0; i < s.length(); i++) {
			//checks if String contain vowel and counts
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			      count++;
			}
			//checks if String contain consonant and counts
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){ 
                count1++;
			}
		}
		//printing no. of vowels and consonant
		System.out.println("Numbers of Vowels in the String : "+count);
		System.out.println("Numbers of Consonants in the String : "+count1);
	}

}
