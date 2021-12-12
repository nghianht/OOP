import java.util.Scanner;
class NPerfects
{
   public static boolean isPerfect(int n)
    {
        if(n <= 0)
    		return false;
        
    	else {
    		int sum = 0;
        	for(int i = 1; i < n/2 +1 ;i++ ) {
        		if(n % i == 0) {
        			sum = sum + i;
        		}
        	}
        	if(sum == n)
        		return true;
        	return false;
    	}               
    }
   
    static void printNPerfect(int n)
    {
    	String s = "";
    	for(int i = 1 ; i < n ; i ++) {
    		if(isPerfect(i)) {
    			s = s + i + " ";
    			
    		}
    	}
    	System.out.println(s);
    }
    public static void main (String args[])
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Nhap n");
    	int n = s.nextInt();
    	printNPerfect(n);
    }
}