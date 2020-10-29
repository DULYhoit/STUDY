package Shop;

public class ShoppingData {

	String coffeename;
	int price;
	int count;
	public ShoppingData() {

	}
	public ShoppingData(String coffeename , int price, int count) {
		this.coffeename = coffeename;
		this.price = price;
		this.count = count;
	}
	@Override
	public String toString() {
		return  "["+ coffeename + ", 가격=" + price + ", 개수=" + count + "]";
	}
	
	
		
}
