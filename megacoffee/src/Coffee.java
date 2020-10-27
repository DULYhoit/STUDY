import java.util.Scanner;

import Shop.CoffeeData;

import java.util.ArrayList;
public class Coffee {
	Scanner sc = new Scanner(System.in); 

	/// 클래스배열각 개간절 
	ArrayList<CoffeeData> cof = new ArrayList<CoffeeData>();
	ArrayList<CoffeeData> smm = new ArrayList<CoffeeData>();
	ArrayList<CoffeeData> cake = new ArrayList<CoffeeData>();
	
	
	public Coffee() { //생산자
		Coff();
		Smoth();
		Cake();
		
	}
	
	public void Coff() {
		cof.add(0, new CoffeeData("아메리카노", 1500));
		cof.add(1, new CoffeeData("ICE 아메리카노", 2000));
		cof.add(2, new CoffeeData("모카라떼", 3000));
		cof.add(3, new CoffeeData("카라멜 마끼야또", 3000));
		
	}
	
	public void Smoth() {
		smm.add(0, new CoffeeData("요거트 스무디", 4000));
		smm.add(1, new CoffeeData("딸기스무디", 4500));


		
	}
	
	public void Cake() {
		cake.add(0, new CoffeeData("치즈케익", 5000));
		cake.add(1, new CoffeeData("초코케익", 5000));
	}
	




	


}