package exam09;

import java.util.ArrayList;
import java.util.List;

public class HorseGame extends Thread{
	public Horse h;
	static int idx = 0;
	
	public HorseGame(Horse h) {		
		this.h = h;
	}
	
	public void run() {
		h.startHorse();
		
		try {
			Thread.sleep(h.speed);
			h.runningHorse();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		h.endHorse(++idx);
	}
	
	public static void main(String[] args) {
		String[] horseNames = {"ȣ����","�޽�","���̸���","����","��߶�","�׸��"};
		List<HorseGame> horseList=new ArrayList<HorseGame>();
		for(int i=0; i<horseNames.length; i++) {
			int speed = (int)(Math.random()*3000)+1000;
			Horse h= new Horse(speed, horseNames[i]);
			HorseGame hg = new HorseGame(h);
			hg.start();
			horseList.add(hg);
		}
		for(HorseGame hg : horseList) {
			try {
				hg.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��Ⱑ ����Ǿ����ϴ�.");
	}
}
