
public class Sum {

	public static void main(String[] args) {
		System.out.print("Sum from 1 to 100 = ");
        System.out.println(addNumber());
	}
	// addNumber adds number from 1 to 100
	 static int addNumber(){
		int sum=0;
	for (int j =1; j <=100; j++) {
		sum+=j;
	}
		return sum;
	}

}
