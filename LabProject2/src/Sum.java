
public class Sum {

	public static void main(String[] args) {
		System.out.print("sum of numbers from 1 to 20 = ");
		addNumber();
	}

	static void addNumber() {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
