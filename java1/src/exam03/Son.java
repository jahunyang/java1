package exam03;

public class Son extends Father {
/*	String house = "½Å¸²";
	
	public void printHouse () {
		System.out.println("Son");
	}*/
		
	public Son() {
		
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		
		System.out.println(s.car);
		System.out.println(s.money);
		System.out.println(s.house);
		
		s.printHouse();
		s.doJob("My");
		s.doSleep("My");
	}
}
