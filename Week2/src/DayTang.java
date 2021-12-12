import java.util.Scanner;

public class DayTang {
	public static int[] inputArray(Scanner scan, int n)
	{
	
		int array[] = new int[n];

		for(int i =0; i < n; i ++)
		{
			
			array[i] = scan.nextInt();
		}
		return array;
	}
	public static void check(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] < a[i+1]) 
				count++;
			
		}
		if(count == a.length-1)
			System.out.println("YES");
		else {
			System.out.println("NO");
			
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();	
		int[] a = inputArray(scan,n);
		check(a);
	}
}
