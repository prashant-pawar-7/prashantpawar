
public class Prime {

	public static void main(String[] args) {
		PrimeNumber();
	}

	 static void PrimeNumber() {
		 int i=2,n=20,j;
	for (i = 2; i <=n; i++) {
	   for (j = 2; j <i; j++) {
		  if (i%j==0)
			break;
	    }if (j==i)
		System.out.println(j);
	}
  }
}
