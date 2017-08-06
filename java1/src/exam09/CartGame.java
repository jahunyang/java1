package exam09;

public class CartGame extends Thread{
	public Cart c;
	public CartGame(Cart c) {		
		this.c = c;
	}
	
	public void run() {
		c.startCart();
		
		try {
			Thread.sleep(c.speed);
			c.runningCart();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		c.endCart();
	}
	
	public static void main(String[] args) {
		String[] cartNames = {"1","2","3","4","5"};
		for(int i=0; i<cartNames.length; i++) {
			int speed = (int)(Math.random()*3000)+1000;
			Cart c= new Cart(speed, cartNames[i]);
			CartGame hg = new CartGame(c);
			hg.start();
		}
	}
}
