package labtest;

import java.util.Scanner;

public class DuplicateChars {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		isDuplicate(str);
		s.close();
	}

	 static void isDuplicate(String s) {
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)&& s.charAt(i)!=' ') {
					System.out.println(s.charAt(i));
					break;
				}
				if (s.charAt(i)==s.charAt(j)) {
					continue;
				}
			}
		}
	}

}
