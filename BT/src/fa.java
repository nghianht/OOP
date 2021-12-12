
public class fa {
	public static void main(String[] args) {
		String s = "C02 | Nguyễn Mạnh Hải | A| Nam | 1980 | 1";
		String[] w = s.split("\\|");
		for (String string : w) {
			string = string.strip();
			System.out.println(string);
			
		}
		
	}
}
