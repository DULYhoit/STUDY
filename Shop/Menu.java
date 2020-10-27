package Shop;

import java.util.Scanner;

import membership.MemberEdit;

public class Menu {
	MemberEdit log = new MemberEdit();
	Scanner scan = new Scanner(System.in);
	Coffeeinterface fa = new Coffeeinterface();
	int cho = 0;
	int count = 0;
	int index = 0;
	int tip = 0;
	// 먹고가기 포장하기 구별
	int eat = 0;
	int pack = 0;
	
	

	public Menu() {
		
	}

	public void startmenu() {
		
		if(log.login == true) {
			System.out.println("======"+log.loginname+"님====");
			System.out.println("|MEGA 커피에 오신것을 환영합니다. |");
		}else {
			System.out.println("|MEGA 커피에 오신것을 환영합니다. |");
		}
		System.out.println("|---------------|");
		System.out.println("|1.먹고가기       |");
		System.out.println("|2.포장하기       |");
		System.out.println("|---------------|");
		System.out.print("숫자를 입력하세요 = ");
		cho = scan.nextInt();
		if (cho == 1) {
			eat = 1;
			
			System.out.println("먹고 가시면 + 500원");
			menuone();
		}
		if (cho == 2) {
			pack = 1;
			menuone();
		}

	}

	void menuone() {
		System.out.println("1.커피");
		System.out.println("2.스무디");//장르를 나눠? 한꺼번에? 
		System.out.println("3.사이드");
		cho = scan.nextInt();
		if (cho == 1) {
			chocoffee();
		} else if (cho == 2) {
			chosmoo();
		} else if (cho == 3) {
			choside();
		} else {
			System.out.println("잘못입력함");
		}

	}
	/*void menuone(){
	 * for(int i = 0 ; i>데이터베이스 length만큼 ; i++)
	 * i는ID 칼럼의 id넘버
	 * System.out.println((i+1)+". "+id)
	 * }
	 */

	// 커피 목록
	void chocoffee() {
		fa.Cofinterface();
		cho = scan.nextInt();
		index = cho - 1;// 인덱스를 찾기위한 변수?
		if (cho > 0 && cho <= fa.cof.size()) {
			System.out.println("추가하실 개수는?");
			count = scan.nextInt();
			menuconfirm1();
		} else {
			System.out.println("잘못 입력함");
		}
	}

	void menuconfirm1() {
		System.out.println("현재 선택한 정보");
		System.out.println(fa.cof.get(index) + "," + count + "개");
		if (pack == 1) {
			System.out.println("총가격 = " + (fa.cof.get(index).price) * count + "원");
		} else if (eat == 1) {
			System.out.println("총가격 = " + (((fa.cof.get(index).price) * count) +(500*count)) + "원");
		}
		reset();
	}

	void chosmoo() {
		fa.smoointerface();//Coffeeinterface클래스
		cho = scan.nextInt();
		index = cho - 1;
		if (cho > 0 && cho <= fa.smo.size()) {
			System.out.println("추가하실 개수는?");
			count = scan.nextInt();
			menuconfirm2();
		} else {
			System.out.println("잘못 입력함");
		}
	}

	void menuconfirm2() {
		System.out.println("현재 선택한 정보");
		System.out.println(fa.smo.get(index) + "," + count + "개");
		if (pack == 1) {
			System.out.println("총가격 = " + (fa.smo.get(index).price) * count + "원");
		} else if (eat == 1) {
			System.out.println("총가격 = " + (((fa.smo.get(index).price) * count) + (500*count)) + "원");
		}
		reset();
	}

	void choside() {
		fa.sideinterface();
		cho = scan.nextInt();
		index = cho - 1;
		if (cho > 0 && cho <= fa.side.size()) {
			System.out.println("추가하실 개수는?");
			count = scan.nextInt();
			menuconfirm3();
		} else {
			System.out.println("잘못 입력함");
		}
		
	}

	void menuconfirm3() {
		System.out.println("현재 선택한 정보");
		System.out.println(fa.side.get(index) + "," + count + "개");
		if (pack == 1) {
			System.out.println("총가격 = " + (fa.side.get(index).price) * count + "원");
			
		} else if (eat == 1) {
			System.out.println("총가격 = " + (((fa.side.get(index).price) * count) + (500*count)) + "원");
		}
		reset();
	}
	void reset() {
		cho = 0;
		count = 0;
		index = 0;
		eat = 0;
		pack = 0;
	}//초기화
			
		
//추가할거 샷추가

	/*
	 * void shot() { System.out.println("====샷 추가====");
	 * System.out.println("1.한 번"); System.out.println("2.두 번");
	 * System.out.println("3.추가안함"); }
	 */

}
