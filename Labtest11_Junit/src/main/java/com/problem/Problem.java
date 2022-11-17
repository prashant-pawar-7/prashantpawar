package com.problem;

import java.util.ArrayList;

public class Problem {
	public static ArrayList<Integer> l1;
	public int add(int n1,int  n2)
	{
		return n1+n2;

	}
	
	public int multiply(int n1,int  n2)
	{
		return n1*n2;

	}public boolean isPalindrome(String s) {
		s=s.toLowerCase();
		String t="";
		for (int i = s.length()-1; i >=0 ; i--) {
			t+=(s.charAt(i));
		}
		if (s.equals(t)) {
			return true;
		}
		else {
			return false;
		}
	}
	  public void fillList() {
		 l1 =new ArrayList<Integer>();
		  l1.add(10);
		  l1.add(20);
		  l1.add(30);
		  l1.add(40);
		  l1.add(50);
	}
	  
	
}
