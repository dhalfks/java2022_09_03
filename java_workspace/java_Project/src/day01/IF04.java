package day01;

import java.util.Scanner;

public class IF04 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 2의 배수인지, 3의 배수인지, 6의 배수인지 출력
		 * if(조건식){
		 * 실행문;
		 * }else if(조건식2){
		 * 실행문2;
		 * }
		 * 
		 * if(조건식){
		 * 	if(조건식){
		 * 실행문;
		 * 	}
		 * 
		 * }
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num1 = scan.nextInt();
		if(num1 % 2==0) { // 2의 배수가 되는지 체크
			System.out.println(num1 + ": 2의배수");
			if(num1 % 3 == 0) {
				System.out.println(num1+": 6의배수");
			}
		}
		
		scan.close();

	}

}
