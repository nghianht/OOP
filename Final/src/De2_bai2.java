/**
 * Hoàn thiện các phương thức trong lớp De2_bai2 theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * Có thể bổ sung các phương thức khác nếu cần.
 * */
import java.util.Scanner;

public class De2_bai2{

    /*  thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader){
     // bổ sung mã lệnh - Có thể thay giá trị trả về đúng với kiểu được yêu cầu   
       int m = reader.nextInt();
       int n = reader.nextInt();
       int[][] ar = new int[m][n];
       for(int i =0; i < m; i++) {
    	   for(int j = 0; j < n; j++) {
    		   ar[i][j] = reader.nextInt();
    	   }
       }
    	return ar;
    }
    
    /* thực hiện việc in mảng hai chiều Mtr ra màn hình dạng ma trận */
    public static void printMatrix(int[][] Mtr) {
        // bổ sung mã lệnh
    	for(int i = 0; i < Mtr.length; i++) {
    		for(int j = 0; j < Mtr[0].length; j++) {
    			System.out.print(Mtr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    
    /* thực hiện kiểm tra trong ma trận Mtr có tồn tại hai dòng trực giao với nhau */
    public static boolean isRowsOrthgonal(int[][] Mtr){
        // bổ sung mã lệnh - Có thể thay giá trị trả về đúng với kiểu được yêu cầu 
    	int m = Mtr.length;
    	int n = Mtr[0].length;
        for(int i = 0; i<m-1; i++) {
        	for(int j = 1; j < m; j++) {
        		int b = 0;
        		for(int k = 0; k < n; k++) {
        			b += Mtr[i][k]*Mtr[j][k]; 
        		}
        	if(b == 0)
        		return true;
        	}
        }
    	return false;
    } 
    
    /*  thực hiện tìm và trả về giá trị lớn nhất trong các phần tử cột thứ k của Mtr (chỉ số chiều thứ hai). */
    public static int maxColsMember(int[][] Mtr, int k) {
        // bổ sung mã lệnh - Có thể thay giá trị trả về đúng với kiểu được yêu cầu 
        int max = Mtr[0][k];
        for(int i= 0; i < Mtr.length; i++) {
        	if(Mtr[i][k] > max)
        		max = Mtr[i][k];
        }
    	return max;        
    }
    
    /* thực hiện việc tính và in giá trị lớn nhất trong phần tử các cột của Mtr ra màn hình */
    public static void printColsMax(int[][] Mtr) {
        // bổ sung mã lệnh
    	int[] cols = new int[Mtr[0].length];
    	for (int i : cols) {
			i =0;
		}
    	for(int i = 0; i < Mtr[0].length; i++) {
    		cols[i] = Mtr[0][i];
    		for(int j = 0; j < Mtr.length; j++) {
    			if(Mtr[j][i] > cols[i])
    				cols[i] = Mtr[j][i];
    		}
    	}
    	for (int i : cols) {
			System.out.print(i+" ");
			
		}
    	System.out.println();
    }
    
}
