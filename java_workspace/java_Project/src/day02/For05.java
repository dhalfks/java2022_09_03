package day02;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		/* 최소공배수 구하기
		 * 공배수 : 두 정수에서 공통적으로 있는 배수
		 * 10배수 : 10 20 30 40 ...
		 * 15배수 : 15 30 45 60...
		 * 10과 15의 공배수 : 30 60 90...
		 * 최소 공배수 : 30
		 * */
		/* num1, num2를 입력받아 최소 공배수를 출력하는 예제
		 * 반복횟수 : i는 num1부터 무한까지 num1씩 증가
		 * 초기값 : i = num1
		 * 조건식 : 없음.
		 * 증감식 : i=i+num1
		 * 실행문 : i를 num1으로 나누었을 때 나머지가 0인지 확인. &&
		 * 			i를 num2로 나누었을 때 나머지가 0인지 확인
		 * 첫번째로 만족하는 값이 최소공배수
		 * 찾았다면 break;
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for(int i = num1; ; i=i+num1) {
			if(i % num1 == 0 && i % num2 ==0) {
				System.out.println("두 수의 최소공배수 : "+ i);
				break;
			}
		}
		
		scan.close();
		

	}

}
