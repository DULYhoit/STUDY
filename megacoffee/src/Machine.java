import java.util.Scanner;

public class Machine  {
	int count;
	int choice;
	Coffee coff =new Coffee(); //Ŀ�� �� ����Ǿ��ִ°�
	public Machine() {

	}


	public void Machine() {
		Scanner sc = new Scanner(System.in); 
		while(true) { //�Ѹ޴� ����
			System.out.println("===�޴�===");
			System.out.println("1. Ŀ��");
			System.out.println("2. ������");
			System.out.println("3. ����ũ");
			System.out.println("4. ���");
			choice=sc.nextInt();

			if(choice ==1) {
				//while(true) {  //Ŀ�� ���� 
					System.out.println("===Ŀ��===");
					System.out.println("1. �Ƹ޸�ī��");
					System.out.println("2. ���̽� �Ƹ޸�ī��");
					System.out.println("3. ī���ī");
					System.out.println("4. ī��Ḷ���߶�");
					System.out.println("5. �ڷΰ���");

					choice=sc.nextInt();
					if(choice ==1) {
						coff.cof.get(0); //�Ƹ޸�ī��
					}

					if(choice ==2) {
						coff.cof.get(1); //���̽��Ƹ޸�ī��
					}

					if(choice ==3) {
						coff.cof.get(2);//��ī��
					}

					if(choice ==4) {
						coff.cof.get(3);//ī��� �����߶�
					} ///Ŀ�ǳ�
					//else {
						//return; ///���� ���±� ;; 

					//}
				//}
			}else if(choice ==2) { //���������
				System.out.println("===������===");
				System.out.println("1. ���Ʈ ������");
				System.out.println("2. ���� ������");
				if(choice ==1) {
					coff.smm.get(0);
				}

				if(choice ==2) {
					coff.smm.get(1);
				}//������

			}else if(choice ==3) { //����ũ����
				System.out.println("===����ũ===");
				System.out.println("1. ġ������");
				System.out.println("2. ��������");
				if(choice ==1) {
					coff.cake.get(0); //ġ������

				}

				if(choice ==2) {
					coff.cake.get(1); //��������
				}//���ͳ�

			}/*}else if(choice ==4) {
				System.out.println("�Ѱ���"+cof.sum);
				cof.Print(); //���� ��꼭
			}*/





			continue;
		}
	}
}

