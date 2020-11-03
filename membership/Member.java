package membership;

public class Member {//회원 이름 아이디 비밀번호 쿠폰갯수

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

	// 지금 해야하는 것 , 회원가입 ( 아이디,비밀번호 입출력) , 번호(010 이후만 입력하기 자리)
	// 회원의 정보가 있는지 확인할  메소드
	// 회원 관리 (삭제 및 정보 변경)
	// 회원 탐색 (이름 과 전화번호 - 뒷자리를 통해 회원 탐색)
	
	/*	나중에 구현할 것들
	 * 
	 * int coupon;
	 * int point; // 3장 모이면 쿠폰하나 
	 * 
	 * */
}

