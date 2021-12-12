public class Function {
		
	public static int sum(int[] a)
	{
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}	
	
	public static int[] findOdd(int[] a) {
		for (int i : a) {
			if( i%2 == 0)
				i = 0;
		}
		return a;
	}
	
	public static int[] findEven(int[] a) {
		for (int i : a) {
			if( i%2 != 0)
				i = -1;
		}
		return a;
	}
	
	public static int maxOdd(int[] a)
	{
		int[] b = findOdd(a);
		int max = b[0];
		for(int i = 0; i < b.length; i++) {
			if(max < b[i])
				max = b[i];
		}
		return max;
	}
	
	public static boolean checkZero(int[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0)
				return true;
				break;
		}
		return false;
	}
	public static int minEven(int[] a)
	{
		int min = Integer.MAX_VALUE;
		int[] b = findEven(a);
		if(checkZero(b))
			return 0;
		else {
			for(int i = 0; i < b.length; i ++){
				if(b[i] > 0 && b[i] < min) {
					b[i] = min;
				}
			}
			return min;
		}
	}
		
	public static boolean isCharContain(String s)
	{
		int len = s.length();
		Character[] arr = new Character[len];
		for(int i = 0; i < len; i++) {
			arr[i] = new Character(s.charAt(i));
		}
		for (Character character : arr) {
			if(Character.isLetter(character))
				return true;
		}
		return false;
	}
		
	public static boolean isNumContain(String s)
	{

		int len = s.length();
		Character[] arr = new Character[len];
		for(int i = 0; i < len; i++) {
			arr[i] = new Character(s.charAt(i));
		}
		for (Character character : arr) {
			if(Character.isDigit(character))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println("Tong cac phan tu trong mang la: "+sum(a));
		
		System.out.println("So le lon nha la: "+maxOdd(a));
		
		System.out.println("So chan mho nha la: "+minEven(a));
		
		String s = "a123abcbsbasdcaac3ABCXaxddsa";
		
		if(isCharContain(s))
			System.out.println("Xau co chua chu cai");
		else
			System.out.println("Xau khong chua chu cai");
		
		if(isNumContain(s))
			System.out.println("Xau co chua chu so");
		else
			System.out.println("Xau khong chua chu so");
		
		
	}

}