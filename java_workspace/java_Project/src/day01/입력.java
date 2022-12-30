package day01;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		//Scanner : 클래스 => 콘솔에서 값을 입력받을 수 있게해주는 클래스
		/* 내가 입력한 값이 짝수인지, 홀수인지 판별
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("num1을 입력하세요.");
		int num1 = scan.nextInt();
		if(num1 % 2 ==0) {
			System.out.println(num1 + ": 짝수");
		}else {
			System.out.println(num1 + ": 홀수");
		}
		/* num2를 입력받아 num2가 양수, 음수, 0인지 판별하시오.
		 * 
		 * */
		System.out.println("num2를 입력하세요.");
		int num2 = scan.nextInt();
		if(num2 > 0) {
			System.out.println("양수!!");
			
		}else if(num2 <0) {
			System.out.println("음수!!");
		}else {
			System.out.println("0입니다.~!!");
		}
		
		
		scan.close();
	}

}
