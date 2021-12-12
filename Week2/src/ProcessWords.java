import java.util.Scanner;
/** 
 * Chương trình xử lý xâu
 * */
public class ProcessWords{
    public static String[]  splitWords(String str){
        /* Hoàn thành phương thức để:
        Loại bỏ các ký tự trồng ở 2 đầu xâu, các khoảng trống liên tiếp
        ở giữa xâu thì chỉ được để lại 01 khoảng trống. Sau đó tách các "từ" - 
        tức là các cụm ký tự liên tiếp không chứa khoảng trống, đưa vào một mảng
        các xâu. Trả lại là mảng các xâu đó */
    	String[] s= str.split(" ");
    	return s;
    }
    
    public static void listMaxLength(String[] listWords){
        /* Hoàn thành phương thức để:
        Tìm và in ra các phần tử (xâu) có độ dài lớn nhất trong mảng các xâu listWords 
        trên 01 dòng, các phần tử cách nhau bởi đúng 01 khoảng trống. 
        Sau khi in xong cần xuống dòng.*/
    	int max = listWords[0].length();
    	for (String string : listWords) {
			if(string.length() > max) {
				max = string.length();
			}
		}
    	for (String string : listWords) {
			if(string.length()==max)
				System.out.print(string+" ");
		}
        System.out.println();  
    }
    
    public static void  sortListWords(String[] listWords){
        /*hoàn thành phương thức sắp xếp các phần tử  trong mảng các xâu listWords tăng dần theo thứ tự từ điển */
    	for(int i = 0; i < listWords.length-1; i++) {
    		for(int j = 0; i < listWords.length-i-1;j++) {
    			if(listWords[j].compareTo(listWords[j+1])>0) {
    				String t = listWords[j];
    				listWords[j] = listWords[j+1];
    				listWords[j+1] = t;
    			}
    		}
    	}
    }
    
    public static void main(String arg[]){
        // Không sửa đồi phương thức main()!
        
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.nextLine();            
        String st = sc.nextLine();
        
        String[] listWord = splitWords(st);
        int n = listWord.length;
        if(l == 0)
            System.out.println(n);
        else if(l == 1){
            for(int i=0; i<n; i++)
                System.out.print(listWord[i]+ " ");
            System.out.println();    
        }
        else if(l == 2){
            sortListWords(listWord);
            for(int i=0; i<n; i++)
                System.out.print(listWord[i]+" ");  
            System.out.println(); 
        }
        else
            listMaxLength(listWord);
    
    }
}