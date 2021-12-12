import java.util.*;
public class XoaCot {
	public static int[][] imputMatrix(Scanner scan,int m,int n) {
		int[][] a = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		return a;
	}
	public static void printMatrix(int [][]a) {		
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
				System.out.println();
			}
		}
	}
	public static int[][] copyRightMatrix(int[][]a, int k,int n){
		int[][] c = new int[a.length-1-3][n];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i][j] = a[k+i+1][j];
			};
		}
		return c;
	}
	public static int[][] copyLeftMatrix(int[][]a, int k,int n){
		int[][] c = new int[k][n];
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j];
			}
		}
		return c;
	}
	public static int[][] concatMatrix(int[][]a, int[][] b){
		int[][] c = null;
		for(int i = 0; i < a.length;i++) {
			for(int j = 0; j < a[0].length; j++)
				c[i][j] = a[i][j];
		}
		for(int i = 0; i < b.length;i++) {
			for(int j = 0; j < b[0].length; j++)
				c[i+a.length][j] = b[i][j];
		}		
		return c;
	}
	
	public static int[][] deleteColumn(int[][]a, int k,int n){
		if(k==0)
			return copyRightMatrix(a, k,n);
		if(k==a.length)
			return copyLeftMatrix(a, k, n);
		else
			return concatMatrix(copyLeftMatrix(a, k, n),copyRightMatrix(a, k,n));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[][] a = imputMatrix(scan,m,n);
		int[][] b = deleteColumn(a,k,n);
		printMatrix(b);
		
	}
}
