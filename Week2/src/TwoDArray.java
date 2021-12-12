
import java.util.*;
public class TwoDArray {
	public static int [][] inputMatrix(Scanner scan){
		System.out.println("Nhap so hang");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Nhap so cot");
		int m = Integer.parseInt(scan.nextLine());
		int matrix[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.println("Nhap a["+i+"]["+j+"]=");
				matrix[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return matrix;
	}
	public static void printMatrix(int [][]a) {
		System.out.println("Matrix:");
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
				System.out.println();
			}
		}
	}
	public static int sumRow(int [][]a,int k) {
		int sum = 0;
		for(int i = 0 ; i < a[0].length; i++) {
			sum += a[k][i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
	}
}
