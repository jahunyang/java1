package exam04;

public class FunctionExam2{
	
	public void printStr1(Person str) {
		str.doWakeUp();
		System.out.println("매개변수 있는 함수" + str);
	}
	
	public void printStr1(int str) {
		System.out.println("인트 매개변수 있는 함수");
	}
	
	public void printStr1(String str) {
		System.out.println("이건 스트링");
	}
	
	public void printStr1() {
		System.out.println("매개변수 없는 함수");
	}
	
	public static void main(String[] args) {
		FunctionExam2 fe = new FunctionExam2();
		
		BizMan bm = new BizMan();
		fe.printStr1(bm);
		
		Person p = new Person();
		fe.printStr1(p);
		
		int a = 3;
		fe.printStr1(a);
		
		String b = "";
		fe.printStr1(b);
	}
}
