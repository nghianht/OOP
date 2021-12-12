import java.util.Scanner;

public class ComputerTest {
	
	private Computer computers[];
	private int n;
	
	// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
	public void input(Scanner scan)
	{
		n = Integer.parseInt(scan.nextLine());
		computers = new Computer[n]; 
		for(int i = 0 ; i < n; i++) {
			String name = scan.nextLine();
			String manu = scan.nextLine();
			int year = Integer.parseInt(scan.nextLine());
			String detail = scan.nextLine();
			double price = Double.parseDouble(scan.nextLine());
			computers[i] = new Computer(name, manu, year, detail, price);
		}
	}
	
	// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
	public void output()
	{
		for (Computer computer : computers) {
			System.out.println(computer.toString());
		}
	}
	
	// Trả về giá trung bình của các máy tính
	public double getAvgPrice()
	{
		double sum= 0;
		for (Computer computer : computers) {
			sum += computer.getPrice();
		}
		return sum/n;
	}
	
	// In ra các máy tính có giá cao nhất
	public void getMaxPrice()
	{
		double max = Double.MIN_VALUE;
		for (Computer computer : computers) {
			if(computer.getPrice() > max)
				max = computer.getPrice();
		}
		for (Computer computer : computers) {
			if(computer.getPrice() == max) {
				System.out.println(computer.toString());
			}
		}
	}
	
	// In ra các máy tính có nhà sản xuất là Dell
	public void getDell()
	{
		for (Computer computer : computers) {
			if(computer.getManu().equals("Dell"))
				System.out.println(computer.toString());
		}
		
	}
	
	// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
	public void sort()
	{
		for(int i = 0; i < n-1;i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(computers[i].getPrice() > computers[j].getPrice()) {
					Computer t = computers[i];
					computers[i]= computers[j];
					computers[j] = t;
				}
			}
		}
		for (Computer computer : computers) {
			System.out.println(computer.toString());
		}
	}
	
	public static void main(String[] args) {
		
	}

}