import java.util.*;
public class AddArray {
	public static int[] inputArray(Scanner scan, int n)
	{
	
		int array[] = new int[n];

		for(int i =0; i < n; i ++)
		{
			array[i] = scan.nextInt();
		}
		return array;
	}
	public static int[] sumArray(int[] a, int[] b, int n) {
		int[] c = new int[n];
		for(int i= 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
	public static void printArray(int array[])
	{
		
		for(int i =0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = inputArray(scan,n);
		
		int[] b = inputArray(scan,n);
		int[] c = sumArray(a,b,n);
		printArray(c);
	}
}
