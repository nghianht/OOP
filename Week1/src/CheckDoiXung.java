import java.util.Scanner;

public class CheckDoiXung {
	public static boolean check(int n) {	
		int a = 0;
		int n1 = n;
		while(n1 != 0) {
			int digit = n1 %10;
			a = a*10 + digit;
			n1 /= 10;
		}
		if(a == n)
			return true;
		else 
			return false;		
	}
//	public static int checka(int n) {	
//		int a = 0;
//		while(n != 0) {
//			int digit = n %10;
//			a = a*10 + digit;
//			n /= 10;
//		}
//		return a;		
//	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap n");
		int n = s.nextInt();
		System.out.println(check(n));
//		if(checka(n)== n)
//			System.out.println("true");
//		else
//			System.out.println("false");
	}
}
