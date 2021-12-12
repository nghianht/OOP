import java.util.Scanner;

public class GroupArray{
    
    // Định nghĩa hàm/phương thức groupArray() ở đây
    // .....  groupArray(.....)
    public static void printA(int[] arr) {
    	for (int i : arr) {
			System.out.println(i+" ");
		}
    }
    public static int[] converseA(int[] arr) {
		int[] arr1 = arr.clone();
		int i = 0;
		int j = arr1.length -1;
		while(i !=j) {
			if(arr1[i]%2 !=0 && arr1[j]%2==0) {
				j--;
			}
			if(arr1[i]%2 != 0 && arr1[j]%2!=0)
				i++;
			if(arr1[i]%2 != 0 && arr1[j]%2!=0)
				j--;
			if(arr1[i]%2 ==0 && arr1[j]%2!=0) {
				int t = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = t;
				i++;
				j--;
			}
		}
    	return arr1;
    	
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for(int i =0; i < n; i++) {
        	arr[i] = scan.nextInt();
        }
        int[] a = converseA(arr);
        printA(a);
        // ... editing 
    }
}