package Shop;

public class CoffeeData {

	String coffeename;
	int price;
	public CoffeeData() {

	}
	public CoffeeData(String coffeename , int price) {
		this.coffeename = coffeename;
		this.price = price;
	}
	
	@Override
	
		public String toString() {
		
			return "["+ coffeename + ", ����=" + price + "]";

	}
		
}
//Coffeeinterface���� �������� Ŀ���̸��� ������ �־��ִ� Ŭ����
//�����ͺ��̽��� Į������ ���������� ���� �ϴ� �ڵ�© ����




