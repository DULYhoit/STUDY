package Shop;

import java.util.ArrayList;
import java.util.Scanner;

import membership.MemberEdit;

public class Menu {
	Scanner scan = new Scanner(System.in);
	MemberEdit log = new MemberEdit();
	Coffeeinterface fa = new Coffeeinterface();
	ShoppingDatainterface sa = new ShoppingDatainterface();
	int cho = 0;// 선택
	int count = 0;// 스캐너
	int index = 0;
	final int tip = 500;// 먹고가면 500원
	// 먹고가기 포장하기 구별
	int eat = 0;//먹고가기
	int pack = 0;//포장하기

	public Menu() {
		startmenu();
	}

	public void startmenu() {

		if (log.login == true) {
			System.out.println("======" + log.loginname + "님====");
			System.out.println("|MEGA 커피에 오신것을 환영합니다. |");
		} else {
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
		} else if (cho == 2) {
			pack = 1;
			menuone();
		} else {
			System.out.println("잘못입력");
			startmenu();
		}

	}

	void menuone() {
		while (true) {
			System.out.println("1.커피");
			System.out.println("2.스무디");// 장르를 나눠? 한꺼번에?
			System.out.println("3.사이드");
			System.out.println("4.주문완료");
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
				System.out.println("잘못입력함");
			}
		}
	}

	/*
	 * void menuone(){ for(int i = 0 ; i>데이터베이스 length만큼 ; i++) i는ID 칼럼의 id넘버
	 * System.out.println((i+1)+". "+id) }
	 */
//////주문 분기점 3개
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
			sa.inputShoppingData1(index, count);
		} else if (eat == 1) {
			System.out.println("계산 = " + (((fa.cof.get(index).price) * count) +"원 + 팁"+ (tip * count)) + "원");
			System.out.println("총가격 =" + (((fa.cof.get(index).price) * count) + (tip * count)) + "원");
			sa.inputShoppingData1(index, count);
			
		}
		reset();
	}

	void chosmoo() {
		fa.smoointerface();// Coffeeinterface클래스
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
			sa.inputShoppingData2(index, count);
		} else if (eat == 1) {
			System.out.println("계산 = " + (((fa.smo.get(index).price) * count)+"원 + 팁" + (tip * count)) + "원");
			System.out.println("총가격 =" + (((fa.smo.get(index).price) * count)+ (tip * count)) + "원");
			sa.inputShoppingData2(index, count);
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
			sa.inputShoppingData3(index, count);
			
		} else if (eat == 1) {
			System.out.println("계산 = " + (((fa.side.get(index).price) * count)+"원 + 팁" + (tip * count)) + "원");
			System.out.println("총가격 =" + (((fa.side.get(index).price) * count) + (tip * count)) + "원");
			sa.inputShoppingData3(index, count);
		}
		reset();
	}
//////////
	
	void reset() {
		cho = 0;
		count = 0;
		index = 0;
		
	}// 초기화
	void buyend() {
		int sum = 0;
		for(int i = 0 ; i<sa.shop.size() ; i++) {
			System.out.println(sa.shop.get(i).payment());
			sum = sum + sa.shop.get(i).price * sa.shop.get(i).count;
		}
		System.out.println("총가격 = "+ sum);
		
		System.out.println("구매종료");
		
	}
	
	
	// 추가할거 샷추가

	/*
	 * void shot() { System.out.println("====샷 추가====");
	 * System.out.println("1.한 번"); System.out.println("2.두 번");
	 * System.out.println("3.추가안함"); }
	 */

}
