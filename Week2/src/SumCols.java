import java.util.Scanner;

public class SumCols {
	public static int[][] inputMatrix(Scanner scan, int m, int n) {
		int[][] a = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		return a;
	}
	public static int[] sum(int[][] a, int m, int n) {
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[i] = 0;
			for(int j = 0; j <m; j++) {
				b[i] += a[j][i]; 
			}
		}
		return b;
	}
	public static void printMatrix(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] a = inputMatrix(scan, m, n);
		int[] b = sum(a, m ,n);
		printMatrix(b);
	}
}
