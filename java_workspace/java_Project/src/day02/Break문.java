package day02;

import java.util.Scanner;

public class Break문 {

	public static void main(String[] args) {
		/* break문 : 반복문을 빠져나오게 하는 키워드.
		 * - 반복문에서 break는 조건(if문)을 동반하게 된다. 
		 * */
		//1~10까지 출력 
		//초기화 1 ~ 무한대 1씩 증가
		//조건 i가 10이되면 break;
		/* 초기값 : 1부터,
		 * 조건식 : 생략.
		 * 증감식 : 1씩증가
		 * 실행문 : 출력 , 조건 => i가 10이되면 break; 
		 * */
		for(int i=1; ; i++) {
			System.out.print(i+" ");
			if(i==10) {
				break;
			}
		}
		
		/* 한글자를 입력받아 글자를 출력.
		 * y를 입력받으면 종료.
		 * 초기값 : 생략
		 * 조건식 : 생략
		 * 증감식 : 생략  // 무한루프
		 * 실행문 : 실행  조건 => y를 입력받으면 break;
		 * */
		System.out.println();// 줄바꿈
		System.out.println("-------------");
		Scanner scan = new Scanner(System.in);
		for(;;) { //무한루프
			System.out.println("문자를 입력해주세요.(y/Y:종료)");
			char ch = scan.next().charAt(0);
			System.out.println(ch);
			if(ch=='y' || ch=='Y') {
				System.out.println("종료!!");
				break;
			}
		}
		
		
		scan.close();
		
	}

}
