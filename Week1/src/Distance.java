import java.util.*;
import java.math.*;
public class Distance {
	public static double compute(double x1,double y1, double x2, double y2) {
		double a = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		return Math.round(a*100.0)/100.0;
	}
	public static void main(String args[]) {
		double x1, x2, y1, y2;
		x1 = Double.parseDouble(args[0]);
		y1 = Double.parseDouble(args[1]);
		x2 = Double.parseDouble(args[2]);
		y2 = Double.parseDouble(args[3]);
		
		System.out.println(compute(x1, y1, x2, y2));		
	}
}
