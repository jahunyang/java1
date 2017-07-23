package exam04;

public class ClassExam {
	int num ;
	String str;
	
	ClassExam(){
		System.out.println("기본생성자호출");
	}
	
	ClassExam(String str){
		System.out.println("스트링 파라미터 호출");
	}
	
	public void printStr(String str){
		System.out.println(str);
	}
	
	public String getStr(){
		String str = "adsf";
		return str;
	}
	
	public static void main(String[] args) {
		ClassExam ce= new ClassExam();
	}
}
