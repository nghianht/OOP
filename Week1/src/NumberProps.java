
public class NumberProps {
	public static boolean isPrime(int k){
        for(int i = 2; i < k-1; i++) {
        	if(k % i == 0)
        		return false;
        }
        return true;
    }
    
}
