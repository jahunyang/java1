package exam08;

import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("exam08.Exam");
			Method[] m = cls.getDeclaredMethods();
			for(int i=0 ; i<m.length; i++) {
				System.out.println(m[i].toString());
			}
			Exam e = (Exam)cls.newInstance();
			Method pMethod = cls.getMethod("print", String.class);
			pMethod.invoke(e, "³ª³ª³ª");
			
			Exam e2 = new Exam();
			e2.print("sss");
		}catch(Exception ec) {
			System.out.println(ec);
		}
	}
}
