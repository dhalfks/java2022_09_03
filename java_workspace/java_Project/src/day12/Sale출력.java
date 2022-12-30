package day12;

import java.util.Scanner;

public class Sale출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		SaleManager pm = new SaleManager();
		int menu = -1;
		do {
			pm.printMenu(); //화면 출력
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: pm.add(scan); break;
			case 2: pm.printProduct(); break;
			case 3: 
				System.out.println("주문 메뉴명 : ");
				String name = scan.next();
				System.out.println("주문 수량 : ");
				int count = scan.nextInt();
				pm.orderPick(name, count);
				break;
			case 4: pm.printOrder(); break;
			case 5: break;
			default:
				System.out.println("메뉴오류~!!");
			}
		}while(menu != 5);
		System.out.println("프로그램 종료!!");
		scan.close();
	}

}
