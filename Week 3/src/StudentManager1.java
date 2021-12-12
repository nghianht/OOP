import java.util.Scanner;

public class StudentManager {
	public static double findMax(Student[] a) {
		double max = Integer.MIN_VALUE;
		for (Student student : a) {
			if(student.getScore() > max) {
				max = student.getScore();
			}
		}
		return max;
	}
	public static void printMax(Student[] a, double max) {
		for (Student student : a) {
			if(student.getScore() == max) {
				System.out.println(student.toString());
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = Integer.parseInt(scan.nextLine());
		
		Student student[] = new Student[n];
		System.out.println("Nhap thong tin cac sinh vien");
		for(int i = 0; i < n; i++) {
			String id = scan.nextLine();
			String name = scan.nextLine();
			double score = Double.parseDouble(scan.nextLine());
			student[i] = new Student(id, name, score);
		}
		for(int i = 0; i < n; i++) {
			System.out.println(student[i].toString());
		}
		System.out.println(findMax(student));
		printMax(student,findMax(student));
	}
}
