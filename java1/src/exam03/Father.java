package exam03;

public class Father {
	
	int money = 1000;
	String car = "YF�ҳ�Ÿ";
	String house = "����";
	
	public void printHouse () {
		System.out.println("Father");
	}
	
	public void doJob (String who) {
		System.out.println(who + "Father1");
	}
	
	public void doSleep (String who) {
		System.out.println(who + "Father2"); // �Ķ���ͺ���
	}
}
