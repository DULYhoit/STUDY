import java.util.Scanner;
public class CoffeeData {
	int price;
	int count;
	int sum=0;
	int allprice;
	int stamp;
	String name;

	public CoffeeData() {
		Buy();
	}
	

	public CoffeeData(String name,int price) {
		this.name=name;
		this.price =price;
		
		
	}
	
	public CoffeeData(int count) {
		this.count=count;
		
		
	}
		void Buy() {
		Scanner scan = new Scanner(System.in);	
		System.out.println("��ֹ��ϰڽ��ϱ�?");
		count=scan.nextInt();
		this.sum+=count;
		this.allprice=price*count;
		this.stamp+=count;
		
	}
	
	
		void totalprint(){
		if(allprice !=0) 
			System.out.println("�Ƹ޸�ī��: "+(allprice/count)+"��  "+allprice+" ��");
		
	}
	
	
	
	
	
	
	
}