import java.util.Scanner;

public class d1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so met can chuyen");
		float x = scan.nextFloat();
		float y = (float) (x * 39.3700787);		
		float a = (float) (Math.round(y*100)/100.0);
		System.out.println("So inches tuong ung la "+ a);		
	}
}
