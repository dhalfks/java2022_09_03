package lotto;

import java.util.Scanner;

public class 로또프로그램 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int arr[] = {1,5,7,9,4,6};
//		Lotto l = new Lotto();
//		l.insertNumber(arr);
//		System.out.println(l);
		
		LottoManager lm = new LottoManager();
		int menu=0;
		do {
			lm.printMenu();
			menu = scan.nextInt();
			/* ---menu---
			1. 로또 번호 생성 (수동) : 사용자가 직접 입력          => createLotto(scan)
			2. 로또 번호 생성 (자동) : Random                => createLottoAuto()
			3. 당첨번호 입력(수동, 자동) : 사용자가 직접 입력    => insertLotto(scan)
			4. 당첨번호(내역) 확인                        => checkLotto()
			(현재회차 당첨번호 : 가장 마지막에 발생한당첨번호)
			5. 당첨번호 목록 확인(전체)                    =>printLotto()
			6. 종료
			 * */
			switch(menu) {
			case 1: lm.createLotto(scan); break;
			case 2: lm.createLottoAuto(); break;
			case 3: lm.insertLottoAuto(); break; 
			case 4: lm.checkLotto(); break;
			case 5: lm.printLotto(); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴~!!");
			}
		}while(menu != 6);
		System.out.println("프로그램 종료~!!");
		
		scan.close();

	}

}
