import java.util.*;
public class ThreeSort {
	public static int middle(int a, int b, int c) {
		if(a == b)
			return a;
		if(a == c)
			return a;
		if(b == c)
			return b;
		else {
			if(a != Math.max(Math.max(a, b),c) && a != Math.min(Math.min(a, b),c))
				return a;
			if(b != Math.max(Math.max(a, b),c) && b != Math.min(Math.min(a, b),c))
				return b;
			if(c != Math.max(Math.max(a, b),c) && c != Math.min(Math.min(a, b),c))
				return c;
			return 0;
			}
		
	}
	public static void main(String args[]) {
		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		System.out.print(Math.min(Math.min(a, b),c)+" ");
		System.out.print(middle(a, b, c) +" ");
		System.out.print(Math.max(Math.max(a, b),c)+" ");
		System.out.println();
	}
}
