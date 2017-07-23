package exam05;

public class StringExam{
	
	String str = "123";
	
	public static void main(String[] args) {
		StringExam se = new StringExam();
		String str2 = "123";
		String str3 = new String("123");
		String str4 = "123";
		
		System.out.println(se.str == str2);
		System.out.println(se.str == str3);
		System.out.println(se.str == str4);
		System.out.println(str2 == str4); // equals 값과 값이 같은지 확인. String일 경우는 equals로 비교
		
		
		
		System.out.println(se.str.equals(str3));
	}
}

