package exam02;

public class ArrayExam {
	public static void main(String[] args) {

		int[] ary = new int[20];
		System.out.println(ary.length);

		for (int i=0; i<ary.length; i++) {
			ary[i] = i;
			System.out.println(ary[i]);
		}
	}
}
