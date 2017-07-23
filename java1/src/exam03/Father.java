package exam03;

public class Father {
	
	int money = 1000;
	String car = "YF소나타";
	String house = "가산";
	
	public void printHouse () {
		System.out.println("Father");
	}
	
	public void doJob (String who) {
		System.out.println(who + "Father1");
	}
	
	public void doSleep (String who) {
		System.out.println(who + "Father2"); // 파라미터변수
	}
}
