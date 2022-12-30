package studentManager;

import java.util.Scanner;

public class 수강관리프로그램 {

	public static void main(String[] args) {
		/* 수강관리프로그램 - main
		 * --메뉴--
		 * 1.학생등록
		 * 2.학생확인(학생리스트)
		 * 3.학생검색
		 * 4.수강신청
		 * 5.수강철회
		 * 6.종료
		 * */
		StudentManager sm = new StudentManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			sm.printMenu();
			menu = scan.nextInt();
			
			//메뉴에 대한 구현
			switch(menu) {
			case 1: sm.insertStudent(scan); break;
			case 2: sm.printStudent(); break;
			case 3: sm.searchStudent(scan); break;
			case 4: sm.registerSubject(scan); break;
			case 5: sm.deleteSubject(scan); break;
			case 6: break;
			default:
				sm.printAlert();
			}
		}while(menu != 6);
		sm.printExit();
		scan.close();
	}

}
