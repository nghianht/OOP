import java.util.*;
public class SortArray {

	public static void bubbleSort(int a[]) {
		
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = 0; j < a.length- i- 1; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1]= t;
				}					
			}
		}
		
	}

	public static int[] inputArray(Scanner scan, int n) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		return a;
	}
	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = inputArray(scan, n);
		bubbleSort(a);		
		printArray(a);
	}
}
