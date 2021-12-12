import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Test1 {
	public static ArrayList<Student> readFile(String filename){
		Scanner scan = null;
		ArrayList<Student> students = null;
		try {
			scan = new Scanner(new File(filename));
			students = new ArrayList<Student>();
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	} 
	public static ArrayList<Student> findMax(ArrayList<Student> students){
		ArrayList<Student> stmax = new ArrayList<>();
		double max = students.get(0).calScore();
		for (Student student : students) {
			if(student.calScore() > max) {
				max = student.calScore();
			}
			
		}
		for (Student student : students) {
			if(student.calScore() == max)
				stmax.add(student);
		}
		return stmax;
	}
	public static void writeFile(String filename, ArrayList<Student> students) {
		Formatter fmt = null;
		try {
			fmt = new Formatter(new File(filename));
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
	public static void output(ArrayList<Student> students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> students = readFile("C:\\Users\\Admin\\eclipse-workspace\\Week4\\src\\students1.txt");
		ArrayList<Student> stmax = findMax(students);
		output(students);
		writeFile("output.txt", students);
		writeFile("output1.txt", stmax);
	}
}
