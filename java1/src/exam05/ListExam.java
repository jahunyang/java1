package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam{
	
	public static void main(String[] args) {
		ArrayList<Integer> al;
		al = new ArrayList<Integer>();
		/*al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);*/
		
		for (int i=1; i<=5; i++) {
			al.add(i);
		}
		
		for (int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1","2");
		System.out.println(hm.get(0));
		
		ArrayList<HashMap> ag = new ArrayList<HashMap>();
		ag.add(hm);
	}
}

