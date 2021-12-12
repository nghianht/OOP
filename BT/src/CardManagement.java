import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardManagement {

	
	public CardManagement()
	{
		super();
	}
	
	public ArrayList<Card> readData (String fileName)
	{
		ArrayList<Card> cards = null;
		
		try {
			Scanner s = new Scanner(new File(fileName));
			int n = Integer.parseInt(s.nextLine());
			cards = new ArrayList<>();
			for(int i = 0 ; i < n; i++) {
				int c = Integer.parseInt(s.nextLine());
				String id = s.nextLine();
				int year = Integer.parseInt(s.nextLine());
				double days = Double.parseDouble(s.nextLine());
				double price = Double.parseDouble(s.nextLine());
				if(c == 1) {
					double tax = Double.parseDouble(s.nextLine());
					StaffCard staff = new StaffCard(id, year, days, price, tax);
					cards.add(staff);
				}
				if(c == 0) {
					double fee = Double.parseDouble(s.nextLine());
					StudentCard student = new StudentCard(id, year, days, price, fee);
					cards.add(student);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cards;
		
	}
	
	public void printArrayList(ArrayList<Card> cards) {
		for (int i =0;i<cards.size();i++)
			System.out.println(cards.get(i).toString());
	}
	// Hoan thien phuong thuc findCards de tim nhung  xe co nam san xuat la year
	
	public ArrayList<Card> findCards (ArrayList<Card> cards, int year){
		//Begin editable part
		ArrayList<Card> find = new ArrayList<>();
		for (Card card : cards) {
			if(card.getYear()==year)
				find.add(card);
		}
		return find;
		//End editable part
	}
	
	// Hoan thien phuong thuc getMaxAmount de tim cac xe thuoc the loai typeOfCard
	public ArrayList<Card> getMaxAmount (ArrayList<Card> cards, String typeOfCard){
		//Begin editable part
		ArrayList<Card> maxC = new ArrayList<>();
		double max = Double.MIN_VALUE;
		for (Card card : cards) {
			String[] w = card.toString().split(" ");
			if(w[0].equals(typeOfCard)){
				if(card.getAmount() > max)
					max = card.getAmount();
			}
		}
		for (Card card : cards) {
			String[] w = card.toString().split(" ");
			if(w[0].equals(typeOfCard)){
				if(card.getAmount() == max)
					maxC.add(card);
			}
		}
		return maxC;
		//End editable part
	}
	
	
	// Hoan thien phuong thuc sortByAmount de sap xep cac xe theo thu tu giam dan
	public void sortByAmount (ArrayList<Card> cards) {
		//Begin editable part
		//End editable part
		for(int i = 0; i < cards.size()-1; i++ ) {
			for(int j = 0; j < cards.size()-i-1; j++) {
				if(cards.get(j).getAmount()<cards.get(j+1).getAmount())
					Collections.swap(cards, j, j+1);
			}
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CardManagement cardMng = new CardManagement();
		ArrayList<Card> cards = cardMng.readData("C:\\Users\\Admin\\Desktop\\data.txt");
		for (Card card : cards) {
			System.out.println(card.toString());
		}
	}

}
