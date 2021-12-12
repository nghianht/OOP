import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentManager {
	private int n;
	private static Student[] students;

    // Đọc n và danh sách sinh viên từ file (sử dụng Scanner), chú ý khởi tạo mảng students sau khi đọc được n từ file fileName.

	public void readStudentsFromFile(String fileName) throws FileNotFoundException
	{
		Scanner s = new Scanner(new File(fileName));
    	n = Integer.parseInt(s.nextLine());
    	students = new Student[n];
    	for (int i = 0; i < n ; i++) {
    		String hovaten = s.nextLine();
    		String msv = s.nextLine();
			double diem = Double.parseDouble(s.nextLine());
			students[i] = new Student(hovaten, msv,diem);
		}
		
	}
	
	// Sắp xếp mảng students theo thứ tự điểm giảm dần
	public void sortdBySCore()
	{
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = 0; j < students.length - i -1; j++) {
				if(students[j].getScore() < students[j+1].getScore()) {
					Student s = students[j];
					students[j] = students[j+1];
					students[j+1] = s;
				}
			}
		}
	}
	
	// in danh sách ra file fileName (Sử dụng Formatter)
	public void printStudentsToFile(String fileName)
	{
		Formatter fmt = null;
		try {
			fmt = new Formatter(new File(fileName));
			fmt.format(n+"\n");
			for (Student student : students) {
				
				fmt.format(student.getId()+"\n");
				fmt.format(student.getName()+"\n");
				fmt.format(student.getScore()+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fmt.close();
		}
		
	}
	
	//Phương thức đọc nội dung file fileName và in ra màn hình (Phương thức này được cho sẵn, không cần chỉnh sửa)
	public void readFile(String fileName)
	{
		try {
			Scanner reader = new Scanner(new File(fileName));
			while(reader.hasNext())
				System.out.println(reader.nextLine());
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		StudentManager sm = new StudentManager();
		sm.readStudentsFromFile("students.txt");
		sm.sortdBySCore();
		sm.printStudentsToFile("studentsSorted.txt");

		sm.readFile(System.getProperty("user.dir")+"/"+"studentsSorted.txt");
	}
}