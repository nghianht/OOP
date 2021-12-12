import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class CarManagement {
	
	// Hàm dựng 
	public CarManagement(){
		super();
	}
	
	// Phương thức readData() cho phép đọc dữ liệu từ tệp văn bản
	/*
	    Thứ tự nhập như sau:
	    - Nhập số lượng xe
	    - Trong vòng lặp với mỗi loại xe:
	       - Nhập 1 số nguyên c, c = 0 là ServiceCar, c = 1 là SportCar
	       - Nhập thông tin của các xe: id, name, manufacturer, hours, price, fee (Đối với ServiceCar, tax với SportCar)
	*/
	
	public ArrayList<Car> readData(String fileName) {
		Scanner scan = null;
		ArrayList<Car> cars = null;
		try {
			scan = new Scanner(new File(fileName));
			cars = new ArrayList<>();
			int n = Integer.parseInt(scan.nextLine());
			for(int i = 0; i < n; i++) {
				int c = Integer.parseInt(scan.nextLine());
				if(c == 0) {
					String id = scan.nextLine();
					String name = scan.nextLine();
					String manufacturer = scan.nextLine();
					double hours = Double.parseDouble(scan.nextLine());
					double price = Double.parseDouble(scan.nextLine());
					double fee = Double.parseDouble(scan.nextLine());
					ServiceCar ca = new ServiceCar(id, name, manufacturer, hours, price,fee);
					cars.add(ca);
				}
				if(c==1) {
					String id = scan.nextLine();
					String name = scan.nextLine();
					String manufacturer = scan.nextLine();
					double hours = Double.parseDouble(scan.nextLine());
					double price = Double.parseDouble(scan.nextLine());
					double tax = Double.parseDouble(scan.nextLine());
					SportCar ca = new SportCar(id, name, manufacturer, hours, price, tax);
					cars.add(ca);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cars;
			
	}
	
	// Phương thức in danh sách thông tin liên quan các loại xe trong mảng
	public void printCars(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	// Phương thức xuất ra danh sách những xe có tên nhà sản xuất là "manuName"
	public ArrayList<Car> findCars(ArrayList<Car> cars, String manuName){
		ArrayList<Car> name = new ArrayList<>();
		for (Car car : cars) {
			if(car.getManufacturer().equals(manuName)) {
				name.add(car);
			}
		}
		return name;
	}
	
	// Phương thức xuất ra danh sách những xe giá thành tiền (amount) cao nhất thuộc loại typeOfCars
	
	public ArrayList<Car> getMaxAmount(ArrayList<Car> cars, String typeOfCars){
		ArrayList<Car> ac = new ArrayList<>();
		ArrayList<Car> maxC = new ArrayList<>();
		for (Car car : cars) {
			String[] w = car.toString().split(" ");
			if(w[0].equals(typeOfCars)) {
				ac.add(car);
			}
		}
		double max = ac.get(0).getAmount();
		for (Car car : ac) {
			if(car.getAmount() > max) {
				max = car.getAmount();
			}
		}
		for (Car car : ac) {
			if(car.getAmount() == max)
				maxC.add(car);
		}
		return maxC;
		
	}
	
	// Phướng thức sắp xếp giá thành tiền các loại xe theo thứ tự giảm dần
	public void sortByAmount(ArrayList<Car> cars){
		//Begin editable part
			for(int i = 0; i < cars.size()-1;i++) {
				for(int j = 0; j < cars.size()-1-i;j++) {
					if(cars.get(j).getPrice()<cars.get(j+1).getPrice()) {
						Collections.swap(cars,j,j+1);				
						
					}
				}
			}
		}
	

// Hàm main 
		public static void main(String[] args) {
			CarManagement carManag = new CarManagement();
			ArrayList<Car> cars = carManag.readData("C:\\Users\\Admin\\eclipse-workspace\\BT\\src\\data.txt");
		//	carManag.printCars(cars);
			for (Car car : cars) {
				System.out.println(car.toString());
			}
			for (int i = 0; i < cars.size(); i++) {
				System.out.print(cars.get(i).getAmount() + " ");
			}
			System.out.println();
			ArrayList<Car> carsList = carManag.findCars(cars,"honda");
			carManag.printCars(carsList);
			
			ArrayList<Car> carsList1 = carManag.getMaxAmount(cars, "SportCar");
			carManag.printCars(carsList1);
			
			carManag.sortByAmount(cars);
			carManag.printCars(cars);
			
		}
	}