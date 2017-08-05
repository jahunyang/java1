package exam08;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam02 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Key",1);
		
		ArrayList list = new ArrayList();
		list.add(hm);
	}
}
