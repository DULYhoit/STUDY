package membership;

public class Member {//ȸ�� �̸� ���̵� ��й�ȣ ��������

	private String id , name , password, num;
	int coupon, point;
	
	boolean id_valid = true;
	
	public Member(){
		
	}
	public void idSet(String Id, String Name, String Pw, String Num,int Coupon, int Point) {
		this.id = Id;
		this.name = Name;
		this.password = Pw;
		this.num =Num;
		this.coupon = Coupon;
		this.point = Point;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String ID) {
		this.id = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		this.password = Password;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	// ���� �ؾ��ϴ� �� , ȸ������ ( ���̵�,��й�ȣ �����) , ��ȣ(010 ���ĸ� �Է��ϱ� �ڸ�)
	// ȸ���� ������ �ִ��� Ȯ����  �޼ҵ�
	// ȸ�� ���� (���� �� ���� ����)
	// ȸ�� Ž�� (�̸� �� ��ȭ��ȣ - ���ڸ��� ���� ȸ�� Ž��)
	
	/*	���߿� ������ �͵�
	 * 
	 * int coupon;
	 * int point; // 3�� ���̸� �����ϳ� 
	 * 
	 * */
}

