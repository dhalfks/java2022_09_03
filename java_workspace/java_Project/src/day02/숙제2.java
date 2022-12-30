package day02;

import java.util.Scanner;

public class 숙제2 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤 수 하나를 생성하여 맞추는 게임.
		 * 예) 컴퓨터가 생성한 랜덤수 : 45
		 * 입력: 10
		 * up~!!
		 * 입력: 30
		 * up~!!
		 * 입력: 46
		 * down~!!
		 * 입력: 45
		 * 정답입니다.~!!
		 * 클럽에 제출
		 * */
		/* 1. 랜덤수 생성
		 * 2. 스케너를 열기
		 * 3. 반복문(while) -> 입력받기
		 * 4. 랜덤 입력받은 값 비교 (if)
		 * */
		//1~50까지의 랜덤수를 생성
		int random = (int)(Math.random()*50)+1; 
		Scanner scan = new Scanner(System.in);
		//System.out.println(random);
		int count=0, num=0;  //입력받을 변수 초기화 준비
		
		//반복문 열기
		while(num != random) {
			// 정답을 입력받기
			System.out.println("입력 : ");
			num = scan.nextInt();
			count++;
			//비교
			if(num > random) {
				System.out.println("down~!!");
			}else if(num < random) {
				System.out.println("up~!!");
			}else {
				System.out.println("정답~!!");
				
			}
		}

	}

}
