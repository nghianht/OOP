import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AthleteManager {

	/* Khởi tạo một ArrayList có kiểu Athlete
	 * Khai báo một biến Scanner đọc dữ liệu từ tệp có tên filename
	 * Đọc n
	 * Đọc từng thuộc tính của một Athlete
	 * Khởi tạo một đối tượng Athlete với các thuộc tính vừa đọc được từ file
	 * Add vào ArrayList
	 * */
	public static ArrayList<Athlete> readFile(String filename)
	{
		ArrayList<Athlete> aths = null;
		try {
			Scanner s = new Scanner(new File(filename));
			int n = Integer.parseInt(s.nextLine());
			aths = new ArrayList<>();
			for(int i = 0 ; i < n; i++) {
				String name = s.nextLine();
				int year = Integer.parseInt(s.nextLine());
				String sport = s.nextLine();
				double weight = Double.parseDouble(s.nextLine());
				double height = Double.parseDouble(s.nextLine());
				Athlete a = new Athlete(name, year, sport, weight, height);
				aths.add(a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aths;
		
	}
	
	/*
	 * In dữ liệu của từng vận động viên sử dụng toString()
	 * Phương thức này không cần sửa gì
	 */
	public static void print(ArrayList<Athlete> aths)
	{
		for(Athlete a: aths)
		{
			System.out.println(a.toString());
		}
	}
	
	/*
	 * Tính chỉ số BMI của từng vận động viên
	 * BMI được tính theo công thức BMI = cân nặng/(chiều cao *chiều cao)
	 * Trong đó cân nặng được tính bằng kg, chiều cao được tính bằng m
	 * In mỗi chỉ số BMI với 3 chữ số sau dấu phẩy, mỗi chỉ số cách nhau một dấu tab (\t)
	 */
	public static void printBMIs(ArrayList<Athlete> aths)
	{
		//
		double[] bmi = new double[aths.size()];
		String[] s = new String[bmi.length];
		for(int i = 0; i < aths.size(); i++) {
			double a = aths.get(i).getBmi();
			double b = Math.round(a*1000.00)/1000.00;
			bmi[i] = b;
		}
//		for (double d : bmi) {
//			System.out.print(d+ "\t");
//		}
		for(int i =0 ; i < s.length; i++) {
			s[i] = String.format("%.5f", bmi[i]);
		}
		
		for(int i =0 ; i < s.length; i++) {
			bmi[i] = Double.parseDouble(s[i]);
		}
		for (double d: bmi) {
			System.out.print(d+"\t");
		}
	}
	
	/*
	 * Tìm và trả về các vận động viên có môn thi đấu là sport (với sport sẽ được truyền vào cụ thể khi gọi hàm)
	 */
	public static ArrayList<Athlete> findSport(ArrayList<Athlete> aths, String sport)
	{
		ArrayList<Athlete> sp = new ArrayList<>();
		for (Athlete athlete : aths) {
			if(athlete.getSport().equals(sport))
				sp.add(athlete);
		}
		return sp;
	}
	
	/*
	 * Tìm và trả về các vận động viên có chiều cao cao nhất
	 */
	public static ArrayList<Athlete> findAthlete(ArrayList<Athlete> aths)
	{
		ArrayList<Athlete> maxA = new ArrayList<>();
		double max = aths.get(0).getHeight();
		for (Athlete athlete : aths) {
			if(athlete.getHeight()>max)
				max = athlete.getHeight();
		}
		for (Athlete athlete : aths) {
			if(athlete.getHeight() == max)
				maxA.add(athlete);
		}
		return maxA;
	}
	/*
	 * Sắp xếp danh sách theo thứ tự từ điển của họ và tên (a-z)
	 * In ra danh sách sau khi sắp xếp
	 */
	public static void sort(ArrayList<Athlete> aths)
	{
		// Sắp xếp
		for(int i = 0; i < aths.size()-1; i++) {
			for(int j = 0; j < aths.size() - i -1; j++) {
				if(aths.get(j).getName().compareTo(aths.get(j+1).getName())>0){
					Collections.swap(aths, j, j+1);
				}
			}
		}
		
		
		// In danh sách sau khi sắp xếp
		print(aths);
	}
	
	// Hàm main không cần phải sửa gì
	
	public static void main(String[] args) {
		ArrayList<Athlete> aths = readFile("athletes.txt");
		print(aths);
		printBMIs(aths);
		System.out.println();
		print(findSport(aths, "Bong Chuyen"));
		print(findAthlete(aths));
		System.out.println("SORT: ");
		sort(aths);
	}
}
