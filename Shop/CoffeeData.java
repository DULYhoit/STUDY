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
		
			return "["+ coffeename + ", ����=" + price + "]";

	}
	public String payment() {
		return "["+ coffeename + ", ����= " + price + ", ����= " + count + "�Ѱ��� = " +count * price + "]";
	}
		
}
//Coffeeinterface���� �������� Ŀ���̸��� ������ �־��ִ� Ŭ����
//�����ͺ��̽��� Į������ ���������� ���� �ϴ� �ڵ�© ����




