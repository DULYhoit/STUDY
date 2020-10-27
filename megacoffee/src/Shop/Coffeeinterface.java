package Shop;

import java.util.ArrayList;

public class Coffeeinterface {
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();
	ArrayList<CoffeeData> smo = new ArrayList<CoffeeData>();
	ArrayList<CoffeeData> side = new ArrayList<CoffeeData>();

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
	

}
