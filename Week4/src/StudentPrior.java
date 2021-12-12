
public class StudentPrior extends Student{
	private int n_score;

	public StudentPrior() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Tao ham dung day du doi ke thua
	public StudentPrior(String id, String name, double score, int n_score) {
		super(id, name, score);
		// TODO Auto-generated constructor stub
		this.n_score = n_score;
	}
	public int getN_score() {
		return n_score;
	}
	public void setN_score(int n_score) {
		this.n_score = n_score;
	} 
	@Override
	public String toString() {
		return "StudentPrior [n_score=" + n_score + ", toString()=" + super.toString() + "]";
	}
	public double calScore() {
		return super.getScore() + n_score;
	}
	
}
