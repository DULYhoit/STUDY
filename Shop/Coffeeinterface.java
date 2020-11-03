package Shop;

import java.util.ArrayList;

public class Coffeeinterface {
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();//문제점1.인덱스값을 지정해준 변수 이름으로 포인팅해야되서 메뉴를 장르 하나씩만 선택가능
	ArrayList<CoffeeData> side = new ArrayList<CoffeeData>();//문제점2.그로인해 for문도 3가지로 돌려야됨....
	ArrayList<CoffeeData> smo = new ArrayList<CoffeeData>();//어레이리스트 하나로 해야함->DB쪽으로 생각 바꿈//해결책:무엇을 골랏는지의 정보를 담아야함
	
	public Coffeeinterface() {

		Coffee();
		smoo();
		side();
	}

	void Coffee() {

		cof.add(0, new CoffeeData("아메리카노(Hot)", 3500));
		cof.add(1, new CoffeeData("아메리카노(ICE)", 4000));
		cof.add(2, new CoffeeData("우유라떼", 4500));
		
		
		
		
	}

	void smoo() {
		smo.add(0, new CoffeeData("망고스무디", 3000));
		smo.add(1, new CoffeeData("딸기스무디", 3500));
		smo.add(2, new CoffeeData("초코스무디", 4000));
		
	}

	void side() {
		side.add(0, new CoffeeData("햄샌드위치", 5000));
		side.add(1, new CoffeeData("애그샌드위치", 8000));
		side.add(2, new CoffeeData("햄애그샌드위치", 12000));
	}
//Menu클래스에서쓸 커피메뉴 인터페이스
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

		
			
	//DB에서 칼럼 값 불러서 인터페이스 만들예정

}
