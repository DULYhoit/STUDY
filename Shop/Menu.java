package Shop;

import java.util.ArrayList;
import java.util.Scanner;

import membership.MemberEdit;

public class Menu {
	Scanner scan = new Scanner(System.in);
	MemberEdit log = new MemberEdit();
	Coffeeinterface fa = new Coffeeinterface();
	ShoppingDatainterface sa = new ShoppingDatainterface();
	int cho = 0;// ����
	int count = 0;// ��ĳ��
	int index = 0;
	final int tip = 500;// �԰��� 500��
	// �԰��� �����ϱ� ����
	int eat = 0;//�԰���
	int pack = 0;//�����ϱ�

	public Menu() {
		startmenu();
	}

	public void startmenu() {

		if (log.login == true) {
			System.out.println("======" + log.loginname + "��====");
			System.out.println("|MEGA Ŀ�ǿ� ���Ű��� ȯ���մϴ�. |");
		} else {
			System.out.println("|MEGA Ŀ�ǿ� ���Ű��� ȯ���մϴ�. |");
		}
		System.out.println("|---------------|");
		System.out.println("|1.�԰���       |");
		System.out.println("|2.�����ϱ�       |");
		System.out.println("|---------------|");
		System.out.print("���ڸ� �Է��ϼ��� = ");
		cho = scan.nextInt();
		if (cho == 1) {
			eat = 1;

			System.out.println("�԰� ���ø� + 500��");
			menuone();
		} else if (cho == 2) {
			pack = 1;
			menuone();
		} else {
			System.out.println("�߸��Է�");
			startmenu();
		}

	}

	void menuone() {
		while (true) {
			System.out.println("1.Ŀ��");
			System.out.println("2.������");// �帣�� ����? �Ѳ�����?
			System.out.println("3.���̵�");
			System.out.println("4.�ֹ��Ϸ�");
			cho = scan.nextInt();
			if (cho == 1) {
				chocoffee();
			} else if (cho == 2) {
				chosmoo();
			} else if (cho == 3) {
				choside();
			} else if (cho == 4) {
				buyend();
				break;
			} else {
				System.out.println("�߸��Է���");
			}
		}
	}

	/*
	 * void menuone(){ for(int i = 0 ; i>�����ͺ��̽� length��ŭ ; i++) i��ID Į���� id�ѹ�
	 * System.out.println((i+1)+". "+id) }
	 */
//////�ֹ� �б��� 3��
	// Ŀ�� ���
	void chocoffee() {
		fa.Cofinterface();
		cho = scan.nextInt();
		index = cho - 1;// �ε����� ã������ ����?
		if (cho > 0 && cho <= fa.cof.size()) {
			System.out.println("�߰��Ͻ� ������?");
			count = scan.nextInt();
			menuconfirm1();
		} else {
			System.out.println("�߸� �Է���");
		}
	}

	void menuconfirm1() {
		System.out.println("���� ������ ����");
		System.out.println(fa.cof.get(index) + "," + count + "��");
		if (pack == 1) {
			System.out.println("�Ѱ��� = " + (fa.cof.get(index).price) * count + "��");
			sa.inputShoppingData1(index, count);
		} else if (eat == 1) {
			System.out.println("��� = " + (((fa.cof.get(index).price) * count) +"�� + ��"+ (tip * count)) + "��");
			System.out.println("�Ѱ��� =" + (((fa.cof.get(index).price) * count) + (tip * count)) + "��");
			sa.inputShoppingData1(index, count);
			
		}
		reset();
	}

	void chosmoo() {
		fa.smoointerface();// CoffeeinterfaceŬ����
		cho = scan.nextInt();
		index = cho - 1;
		if (cho > 0 && cho <= fa.smo.size()) {
			System.out.println("�߰��Ͻ� ������?");
			count = scan.nextInt();
			menuconfirm2();
		} else {
			System.out.println("�߸� �Է���");
		}
	}

	void menuconfirm2() {
		System.out.println("���� ������ ����");
		System.out.println(fa.smo.get(index) + "," + count + "��");
		if (pack == 1) {
			System.out.println("�Ѱ��� = " + (fa.smo.get(index).price) * count + "��");
			sa.inputShoppingData2(index, count);
		} else if (eat == 1) {
			System.out.println("��� = " + (((fa.smo.get(index).price) * count)+"�� + ��" + (tip * count)) + "��");
			System.out.println("�Ѱ��� =" + (((fa.smo.get(index).price) * count)+ (tip * count)) + "��");
			sa.inputShoppingData2(index, count);
		}
		reset();
	}

	void choside() {
		fa.sideinterface();
		cho = scan.nextInt();
		index = cho - 1;
		if (cho > 0 && cho <= fa.side.size()) {
			System.out.println("�߰��Ͻ� ������?");
			count = scan.nextInt();
			menuconfirm3();
		} else {
			System.out.println("�߸� �Է���");
		}

	}

	void menuconfirm3() {
		System.out.println("���� ������ ����");
		System.out.println(fa.side.get(index) + "," + count + "��");
		if (pack == 1) {
			System.out.println("�Ѱ��� = " + (fa.side.get(index).price) * count + "��");
			sa.inputShoppingData3(index, count);
			
		} else if (eat == 1) {
			System.out.println("��� = " + (((fa.side.get(index).price) * count)+"�� + ��" + (tip * count)) + "��");
			System.out.println("�Ѱ��� =" + (((fa.side.get(index).price) * count) + (tip * count)) + "��");
			sa.inputShoppingData3(index, count);
		}
		reset();
	}
//////////
	
	void reset() {
		cho = 0;
		count = 0;
		index = 0;
		
	}// �ʱ�ȭ
	void buyend() {
		int sum = 0;
		for(int i = 0 ; i<sa.shop.size() ; i++) {
			System.out.println(sa.shop.get(i).payment());
			sum = sum + sa.shop.get(i).price * sa.shop.get(i).count;
		}
		System.out.println("�Ѱ��� = "+ sum);
		
		System.out.println("��������");
		
	}
	
	
	// �߰��Ұ� ���߰�

	/*
	 * void shot() { System.out.println("====�� �߰�====");
	 * System.out.println("1.�� ��"); System.out.println("2.�� ��");
	 * System.out.println("3.�߰�����"); }
	 */

}
