
public class Prime {

	public static void main(String[] args) {
		primeNumber();

	}

   static void primeNumber() {
		int i=1,n=20,j;
		for (i = 2; i <=n; i++) {
			for ( j = 2; j < i; j++) {
				if(i%j==0)
					break;
			}
			if (j==i) {
				System.out.println(i);
			}
		}
	}

}
