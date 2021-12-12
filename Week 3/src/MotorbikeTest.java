import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeTest
{
    public static void inputMotorbike (ArrayList<Motorbike> motorbikes, int n)
	{
    	Scanner s = new Scanner(System.in);
    	for(int i = 0; i < n; i ++) {
    	
	    	String id = s.nextLine();
	   		 String name = s.nextLine();
	   		 String manu = s.nextLine();
	   		 int quantity = Integer.parseInt(s.nextLine());
	   		 double price = Double.parseDouble(s.nextLine());
	   		 double weight = Double.parseDouble(s.nextLine());
	   		 String date = s.nextLine();
	   		 Motorbike motor = new Motorbike(id, name, manu, quantity, price, weight, date);
	   		 motorbikes.add(motor);
    	}
	}
	public static void ouputMotorbike (ArrayList<Motorbike> motorbikes)
	{	
		for(int i = 0; i < motorbikes.size(); i++) {
			System.out.println(motorbikes.get(i).toString());
		}
	}
	public static ArrayList<Motorbike> search (String manu, ArrayList<Motorbike> motorbikes)
	{
		ArrayList<Motorbike> a = new ArrayList<>();
		for (Motorbike motorbike : motorbikes) {
			if(motorbike.getManu().equals(manu))
				a.add(motorbike);
		}
		return a;
	}
	public static ArrayList<Motorbike> maxWeight (ArrayList<Motorbike> motorbikes)
	{
		double max = Double.MIN_VALUE;
		ArrayList<Motorbike> a = new ArrayList<>();
		for (Motorbike motorbike : motorbikes) {
			if(motorbike.getWeight() > max)
				max = motorbike.getWeight();
		}
		for (Motorbike motorbike : motorbikes) {
			if(motorbike.getWeight() == max)
				a.add(motorbike);
		}
		return a;
		
	}
	public static ArrayList<Motorbike> minQuanlity (ArrayList<Motorbike> motorbikes)
	{
		double min = Double.MAX_VALUE;
		ArrayList<Motorbike> a = new ArrayList<>();
		for (Motorbike motorbike : motorbikes) {
			if(motorbike.getQuantity() < min)
				min = motorbike.getQuantity();
		}
		for (Motorbike motorbike : motorbikes) {
			if(motorbike.getQuantity() == min) {
				a.add(motorbike);
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Motorbike> motorbikes = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		inputMotorbike(motorbikes, n);
		int c = Integer.parseInt(scan.nextLine());
		if(c<1 || c > 3) {
			System.out.println("ERROR");
		}
		if(c == 1) {
		
			ArrayList<Motorbike> a = search("Honda", motorbikes);
			ouputMotorbike(a);
		}
		if(c == 2) {
			
			ArrayList<Motorbike> a = maxWeight(motorbikes);
			ouputMotorbike(a);
		}
		if(c == 3) {
			
			ArrayList<Motorbike> a = minQuanlity(motorbikes);
			ouputMotorbike(a);
		}
	}
}