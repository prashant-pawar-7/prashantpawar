import java.util.Arrays;

public class Matrix {
public int[][] multiplyArray(int[][]m,int[][]n) {
	int[][] result=new int[m.length][n[0].length];
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < n[0].length; j++) {
			for (int k = 0; k < n.length; k++) {
				
			result[i][j]+=m[i][k]*n[k][j];
			}
		}
	}
	return result;
}
	public static void main(String[] args) {
		Matrix m =new Matrix();
		int[][]a= {{1,2},{4,5}};
		int[][]b= {{7,8,9},{6,3,1}};
		int[][]result=m.multiplyArray(a, b);
		for (int[] is : result) {
			System.out.println(Arrays.toString(is));
		}
}
}
