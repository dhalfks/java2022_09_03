package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProManager {
	private ArrayList<Product> menu = new ArrayList<>(); //메뉴등록 리스트
	private ArrayList<Product> order = new ArrayList<>(); //주문 리스트
	
	//제품추가메서드
	//스케너로 입력받은 메뉴와 가격을 menu리스트에 추가
	//멤버변수로 선언된 리스트를 채우는 기능
	//매개변수 : 스케너 , 리턴타입 : void
	//메서드명 : add()
	public void add(Scanner scan) {
		String menu = null;
		int price = 0;
		System.out.println("제품명: ");
		menu = scan.next();
		System.out.println("가격: ");
		price = scan.nextInt();
		//product class 형식의 객체를 생성해서 (생성자로 메뉴와 가격을 넣어 생성)
		Product p = new Product(menu, price);
		this.menu.add(p); //product class 형식의 메뉴를 추가
	}
	
	//메뉴리스트 출력
	//리턴 : void, 매개변수 : 없음
	//메서드명 : printProduct()
	public void printProduct() {
		for(Product tmp : menu) {  //각각 메뉴 한줄씩 출력
			System.out.println(tmp);
		}
	}
	
	//제품 주문
	//리턴 : void, 매개변수 : String 메뉴, int 수량
	//메서드명:orderPick()
	public void orderPick(String name, int count) {
		for(int i=0; i<menu.size(); i++ ) { //menu List 값을 순차 검색
			String ProductMenu = menu.get(i).getMenu(); //0번지에 추가된 메뉴명
			int ProductPrice = menu.get(i).getPrice(); //0번지에 추가된 가격
			if(ProductMenu.equals(name)) { //i번지 메뉴명과 입력받은 메뉴명이 같은지 확인 
				//클래스 객체 생성 후 order List에 추가
				Product p = new Product(ProductMenu, (ProductPrice*count));
				order.add(p);
			}
		}
	}
	
	//주문내역 출력
	//리턴 : void, 매개변수 : 없음. 매서드명 : printOrder()
	//지불총금액을 계산
	public void printOrder() {
		int sum = 0;
		for(Product p : order) {
			System.out.println(p);
			sum+= p.getPrice(); // price : 가격 * 수량 
		}
		System.out.println("지불총금액 : " + sum);
	}
	
	//main화면 print 메서드
	public void printMenu() {
		System.out.println(">>Menu<<");
		System.out.println("1.제품추가");
		System.out.println("2.제품리스트보기");
		System.out.println("3.제품주문");
		System.out.println("4.주문내역");
		System.out.println("5.프로그램종료");
		System.out.println(">> menu : ");
	}
	
	
}
