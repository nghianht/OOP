import java.util.*;
public class Array {
	public static boolean check(int[] a) {
		int count = 0;
		for(int i = 0; i < a.length - 1	; i++) {
			if(a[i] *a[i+1] >= 0)
			count++;
		}
		if(count == 0)
			return true;
		return false;
	}
	public static boolean checkPrime(int a) {
		int count = 0;
		if(a <= 3)
			return true;
		for(int i = 2; i < a/2; i++) {
			if(a%i == 0)
				count++ ;
			}
		if(count == 0)
			return true;
		return false;
	}
	public static void printA(int[] a) {
		for(int i= 0; i < a.length; i++) {
			if(checkPrime(a[i])) {
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int size;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		}
		
		
	}
}
