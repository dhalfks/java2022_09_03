package day02;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* num를 입력받아 num의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 12 입력  1,2,3,4,6,12
		 * 초기화 : 1부터
		 * 조건식 : 입력받은 num까지
		 * 증감식 : 하나씩 증가
		 * 실행문 : num를 나누어 떨어지는지 확인 후 출력
		 * 			=> num를 i로 나누었을 때 나머지가 0인지 체크
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) { // 약수 조건
				System.out.print(i+" ");
			}
		}
		
		scan.close();

	}

}
