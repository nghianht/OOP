	import java.io.BufferedInputStream;
	import java.io.BufferedOutputStream;
	import java.io.BufferedWriter;
	import java.io.EOFException;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Formatter;
	import java.util.Scanner;
	
	public class ComputerTest {
		
	    // hàm ghi ra file dưới dạng Object, trong đó filename là tên file truyền vào, coms là danh sách các Computer muốn ghi ra file
	 	public static void outputObject(String fileName, ArrayList<Computer> coms) {
	 		ObjectOutputStream buff = null;
	 		try {
				buff = new ObjectOutputStream(new FileOutputStream(fileName));
				for (Computer computer : coms) {
					buff.writeObject(computer);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		finally {
				try {
					buff.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	 	}
		
		public static void inputObject(String fileName, ArrayList<Computer> coms) {
			ObjectInputStream buff = null;
			try {
				buff = new ObjectInputStream(new FileInputStream(fileName));
				while(true) {
					try {
						Computer c  = (Computer) buff.readObject();
						coms.add(c);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} 
			catch(EOFException endoffile) {
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Hàm in ra màn hình thông tin của các máy tính trong danh sách computers
		public static void output(ArrayList<Computer> computers)
		{
			for(int i =0; i < computers.size(); i ++)
				System.out.println(computers.get(i).toString());
		}
		
		// Hàm trả về giá trung bình của các máy tính trong danh sách coms
		public static double getAvgPrice(ArrayList<Computer> coms)
		{
			double avg = 0;
			for (Computer computer : coms) {
				avg+= computer.getPrice();
			}
			avg = avg/coms.size();
			return avg;
		}
		
		// Hàm trả về các máy tính có giá lớn nhất
		public static ArrayList<Computer> getMaxPrice(ArrayList<Computer> coms)
		{
			double max = coms.get(0).getPrice();
			for (Computer computer : coms) {
				if(computer.getPrice()>max);
				max = computer.getPrice();
			}
			ArrayList<Computer> maxC = new ArrayList<>();
			for (Computer computer : coms) {
				if(computer.getPrice() == max)
					maxC.add(computer);
			}
			return maxC;
		}
		
		// Hàm trả về danh sách các máy tính có hãng sản xuất là Dell
		public static ArrayList<Computer> getDell(ArrayList<Computer> coms)
		{
			ArrayList<Computer> dell = new ArrayList<>();
			for (Computer computer : coms) {
				if(computer.getManu().equals("Dell")) {
					dell.add(computer);
				}
			}
			return dell;
		}	
		
		// Hàm sắp xếp tên theo thứ tự từ điển và in ra danh sách các máy tính sau khi sắp xếp
		public static void sort(ArrayList<Computer> coms)
		{
			for(int i = 0 ; i < coms.size()-1; i++) {
				for(int j = 0; j < coms.size()-i-1; j++) {
					if(coms.get(j).getName().compareTo(coms.get(j+1).getName())>0) {
						Collections.swap(coms, j, j+1);
					}
				}
			}
		}
		
		public static void main(String[] args) {
			ComputerTest test = new ComputerTest();
			ArrayList<Computer> newC = new ArrayList<>();
			test.inputObject("C:\\Users\\Admin\\eclipse-workspace\\BT\\src\\computer.dat", newC);
			ArrayList<Computer> dell = test.getDell(newC);
			for (Computer computer : dell) {
				System.out.println(computer.toString());
			}
		}
	
	}
