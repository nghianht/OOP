import java.lang.Math.*;
import java.util.*;
public class Exp{
    public static int giaiThua(int n) {
      	if(n <= 1)
    		return 1;
    	else
    		return n * giaiThua(n - 1);
    }
    public static double dblExp(double x, int n){
    	double sum = 1;
    	for(int i = 1; i <= n; i++) {
    		sum = sum + Math.pow(x, i)/giaiThua(i);
    	}
    	return Math.round(sum * 1000.0)/1000.0;
    }
    
    public static void main(String args[]){
       double x;
        int n;
        x = Double.parseDouble(args[0]);
        n = Integer.parseInt(args[1]);
        System.out.println(dblExp(x,n));
    
    
    }
}