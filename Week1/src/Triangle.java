import java.util.Scanner;

class Triangle
{
    static boolean isTriangle(double a, double b, double c)
    {
        // begin edit 
        if(a + b <= c || b +c <= a || a + c <= b)
        	return false;
        return true;
        //end edit
    }
    static double getArea(double a, double b, double c)
    {
        // begin edit 
        if(isTriangle(a,b,c)) {
        	double p = (a+b+c)/2;
        	double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        	return s;
        }
        return 0;
        //end edit         
    }
    public static void main(String [] args)
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Nhap canh a");
    	double a = s.nextDouble();
    	System.out.println("Nhap canh b");
    	double b = s.nextDouble();
    	System.out.println("Nhap canh c");
    	double c = s.nextDouble();
    	System.out.println(getArea(a,b,c));
    	
    }
}