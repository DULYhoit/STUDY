package membership;

import java.util.Scanner;
import java.util.ArrayList;
import Shop.Menu;

public class MemberEdit {

	public boolean login;
	boolean makeid;
	int choice, pwtry;
	Scanner sc = new Scanner(System.in);
	Member m;
	String check;
	int numcheck;
	ArrayList<Member> al = new ArrayList<>();
	public String loginname;//�α����̵Ǹ� �ش��ε������� �̸��� ����
	int logincoupon, loginpoint;

	public MemberEdit() {

		login = false;
		makeid = false;
		pwtry = 0;

		m = new Member();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		m.idSet("hello", "������", "1234", "12344321",1,2);//������,����
		al.add(m);

		m = new Member();
		m.idSet("hey00507", "������", "4321", "32346082",0,1);
		al.add(m);

=======
		m.idSet("hello", "������", "1234", "12344321", 1, 2);// ������,����
		al.add(0,m);

		m = new Member();
		m.idSet("hey00507", "������", "4321", "32346082", 0, 1);
		al.add(1,m);
		
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
		launcher();
	}

	void login() {

		System.out.println("ID�� �Է����ּ���. : ");
		check = sc.next();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		for(int i = 0; i <al.size(); i++) {
			if(check.equals(al.get(i).getId())) {  //check;
				if(al.get(i).id_valid == false)
					System.out.println("�ش� ���̵�� ��Ȱ��ȭ�Ǿ����ϴ�. �����ڿ��� �������ּ��� :)");
				if(pwtry == 4) {
					System.out.println("�ش� ���̵�� ��й�ȣ ������ ��Ȱ��ȭ �Ǿ����ϴ�.");
					break;
				}else System.out.println("��й�ȣ�� �Է����ּ��� : ");//pwcheck;
				if(sc.next().equals(al.get(i).getPassword())) {
					login = true;
					System.out.println("ȯ���մϴ�. " + al.get(i).getName()+"��");
=======
		for (int i = 0; i < al.size(); i++) {
			if (check.equals(al.get(i).getId())) { // check;
				if (al.get(i).id_valid == false)
					System.out.println("�ش� ���̵�� ��Ȱ��ȭ�Ǿ����ϴ�. �����ڿ��� �������ּ��� :)");
				if (pwtry == 4) {
					System.out.println("�ش� ���̵�� ��й�ȣ ������ ��Ȱ��ȭ �Ǿ����ϴ�.");
					break;
				} else
					System.out.println("��й�ȣ�� �Է����ּ��� : ");// pwcheck;
				
				if (sc.next().equals(al.get(i).getPassword())) {
					login = true;
					System.out.println("ȯ���մϴ�. " + al.get(i).getName() + "��");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
					loginname = al.get(i).getName();
					logincoupon = al.get(i).coupon;
					loginpoint = al.get(i).point;
					pwtry = 0;
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
					g.startmenu();
				}else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�."); //when pw out;
					pwtry++;
					if(pwtry ==3) {
						System.out.println("���̵� ��Ȱ��ȭ �˴ϴ�");
						al.get(i).id_valid = false;
						break;
					}
					System.out.println("��й�ȣ�� ��� Ʋ���� �Ǹ� ������ ��Ȱ��ȭ�Ǵ� �������ּ���." + pwtry+"/3");
=======
					break;

				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�."); // when pw out;
					pwtry++;
					if (pwtry == 3) {
						System.out.println("���̵� ��Ȱ��ȭ �˴ϴ�");
						al.get(i).id_valid = false;
						break;
					}
					System.out.println("��й�ȣ�� ��� Ʋ���� �Ǹ� ������ ��Ȱ��ȭ�Ǵ� �������ּ���." + pwtry + "/3");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
				}
			}
		}
	}

	void signin() {
		m = new Member();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		while(makeid ==false) {
			System.out.println("����Ͻ� ���̵� �Է��ϼ���.");
			check = sc.next();
			for(int i = 0; i<al.size(); i++) { // hello �� �ߺ�ó���� �ȵ� (���� ����)
				if(check.equals(al.get(i).getId())) {
					System.out.println("���̵� �ߺ��Ǿ����ϴ� �ٽ� �������ּ���.");
=======
		while (makeid == false) {
			System.out.println("����Ͻ� ���̵� �Է��ϼ���.");
			check = sc.next();
			for (int i = 0; i < al.size(); i++) { // hello �� �ߺ�ó���� �ȵ� (���� ����)
				if (check.equals(al.get(i).getId())) {
					System.out.println("���̵� �ߺ��Ǿ����ϴ� �ٽ� �������ּ���.");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
					break;
				}
			}
			m.setId(sc.next());
			System.out.println("����Ͻ� ��й�ȣ�� �Է��ϼ���.");
			m.setPassword(sc.next());
			System.out.println("������� �̸��� �Է��ϼ���.");
			m.setName(sc.next());
			System.out.println("��ȭ��ȣ�� 8 �ڸ��� �Է��ϼ���.");
			m.setNum(sc.next());
			al.add(m);
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
			makeid =true;
			// ���̵�, ��й�ȣ, �̸�, ��ȣ(8����);
=======
			makeid = true;
			// ���̵�, ��й�ȣ, �̸�, ��ȣ(8����);
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
		}
	}

	void findid() {
		System.out.println("�������� ������ �Է����ּ���.");
		check = sc.next();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		for(int i =0; i<al.size();i++) {
			if(al.get(i).getName().equals(check)) {
				System.out.println("�������� ��ȭ��ȣ(���� ���ڸ�)�� �Է����ּ���.");
				numcheck = sc.nextInt();
				if(numcheck == Integer.parseInt(al.get(i).getNum())%10000)
					System.out.println("�������� ���̵��"+ al.get(i).getId()+ "�Դϴ�.");
				else
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}else
				System.out.println("�������� �������� ���������� �����ϴ�.");
		}
		//�̸�, ��ȣ�� ã�� 
		//�̸� + ��ȣ �� 4�ڸ�
	}

	void changepw() {
		//���̵�, ��ȣ(11�ڸ�)�Է� ��
		//��й�ȣ ���� �Է�
		for(int i =0; i<al.size(); i++) {
			System.out.println("�������� ���̵��� �Է����ּ���");
			check = sc.next();
			if(check.equals(al.get(i).getId())) {
				System.out.println("�������� ��ȭ��ȣ 11 �ڸ��� �Է����ּ���");
				check = sc.next();
				if(check.equals("010"+al.get(i).getNum())) {
					System.out.println("�ٲٽ� ��й�ȣ�� �Է����ּ���.");
=======
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getName().equals(check)) {
				System.out.println("������ ��ȭ��ȣ(���� ���ڸ�)�� �Է����ּ���.");
				numcheck = sc.nextInt();
				if (numcheck == Integer.parseInt(al.get(i).getNum()) % 10000)
					System.out.println("������ ���̵��" + al.get(i).getId() + "�Դϴ�.");
				else
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
			} else
				System.out.println("������ �������� ���������� �����ϴ�.");
		}
		// �̸�, ��ȣ�� ã��
		// �̸� + ��ȣ �� 4�ڸ�
	}

	void changepw() {
		// ���̵�, ��ȣ(11�ڸ�)�Է� ��
		// ��й�ȣ ���� �Է�
		for (int i = 0; i < al.size(); i++) {
			System.out.println("������ ���̵��� �Է����ּ���");
			check = sc.next();
			if (check.equals(al.get(i).getId())) {
				System.out.println("������ ��ȭ��ȣ 11 �ڸ��� �Է����ּ���");
				check = sc.next();
				if (check.equals("010" + al.get(i).getNum())) {
					System.out.println("�ٲٽ� ��й�ȣ�� �Է����ּ���.");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
					al.get(i).setPassword(sc.next());
				}
			}
		}
	}

	void launcher() {
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		while(login == false) 
		{
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ã��");
			System.out.println("4. �α��� ���ϰ� �ֹ��ϱ�");
=======
		while (login == false) {
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ã��");
			System.out.println("4. �α��� ���ϰ� �ֹ��ϱ�");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
			choice = sc.nextInt();
			if (choice == 1) {
				login();

			}
			if (choice == 2) {
				signin();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
			if(choice == 3) {
				System.out.println("1. ���̵� ã��");
				System.out.println("2. ��й�ȣ ����");
=======
			}
			if (choice == 3) {
				System.out.println("1. ���̵� ã��");
				System.out.println("2. ��й�ȣ ����");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
				choice = sc.nextInt();
				if (choice == 1)
					findid();
				if (choice == 2)
					changepw();
			}
			if (choice == 4) {
				break;
			}
		}

	}

}
