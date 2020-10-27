import java.util.Scanner;

import Shop.CoffeeData;

import java.util.ArrayList;
public class Coffee {
	Scanner sc = new Scanner(System.in); 

	/// Ŭ�����迭�� ������ 
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();
	ArrayList<CoffeeData> smm = new ArrayList<CoffeeData>();
	ArrayList<CoffeeData> cake = new ArrayList<CoffeeData>();
	
	
	public Coffee() { //������
		Coff();
		Smoth();
		Cake();
		
	}
	
	public void Coff() {
		cof.add(0, new CoffeeData("�Ƹ޸�ī��", 1500));
		cof.add(1, new CoffeeData("ICE �Ƹ޸�ī��", 2000));
		cof.add(2, new CoffeeData("��ī��", 3000));
		cof.add(3, new CoffeeData("ī��� �����߶�", 3000));
		
	}
	
	public void Smoth() {
		smm.add(0, new CoffeeData("���Ʈ ������", 4000));
		smm.add(1, new CoffeeData("���⽺����", 4500));


		
	}
	
	public void Cake() {
		cake.add(0, new CoffeeData("ġ������", 5000));
		cake.add(1, new CoffeeData("��������", 5000));
	}
	




	


}