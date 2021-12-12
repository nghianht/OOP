import java.util.Scanner;

public class FindMinMax{
	public static void printArray(int[] array) {
		
		for(int i =0; i < array.length; i++)
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
    public static int findMin(int Array[]){
        int min;
        min = Array[0];
        for(int i = 0 ; i < Array.length; i++) {
        	if(Array[i]<min)
        		min = Array[i];
        }
        return min;
    	
    }
    
    public static int findMax(int Array[]){
        //editing here
    	int max = Array[0];
    	for(int i = 0; i < Array.length; i++) {
    		if(Array[i]>max)
    			max = Array[i];
    	}
    	return max;
    }
    
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = inputArray(scan,n);
		System.out.print(findMin(a)+" "+findMax(a));
    }
    
}