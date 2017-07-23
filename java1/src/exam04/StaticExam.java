package exam04;

public class StaticExam {
	/*public int num;
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.num=3;
	}*/
	
	public static int num;
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		se.num=3;
		StaticExam.num=4;
		
		System.out.println(se.num);
		System.out.println(StaticExam.num);
		
		StaticExam se2 = new StaticExam();
		System.out.println(se2.num);
	}
}
