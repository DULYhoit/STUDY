package Shop;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);
	Coffeeinterface fa = new Coffeeinterface();
	int cho = 0;
	int count = 0;
	int index = 0;
	int tip = 0;
	// �԰��� �����ϱ� ����
	int eat = 0;
	int pack = 0;

	public Menu() {

	}

	public void startmenu() {

		System.out.println("MEGA Ŀ�ǿ� ���Ű��� ȯ���մϴ�");
		System.out.println("|---------------|");
		System.out.println("|1.�԰���       |");// 1�� �������� ���?
		System.out.println("|2.�����ϱ�       |");// Ŀ���� ������ ��� ���?
		System.out.println("|---------------|");
		System.out.print("���ڸ� �Է��ϼ��� = ");
		cho = scan.nextInt();
		if (cho == 1) {
			eat = 1;
			System.out.println("�԰� ���ø� +500��");
			menuone();
		}
		if (cho == 2) {
			pack = 1;
			menuone();
		}

	}

	void menuone() {
		System.out.println("1.Ŀ��");
		System.out.println("2.������");
		System.out.println("3.���̵�");
		cho = scan.nextInt();
		if (cho == 1) {
			chocoffee();
		} else if (cho == 2) {
			chosmoo();
		} else if (cho == 3) {
			choside();
		} else {
			System.out.println("�߸��Է���");
		}

	}

	// Ŀ�� ���
	void chocoffee() {
		fa.Cofinterface();
		cho = scan.nextInt();
		index = cho - 1;
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
		} else if (eat == 1) {
			System.out.println("�Ѱ��� = " + (((fa.cof.get(index).price) * count) +(500*count)) + "��");
		}
	}

	void chosmoo() {
		fa.smoointerface();
		cho = scan.nextInt();
		index = cho - 1;// �ε����� ã������ ����?
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
		} else if (eat == 1) {
			System.out.println("�Ѱ��� = " + (((fa.smo.get(index).price) * count) + (500*count)) + "��");
		}
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
		} else if (eat == 1) {
			System.out.println("�Ѱ��� = " + (((fa.side.get(index).price) * count) + (500*count)) + "��");
		}
	}
//�߰��Ұ� ���߰�

	/*
	 * void shot() { System.out.println("====�� �߰�====");
	 * System.out.println("1.�� ��"); System.out.println("2.�� ��");
	 * System.out.println("3.�߰�����"); }
	 */

}
