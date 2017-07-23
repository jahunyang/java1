package exam02;

public class StringArray2 {

//	public StringArray2() {
//		System.out.println("test");
//	}

	int num;
	
	public void printStr() {
		num = 1;
		System.out.println(num);
		System.out.println("printStr");
	}
	
	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();
		st2.printStr(); 
	}
}
