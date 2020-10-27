package membership;
import java.util.Scanner;
import java.util.ArrayList;
import Shop.*;

public class MemberEdit {
	
	boolean login,makeid;
	int choice, pwtry;
	Scanner sc = new Scanner(System.in);
	Member m;
	String check;
	int numcheck;
	ArrayList<Member> al = new ArrayList<>();
	String loginname;
	int logincoupon,loginpoint;
	Menu g = new Menu();
	


	public MemberEdit(){
		
		login = false;
		makeid = false;
		pwtry = 0;

		m = new Member();
		m.idSet("hello", "김은규", "1234", "12344321",1,2);//스탬프,쿠폰
		al.add(m);

		m = new Member();
		m.idSet("hey00507", "김종구", "4321", "32346082",0,1);
		al.add(m);

		launcher();
	}

	void login() {

		System.out.println("ID를 입력해주세요. : ");
		check = sc.next();
		for(int i = 0; i <al.size(); i++) {
			if(check.equals(al.get(i).getId())) {  //check;
				if(al.get(i).id_valid == false)
					System.out.println("해당 아이디는 비활성화되었습니다. 관리자에게 말씀해주세요 :)");
				if(pwtry == 4) {
					System.out.println("해당 아이디는 비밀번호 오류로 비활성화 되었습니다.");
					break;
				}else System.out.println("비밀번호를 입력해주세요 : ");//pwcheck;
				if(sc.next().equals(al.get(i).getPassword())) {
					login = true;
					System.out.println("환영합니다. " + al.get(i).getName()+"님");
					loginname = al.get(i).getName();
					logincoupon =al.get(i).coupon ;
					loginpoint =al.get(i).point ;
					pwtry = 0;
					g.startmenu();
				}else {
					System.out.println("비밀번호가 틀립니다."); //when pw out;
					pwtry++;
					if(pwtry ==3) {
						System.out.println("아이디가 비활성화 됩니다");
						al.get(i).id_valid = false;
						break;
					}
					System.out.println("비밀번호가 계속 틀리게 되면 계정이 비활성화되니 주의해주세요." + pwtry+"/3");
				}
			}
		} 
	}

	void signin() {
		m = new Member();
		while(makeid ==false) {
			System.out.println("사용하실 아이디를 입력하세요.");
			check = sc.next();
			for(int i = 0; i<al.size(); i++) { // hello 는 중복처리가 안됨 (수정 예정)
				if(check.equals(al.get(i).getId())) {
					System.out.println("아이디가 중복되었습니다 다시 설정해주세요.");
					break;
				}
			}
			m.setId(sc.next());
			System.out.println("사용하실 비밀번호를 입력하세요.");
			m.setPassword(sc.next());
			System.out.println("사용자의 이름를 입력하세요.");
			m.setName(sc.next());
			System.out.println("전화번호를 8 자리를 입력하세요.");
			m.setNum(sc.next());
			al.add(m);
			makeid =true;
			// 아이디, 비밀번호, 이름, 번호(8개만);
		}
	}

	void findid() {
		System.out.println("고객님의 성함을 입력해주세요.");
		check = sc.next();
		for(int i =0; i<al.size();i++) {
			if(al.get(i).getName().equals(check)) {
				System.out.println("고객님의 전화번호(뒤의 네자리)를 입력해주세요.");
				numcheck = sc.nextInt();
				if(numcheck == Integer.parseInt(al.get(i).getNum())%10000)
					System.out.println("고객님의 아이디는"+ al.get(i).getId()+ "입니다.");
				else
					System.out.println("잘못입력하셨습니다.");
			}else
				System.out.println("고객님의 성함으로 가입정보가 없습니다.");
		}
		//이름, 번호로 찾기 
		//이름 + 번호 뒷 4자리
	}

	void changepw() {
		//아이디, 번호(11자리)입력 후
		//비밀번호 새로 입력
		for(int i =0; i<al.size(); i++) {
			System.out.println("고객님의 아이디을 입력해주세요");
			check = sc.next();
			if(check.equals(al.get(i).getId())) {
				System.out.println("고객님의 전화번호 11 자리를 입력해주세요");
				check = sc.next();
				if(check.equals("010"+al.get(i).getNum())) {
					System.out.println("바꾸실 비밀번호를 입력해주세요.");
					al.get(i).setPassword(sc.next());
				}				
			}
		}
	}

	void launcher() {
		while(login == false) 
		{
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 찾기");
			System.out.println("4. 로그인 안하고 주문하기");
			choice = sc.nextInt();
			if(choice == 1)
				login();
			if(choice ==2)
				signin();
			if(choice == 3) {
				System.out.println("1. 아이디 찾기");
				System.out.println("2. 비밀번호 변경");
				choice = sc.nextInt();
				if(choice ==1) findid();
				if(choice ==2) changepw();
			}
			if(choice ==4) {
				g.startmenu();
			}
		}
	}
	
}


	