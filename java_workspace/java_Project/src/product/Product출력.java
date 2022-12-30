package product;

import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
		// product를 class로 구성하여 상품을 등록/출력
		
		/* Manager로 구성
		 * >> menu
		 * 1.제품추가(메뉴추가)  => void add()
		 * 2.제품리스트보기(메뉴판 출력) => void printProduct()
		 * 3.제품주문(제품명,수량) => void orderPick(String name, int count)
		 * 4.주문내역(주문리스트 출력) 지불총금액 계산 => void printOrder()
		 * 5.프로그램 종료
		 * 
		 * 메뉴 등록(y/n) y
		 * 메뉴 : 햄버거
		 * 가격 : 10000
		 * 
		 * 제품주문(String menu, int count) 
		 * 햄버거 5
		 * list에서 해당 햄버거를 찾아 price를 가져와서 수량을 곱해서 order price로 저장
		 * */
		ProManager pm = new ProManager();
		Scanner scan = new Scanner(System.in);
		
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
