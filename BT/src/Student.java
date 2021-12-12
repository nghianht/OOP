// Lớp Student được xây dựng đầy đủ, sinh viên không cần viết thêm

// Chú ý cần submit file này khi submit bài

public class Student {
	private String id;
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	private double score;
	
	public Student(String id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}