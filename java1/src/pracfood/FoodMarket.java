package pracfood;

public class FoodMarket {
	
	public void sale(Food f) {
		if (f instanceof Rice) {
			Rice r = (Rice)f;
			r.discountinfo();
		}
		
		if (f instanceof Coffee) {
			Coffee c = (Coffee)f;
			c.discountinfo();
		}
		f.saleFood();
	}

	public static void main(String[] args) {
		Ramen ramen = new Ramen();
		Rice rice = new Rice();
		Coffee coffee = new Coffee();
		
		FoodMarket fm = new FoodMarket();
		fm.sale(ramen);
		fm.sale(rice);
		fm.sale(coffee);
	}
}
