package Shop;

import java.util.ArrayList;

public class ShoppingDatainterface {
	ArrayList<CoffeeData> shop = new ArrayList<CoffeeData>();
	Coffeeinterface g = new Coffeeinterface();
	
	
	void inputShoppingData1(int index , int count) {
		shop.add(new CoffeeData(g.cof.get(index).coffeename,g.cof.get(index).price, count));
	}
	void inputShoppingData2(int index, int count) {
		shop.add(new CoffeeData(g.smo.get(index).coffeename,g.smo.get(index).price, count));
	}
	void inputShoppingData3(int index , int count) {
		shop.add(new CoffeeData(g.side.get(index).coffeename,g.side.get(index).price, count));
	}
	
}
