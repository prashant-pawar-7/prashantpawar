

public class Alternate {
     public int[] printAddArray(int[] m,int[] n) {
    	int[] result=new int[m.length+n.length];
    	int i=0,k=0,j=0;
    	while (i<m.length && j<n.length) {
			result[k++]=m[i++];
			result[k++]=n[j++];
		}
    	while (i<m.length) {
			result[k++]=m[i++];
		}
    	while (j<n.length) {
			result[k++]=n[j++];
		}
    	return result; 
    	
  }
	public static void main(String[] args) {
		Alternate aa=new Alternate();	
	int[] a={11,33,55,77,99};
	int[] b= {22,44,66,88};
	int[] result=aa.printAddArray(a, b);
	for (int i : result) {
		System.out.print(i+" ");
	}
	}

}
