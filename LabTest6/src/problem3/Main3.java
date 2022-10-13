package problem3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of values you have to pass");
		int i=sc.nextInt();
		int a[]=new int[i];
		for (int j = 0; j < a.length; j++) {
			a[j]=sc.nextInt();
		}
		sc.close();
		try {
			//a=null;
			if (a.length==0) {
				throw new IllegalArgumentException();
			}
			sum(a, a[0], a[a.length-1]);
		} catch (IllegalArgumentException e) {
			System.out.println("array length cant be zero");
		}catch (NullPointerException e) {
			System.out.println("You cannot initialize array as null");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of bound");
			}
		catch (Exception e) {
			System.out.println("sum is zero");
		}
		
	}
	public static int sum(int[] values, int start,int end)throws Exception{
		int sum =0;
		if(values==null) {
			throw new NullPointerException();
		}
		for (int i = 1; i < values.length-1; i++) {
			sum+=values[i];
		}
		System.out.println("Sum of array : "+sum);
		if (sum==0) {
			throw new Exception();		}
		
		
		return 0;
	}

}
