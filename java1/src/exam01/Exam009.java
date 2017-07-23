package exam01;

public class Exam009 {
	public static void main(String[] args) {
		int a = 1;
		int[] bank = new int[20];
		for (int i = 0; i < bank.length; i++) {
			bank[i] = i + 1;
		}
		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i]);
		}
	}
}
