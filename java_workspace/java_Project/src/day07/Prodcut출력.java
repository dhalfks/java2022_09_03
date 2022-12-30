package day07;

import java.util.Scanner;

public class Prodcut출력 {

	public static void main(String[] args) {
		Product1[] pro = new Product1[10];
		Scanner scan = new Scanner(System.in);
		char menu = 'y';
		int cnt=0;
		
		while(menu != 'n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu = scan.next().charAt(0);
			
			if(menu == 'y') {
				System.out.println("상품명 : ");
				String name = scan.next();
				System.out.println("가격 : ");
				int price = scan.nextInt();
				pro[cnt]=new Product1();
				pro[cnt].insertProdcut(name, price);
				cnt++;
			}else {
				System.out.println("y/n만 입력가능합니다.");
			}
		}
		System.out.println("--등록된 제품 리스트--");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+". " +pro[i]);
		}
	}

}
