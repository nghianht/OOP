import java.util.Scanner;
//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong
class PerfectNumber
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
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = s.nextInt();
        if(isPerfect(n))
        	System.out.println("true");
        else
        	System.out.println("false");
    }
    
}