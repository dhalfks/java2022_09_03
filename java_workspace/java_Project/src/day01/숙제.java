package day01;

public class 숙제 {

	public static void main(String[] args) {
		// Math.random을 이용하여 1~7까지 발생시켜
		// 1=일, 2=월, ... 7=토 요일을 출력
		// if문으로도 구성, switch문 둘다 구성.
		// 클럽에 제출
		
		int random = (int) (Math.random()*7)+1;  //1~7까지
		
		if(random ==1) {
			System.out.println("일요일");
		}else if(random ==2) {
			System.out.println("월요일");
		}else if(random==3) {
			System.out.println("화요일");
		}else if(random==4) {
			System.out.println("수요일");
		}else if(random==5) {
			System.out.println("목요일");
		}else if(random==6) {
			System.out.println("금요일");
		}else if(random==7){
			System.out.println("토요일");
		}else {
			System.out.println("잘못된 요일!!");
		}
		
		switch(random) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		default :
			System.out.println("잘못된 요일~!!"); break;
		}

	}

}
