import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager2 {
	public static double findMax(ArrayList<Student> a) {
		double max = Double.MIN_VALUE;
		for (Student student : a) {
			if(student.getScore() > max)
				max = student.getScore();
		}
		return max;
	}
	public static void printMax(ArrayList<Student> a, double max) {
		for (Student student : a) {
			if(student.getScore() == max)
				System.out.println(student.toString());
		}
	}
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = Integer.parseInt(scan.nextLine());
		
		
		System.out.println("Nhap thong tin cac sinh vien");
		for(int i = 0; i < n; i++) {
			String id = scan.nextLine();
			String name = scan.nextLine();
			double score = Double.parseDouble(scan.nextLine());
			Student a = new Student(id, name, score);
			student.add(a);
		}
		for(int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).toString());
		}
		System.out.println(findMax(student));
		printMax(student, findMax(student));
	}
}
