
public class Student1 {

	private String id;
	private String name;
	private double score;
	public Student1() {}
	public Student1(String id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;				
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getScore() {
		return score;
	}
	public void print() {
		System.out.println(id +" "+ name+" "+ score);
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", score=" + score;
	}
	
}
