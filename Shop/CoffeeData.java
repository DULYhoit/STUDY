package Shop;

public class CoffeeData {

	String coffeename;
	int price;
	int count;
	public CoffeeData() {

	}
	public CoffeeData(String coffeename , int price ) {
		this.coffeename = coffeename;
		this.price = price;
	}
	public CoffeeData(String coffeename , int price , int count ) {
		this.coffeename = coffeename;
		this.price = price;
		this.count = count;
	}
	@Override
	
		public String toString() {
		
			return "["+ coffeename + ", 가격=" + price + "]";

	}
	public String payment() {
		return "["+ coffeename + ", 가격= " + price + ", 개수= " + count + "총가격 = " +count * price + "]";
	}
		
}
//Coffeeinterface에서 선언해준 커피이름과 가격을 넣어주는 클래스
//데이터베이스에 칼럼값이 순차적으로 들어가게 하는 코드짤 예정




