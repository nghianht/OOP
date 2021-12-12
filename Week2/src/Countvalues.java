import java.util.Scanner;

public class Countvalues {
	public static int[] inputArray(Scanner scan, int n) {
		int[] a = new int[n];
		for(int i = 0 ; i < n; i++) {
			a[i] = scan.nextInt();
		}
		return a;
	}
	public static void printArray(int array[])
	{
		
		for(int i =0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

  public static int[] xoaPhantu(int A[], int k){
	  int[] b = new int[A.length-1];
		for(int i = k; i < A.length - 1; i++) {
			A[i] = A[i+1];
		}
		for(int i = 0; i < b.length; i++) {
			b[i] = A[i];
		}
		return b;
 }
	public static int[] duplicate(int[] a) {
	for(int i = 0 ; i < a.length-1; i++) {
		for(int j = i+1; j < a.length; j++) {
			if(a[i] == a[j]) {
				a = xoaPhantu(a, j);
				j--;
			}
		}
	}
	return a;
	
}
public static void printCount(int[] a) {
	int[] b = duplicate(a);
	int[] c = countArray(a);
	for(int i = 0; i < b.length; i++) {
		System.out.print(b[i]+":"+c[i]+" ");
	}
}
// private static int[] fArray(int[] a, int[] b) {
//	 	int[] c = new int[b.length];
//		for(int i = 0; i < c.length; i++) {
//			c[i]= 0;
//		}
//		for(int i = 0; i < c.length; i++) {
//			for(int j = 0; j < a.length; j++) {
//				if(b[i] == a[j]) {
//					c[i] = c[i] + 1;
//				}
//				
//			}
//		}
//		return c;
//}
	public static int[] countArray(int[] a) {
	int[] dup = duplicate(a);
	int[] b = new int[dup.length];
	for(int i = 0; i < b.length; i++) {
		b[i]= 0;
	}
	for(int i = 0; i < dup.length; i++) {
		for(int j = 0; j < a.length; j++) {
			if(dup[i] == a[j]) {
				b[i] += 1;
			}
		}
	}
	return b;
	
}
public static void main(String Args[]){
	 Scanner scan = new Scanner(System.in);
	 int n = scan.nextInt();
	 int[] a = inputArray(scan, n);
	 int[] b = duplicate(a);
	 int[] c = countArray(a);
	 printCount(a);
	 
 }	
}
