package Shop;

import java.util.ArrayList;

public class Coffeeinterface {
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();//������1.�ε������� �������� ���� �̸����� �������ؾߵǼ� �޴��� �帣 �ϳ����� ���ð���
	ArrayList<CoffeeData> side = new ArrayList<CoffeeData>();//������2.�׷����� for���� 3������ �����ߵ�....
	ArrayList<CoffeeData> smo = new ArrayList<CoffeeData>();//��̸���Ʈ �ϳ��� �ؾ���->DB������ ���� �ٲ�//�ذ�å:������ ��������� ������ ��ƾ���
	
	public Coffeeinterface() {

		Coffee();
		smoo();
		side();
	}

	void Coffee() {

		cof.add(0, new CoffeeData("�Ƹ޸�ī��(Hot)", 3500));
		cof.add(1, new CoffeeData("�Ƹ޸�ī��(ICE)", 4000));
		cof.add(2, new CoffeeData("������", 4500));
		
		
		
		
	}

	void smoo() {
		smo.add(0, new CoffeeData("��������", 3000));
		smo.add(1, new CoffeeData("���⽺����", 3500));
		smo.add(2, new CoffeeData("���ڽ�����", 4000));
		
	}

	void side() {
		side.add(0, new CoffeeData("�ܻ�����ġ", 5000));
		side.add(1, new CoffeeData("�ֱ׻�����ġ", 8000));
		side.add(2, new CoffeeData("�ֱܾ׻�����ġ", 12000));
	}
//MenuŬ���������� Ŀ�Ǹ޴� �������̽�
	void Cofinterface() {
		for (int i = 0; i < cof.size(); i++) {

			System.out.println((i + 1) + ". " + cof.get(i));
		}
	}

	void smoointerface() {
		for (int i = 0; i < smo.size(); i++) {
			System.out.println((i + 1) + ". " + smo.get(i));
		}
	}

	void sideinterface() {
		for (int i = 0; i < side.size(); i++) {
			
			System.out.println((i + 1) + ". " + side.get(i));
			
		}
	}

		
			
	//DB���� Į�� �� �ҷ��� �������̽� ���鿹��

}
