import java.util.Scanner;

public class PalindromeNumbers {
	//ham check doi xung
    public static boolean isPalindrome(int k)
    {
		int a = 0;
		int n = k;
		while(n != 0) {
			int digit = n %10;
			a = a*10 + digit;
			n /= 10;
		}
		if(a == k)
			return true;
		else 
			return false;

    }
    public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int m = s.nextInt();
    	if(n < m) {
    		for(int i = n; i <=m; i++) {
    			if(isPalindrome(i)) {
    				System.out.print(i+ " ");    				
    			}
    		}
    		System.out.print("\n");
    	}
    	if(m < n) {
    		for(int i = m; i <=n; i++) {
    			if(isPalindrome(i)) {
    				System.out.print(i+ " ");    				
    			}
    		}
    		System.out.print("\n");
    	}
    }
}
