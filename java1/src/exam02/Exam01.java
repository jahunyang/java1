package exam02;

public class Exam01 {
	int num1 = 10;
	
	public void print1() {
		int num1 = 5;
		System.out.println(num1);
	}
	
	public void print2() {
		System.out.println(num1);
	}
	
	public int printNum() {
		return 0;
	}
	
	public String printStr() {
		return ""+num1;
	}
		
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.print1();
		e.print2();
		
		System.out.println("return------------------------------------");
		
		int a = e.printNum();
		System.out.println(a);
		
		String b = e.printStr();
		System.out.println(b);
	}
}
