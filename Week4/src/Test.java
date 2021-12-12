import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static ArrayList<Student> input(Scanner scan){
		ArrayList<Student> students = new ArrayList<Student>();
		int n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < n; i++) {
			int c = Integer.parseInt(scan.nextLine());
			String id = scan.nextLine();
			String name = scan.nextLine();
			double score = Double.parseDouble(scan.nextLine());
			if(c == 0) {
				Student s = new Student(id, name, score);
				students.add(s);
			}
			else {
				int n_score = Integer.parseInt(scan.nextLine());
				StudentPrior s = new StudentPrior(id, name, score, n_score );
				students.add(s);
			}
		}
		return students;
	} 
	public static void output(ArrayList<Student> students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> students = input(scan);
		output(students);
	}
}
