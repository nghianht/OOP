import java.util.Scanner;

public class PrimesInArray {
	public static boolean checkPrime(int a) {
		int count = 0;
		if(a <= 1)
			return false;
		else if(a <= 3)
			return true;
		for(int i = 2; i <= a/2; i++) {
			if(a%i == 0)
				count++ ;
			}
		if(count == 0)
			return true;
		return false;
	}
	public static void printArray(int[] array) {
	
		for(int i =0; i < array.length; i++)
			if(checkPrime(array[i]))
				System.out.print(array[i] + " ");
		
	}
	public static int[] inputArray(Scanner scan, int n)
	{
	
		int array[] = new int[n];

		for(int i =0; i < n; i ++)
		{
			array[i] = scan.nextInt();
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int[] a = inputArray(scan,n);
		printArray(a);	
		
	}
}
