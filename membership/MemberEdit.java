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
	public String loginname;//·Î±×ÀÎÀÌµÇ¸é ÇØ´çÀÎµ¦½º°ªÀÇ ÀÌ¸§ÀÌ ´ã±ä´Ù
	int logincoupon, loginpoint;

	public MemberEdit() {

		login = false;
		makeid = false;
		pwtry = 0;

		m = new Member();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		m.idSet("hello", "ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½", "1234", "12344321",1,2);//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½,ï¿½ï¿½ï¿½ï¿½
		al.add(m);

		m = new Member();
		m.idSet("hey00507", "ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½", "4321", "32346082",0,1);
		al.add(m);

=======
		m.idSet("hello", "±èÀº±Ô", "1234", "12344321", 1, 2);// ½ºÅÆÇÁ,ÄíÆù
		al.add(0,m);

		m = new Member();
		m.idSet("hey00507", "±èÁ¾±¸", "4321", "32346082", 0, 1);
		al.add(1,m);
		
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
		launcher();
	}

	void login() {

		System.out.println("IDï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½. : ");
		check = sc.next();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		for(int i = 0; i <al.size(); i++) {
			if(check.equals(al.get(i).getId())) {  //check;
				if(al.get(i).id_valid == false)
					System.out.println("ï¿½Ø´ï¿½ ï¿½ï¿½ï¿½Ìµï¿½ï¿½ ï¿½ï¿½È°ï¿½ï¿½È­ï¿½Ç¾ï¿½ï¿½ï¿½ï¿½Ï´ï¿½. ï¿½ï¿½ï¿½ï¿½ï¿½Ú¿ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½ :)");
				if(pwtry == 4) {
					System.out.println("ï¿½Ø´ï¿½ ï¿½ï¿½ï¿½Ìµï¿½ï¿½ ï¿½ï¿½Ð¹ï¿½È£ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½È°ï¿½ï¿½È­ ï¿½Ç¾ï¿½ï¿½ï¿½ï¿½Ï´ï¿½.");
					break;
				}else System.out.println("ï¿½ï¿½Ð¹ï¿½È£ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½ : ");//pwcheck;
				if(sc.next().equals(al.get(i).getPassword())) {
					login = true;
					System.out.println("È¯ï¿½ï¿½ï¿½Õ´Ï´ï¿½. " + al.get(i).getName()+"ï¿½ï¿½");
=======
		for (int i = 0; i < al.size(); i++) {
			if (check.equals(al.get(i).getId())) { // check;
				if (al.get(i).id_valid == false)
					System.out.println("ÇØ´ç ¾ÆÀÌµð´Â ºñÈ°¼ºÈ­µÇ¾ú½À´Ï´Ù. °ü¸®ÀÚ¿¡°Ô ¸»¾¸ÇØÁÖ¼¼¿ä :)");
				if (pwtry == 4) {
					System.out.println("ÇØ´ç ¾ÆÀÌµð´Â ºñ¹Ð¹øÈ£ ¿À·ù·Î ºñÈ°¼ºÈ­ µÇ¾ú½À´Ï´Ù.");
					break;
				} else
					System.out.println("ºñ¹Ð¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");// pwcheck;
				
				if (sc.next().equals(al.get(i).getPassword())) {
					login = true;
					System.out.println("È¯¿µÇÕ´Ï´Ù. " + al.get(i).getName() + "´Ô");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
					loginname = al.get(i).getName();
					logincoupon = al.get(i).coupon;
					loginpoint = al.get(i).point;
					pwtry = 0;
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
					g.startmenu();
				}else {
					System.out.println("ï¿½ï¿½Ð¹ï¿½È£ï¿½ï¿½ Æ²ï¿½ï¿½ï¿½Ï´ï¿½."); //when pw out;
					pwtry++;
					if(pwtry ==3) {
						System.out.println("ï¿½ï¿½ï¿½Ìµï¿½ ï¿½ï¿½È°ï¿½ï¿½È­ ï¿½Ë´Ï´ï¿½");
						al.get(i).id_valid = false;
						break;
					}
					System.out.println("ï¿½ï¿½Ð¹ï¿½È£ï¿½ï¿½ ï¿½ï¿½ï¿½ Æ²ï¿½ï¿½ï¿½ï¿½ ï¿½Ç¸ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½È°ï¿½ï¿½È­ï¿½Ç´ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½." + pwtry+"/3");
=======
					break;

				} else {
					System.out.println("ºñ¹Ð¹øÈ£°¡ Æ²¸³´Ï´Ù."); // when pw out;
					pwtry++;
					if (pwtry == 3) {
						System.out.println("¾ÆÀÌµð°¡ ºñÈ°¼ºÈ­ µË´Ï´Ù");
						al.get(i).id_valid = false;
						break;
					}
					System.out.println("ºñ¹Ð¹øÈ£°¡ °è¼Ó Æ²¸®°Ô µÇ¸é °èÁ¤ÀÌ ºñÈ°¼ºÈ­µÇ´Ï ÁÖÀÇÇØÁÖ¼¼¿ä." + pwtry + "/3");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
				}
			}
		}
	}

	void signin() {
		m = new Member();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		while(makeid ==false) {
			System.out.println("ï¿½ï¿½ï¿½ï¿½Ï½ï¿½ ï¿½ï¿½ï¿½Ìµï¿½ ï¿½Ô·ï¿½ï¿½Ï¼ï¿½ï¿½ï¿½.");
			check = sc.next();
			for(int i = 0; i<al.size(); i++) { // hello ï¿½ï¿½ ï¿½ßºï¿½Ã³ï¿½ï¿½ï¿½ï¿½ ï¿½Èµï¿½ (ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½)
				if(check.equals(al.get(i).getId())) {
					System.out.println("ï¿½ï¿½ï¿½Ìµï¿½ ï¿½ßºï¿½ï¿½Ç¾ï¿½ï¿½ï¿½ï¿½Ï´ï¿½ ï¿½Ù½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½.");
=======
		while (makeid == false) {
			System.out.println("»ç¿ëÇÏ½Ç ¾ÆÀÌµð¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
			check = sc.next();
			for (int i = 0; i < al.size(); i++) { // hello ´Â Áßº¹Ã³¸®°¡ ¾ÈµÊ (¼öÁ¤ ¿¹Á¤)
				if (check.equals(al.get(i).getId())) {
					System.out.println("¾ÆÀÌµð°¡ Áßº¹µÇ¾ú½À´Ï´Ù ´Ù½Ã ¼³Á¤ÇØÁÖ¼¼¿ä.");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
					break;
				}
			}
			m.setId(sc.next());
			System.out.println("ï¿½ï¿½ï¿½ï¿½Ï½ï¿½ ï¿½ï¿½Ð¹ï¿½È£ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½Ï¼ï¿½ï¿½ï¿½.");
			m.setPassword(sc.next());
			System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ì¸ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½Ï¼ï¿½ï¿½ï¿½.");
			m.setName(sc.next());
			System.out.println("ï¿½ï¿½È­ï¿½ï¿½È£ï¿½ï¿½ 8 ï¿½Ú¸ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½Ï¼ï¿½ï¿½ï¿½.");
			m.setNum(sc.next());
			al.add(m);
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
			makeid =true;
			// ï¿½ï¿½ï¿½Ìµï¿½, ï¿½ï¿½Ð¹ï¿½È£, ï¿½Ì¸ï¿½, ï¿½ï¿½È£(8ï¿½ï¿½ï¿½ï¿½);
=======
			makeid = true;
			// ¾ÆÀÌµð, ºñ¹Ð¹øÈ£, ÀÌ¸§, ¹øÈ£(8°³¸¸);
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
		}
	}

	void findid() {
		System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½.");
		check = sc.next();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
		for(int i =0; i<al.size();i++) {
			if(al.get(i).getName().equals(check)) {
				System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½È­ï¿½ï¿½È£(ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ú¸ï¿½)ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½.");
				numcheck = sc.nextInt();
				if(numcheck == Integer.parseInt(al.get(i).getNum())%10000)
					System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ìµï¿½ï¿½"+ al.get(i).getId()+ "ï¿½Ô´Ï´ï¿½.");
				else
					System.out.println("ï¿½ß¸ï¿½ï¿½Ô·ï¿½ï¿½Ï¼Ì½ï¿½ï¿½Ï´ï¿½.");
			}else
				System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ï´ï¿½.");
		}
		//ï¿½Ì¸ï¿½, ï¿½ï¿½È£ï¿½ï¿½ Ã£ï¿½ï¿½ 
		//ï¿½Ì¸ï¿½ + ï¿½ï¿½È£ ï¿½ï¿½ 4ï¿½Ú¸ï¿½
	}

	void changepw() {
		//ï¿½ï¿½ï¿½Ìµï¿½, ï¿½ï¿½È£(11ï¿½Ú¸ï¿½)ï¿½Ô·ï¿½ ï¿½ï¿½
		//ï¿½ï¿½Ð¹ï¿½È£ ï¿½ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½
		for(int i =0; i<al.size(); i++) {
			System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ìµï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½");
			check = sc.next();
			if(check.equals(al.get(i).getId())) {
				System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½È­ï¿½ï¿½È£ 11 ï¿½Ú¸ï¿½ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½");
				check = sc.next();
				if(check.equals("010"+al.get(i).getNum())) {
					System.out.println("ï¿½Ù²Ù½ï¿½ ï¿½ï¿½Ð¹ï¿½È£ï¿½ï¿½ ï¿½Ô·ï¿½ï¿½ï¿½ï¿½Ö¼ï¿½ï¿½ï¿½.");
=======
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).getName().equals(check)) {
				System.out.println("°í°´´ÔÀÇ ÀüÈ­¹øÈ£(µÚÀÇ ³×ÀÚ¸®)¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
				numcheck = sc.nextInt();
				if (numcheck == Integer.parseInt(al.get(i).getNum()) % 10000)
					System.out.println("°í°´´ÔÀÇ ¾ÆÀÌµð´Â" + al.get(i).getId() + "ÀÔ´Ï´Ù.");
				else
					System.out.println("Àß¸øÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
			} else
				System.out.println("°í°´´ÔÀÇ ¼ºÇÔÀ¸·Î °¡ÀÔÁ¤º¸°¡ ¾ø½À´Ï´Ù.");
		}
		// ÀÌ¸§, ¹øÈ£·Î Ã£±â
		// ÀÌ¸§ + ¹øÈ£ µÞ 4ÀÚ¸®
	}

	void changepw() {
		// ¾ÆÀÌµð, ¹øÈ£(11ÀÚ¸®)ÀÔ·Â ÈÄ
		// ºñ¹Ð¹øÈ£ »õ·Î ÀÔ·Â
		for (int i = 0; i < al.size(); i++) {
			System.out.println("°í°´´ÔÀÇ ¾ÆÀÌµðÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä");
			check = sc.next();
			if (check.equals(al.get(i).getId())) {
				System.out.println("°í°´´ÔÀÇ ÀüÈ­¹øÈ£ 11 ÀÚ¸®¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
				check = sc.next();
				if (check.equals("010" + al.get(i).getNum())) {
					System.out.println("¹Ù²Ù½Ç ºñ¹Ð¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
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
			System.out.println("1. ï¿½Î±ï¿½ï¿½ï¿½");
			System.out.println("2. È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½");
			System.out.println("3. Ã£ï¿½ï¿½");
			System.out.println("4. ï¿½Î±ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ï°ï¿½ ï¿½Ö¹ï¿½ï¿½Ï±ï¿½");
=======
		while (login == false) {
			System.out.println("1. ·Î±×ÀÎ");
			System.out.println("2. È¸¿ø°¡ÀÔ");
			System.out.println("3. Ã£±â");
			System.out.println("4. ·Î±×ÀÎ ¾ÈÇÏ°í ÁÖ¹®ÇÏ±â");
>>>>>>> 517a6ba6fd5bf87b84fe66a090666a8a64da98a9:membership/MemberEdit.java
			choice = sc.nextInt();
			if (choice == 1) {
				login();

			}
			if (choice == 2) {
				signin();
<<<<<<< HEAD:megacoffee/src/membership/MemberEdit.java
			if(choice == 3) {
				System.out.println("1. ï¿½ï¿½ï¿½Ìµï¿½ Ã£ï¿½ï¿½");
				System.out.println("2. ï¿½ï¿½Ð¹ï¿½È£ ï¿½ï¿½ï¿½ï¿½");
=======
			}
			if (choice == 3) {
				System.out.println("1. ¾ÆÀÌµð Ã£±â");
				System.out.println("2. ºñ¹Ð¹øÈ£ º¯°æ");
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
